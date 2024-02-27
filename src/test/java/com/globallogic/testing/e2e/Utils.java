package com.globallogic.testing.e2e;

import cucumber.api.Scenario;
import org.apache.commons.io.FileUtils;
import org.jasypt.util.text.BasicTextEncryptor;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

public class Utils {

    public static final String SELENIUM_URL;
    public static final String DEFAULT_SELENIUM_GRID_URL = "selenium-hub-dev.run-caas.rd.corpintra.net/wd/hub";
    public static final String ERROR_MESSAGE_INVALID_SELENIUM_CREDENTIALS = "Selenium Credentials have to be specified with" +
            " 'selenium_credentials_username' and 'selenium_credentials_password'";
    private static final Logger LOGGER = LoggerFactory.getLogger(Utils.class);
    private static final String ERROR_MESSAGE_DECRYPTION_PROPRTY_MISSING = "Decryption system property missing!";
    public static List<String> ACTIVE_BROWSERS = Arrays.asList("chrome", "firefox", "edge");

    static {
        String seleniumUrl = "https://" + DEFAULT_SELENIUM_GRID_URL; //System.getenv("SELENIUM_URL");
        String seleniumUserUsername = System.getenv("selenium_credentials_username");
        String seleniumUserPassword = System.getenv("selenium_credentials_password");

        if (seleniumUrl == null) {
            LOGGER.info("No SELENIUM_URL is defined, using default Selenium Url ");
            if (seleniumUserUsername == null || seleniumUserPassword == null) {
                LOGGER.error(ERROR_MESSAGE_INVALID_SELENIUM_CREDENTIALS);
                SELENIUM_URL = null;
            } else {
                SELENIUM_URL = "http://" + seleniumUserUsername + ":" + seleniumUserPassword + "@" + DEFAULT_SELENIUM_GRID_URL;
            }
        } else {
            SELENIUM_URL = seleniumUrl;
        }

        String seleniumBrowsers = System.getenv("SELENIUM_ACTIVE_BROWSERS");
        if (seleniumBrowsers != null) {
            ACTIVE_BROWSERS = Arrays.asList(seleniumBrowsers.split(","));

        }
    }

    public static String getBrowserName(WebDriver driver) {
        if (driver instanceof RemoteWebDriver) {
            return ((RemoteWebDriver) driver).getCapabilities().getBrowserName();
        } else {
            return "";
        }
    }

    public static void createScreenshot(TakesScreenshot driver, Scenario scenario, String browserName) {
        try {
            String name = scenario.getName() + "_FAILED" + System.currentTimeMillis();
            byte[] screenshotAsBytes = driver.getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshotAsBytes, "image/png");
            File scrFile = driver.getScreenshotAs(OutputType.FILE);
            String nameSanitized = name.replaceAll("\"", "");
            FileUtils.copyFile(scrFile, new File("target/e2e-test-screenshots/" + browserName + " " + nameSanitized + ".png"));
        } catch (IOException | RuntimeException e) {
            LOGGER.error("Error while creating screenshot", e);
        }
    }

    public static void createScreenshotIfFailed(WebDriver driver, Scenario scenario) {
        if (scenario.isFailed() && driver instanceof TakesScreenshot) {
            String browserName = getBrowserName(driver);
            Utils.createScreenshot((TakesScreenshot) driver, scenario, browserName);
        }
    }

    public static WebDriver getWebDriver(WebDriverMode webDriverMode, Browser browser) {
        String webDriverOption = webDriverMode + "_" + browser;
        LOGGER.info("getWebDriver for webdriver options: " + webDriverOption);
        WebDriver driver = null;

        switch (webDriverOption) {
            case "local_chrome":
                System.setProperty("webdriver.chrome.driver", "browserdrivers/chromedriver.exe");
                ChromeOptions optionsChrome = new ChromeOptions();
                optionsChrome.setAcceptInsecureCerts(true);
                DesiredCapabilities handleSSLErrorChrome = new DesiredCapabilities();
                handleSSLErrorChrome.setCapability(ChromeOptions.CAPABILITY, optionsChrome);
                optionsChrome.merge(handleSSLErrorChrome);
                driver = new ChromeDriver(optionsChrome);
                break;
            case "local_firefox":
                FirefoxOptions optionsFirefox= new FirefoxOptions();
                optionsFirefox.setBinary("C:/Program Files/Mozilla Firefox/firefox.exe");
                optionsFirefox.setPlatformName("WINDOWS");
                optionsFirefox.setBrowserVersion("123.0");
                driver = new FirefoxDriver(optionsFirefox);
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
                break;
            case "local_edge":
                System.setProperty("webdriver.edge.driver",
                        "browserdrivers\\msedgedriver.exe");
                EdgeOptions optionsEdge = new EdgeOptions();
                optionsEdge.setAcceptInsecureCerts(true);
                DesiredCapabilities handleSSLErrorEdge= new DesiredCapabilities();
                handleSSLErrorEdge.setCapability(EdgeOptions.CAPABILITY, optionsEdge);
                optionsEdge.merge(handleSSLErrorEdge);
                driver = new EdgeDriver(optionsEdge);
                break;
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
        driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(10));

        return driver;

    }

    public static String getPass() {

        String decryptPass = System.getProperty("decryptPass");

        if (decryptPass == null || decryptPass.trim().isEmpty()) {
            throw new IllegalStateException(ERROR_MESSAGE_DECRYPTION_PROPRTY_MISSING);
        }

        try (InputStream input = Utils.class.getClassLoader().getResourceAsStream("encrypted.properties")) {

            if (input == null) {
                System.out.println("Sorry, unable to find encrypted.properties");
                return "";
            }

            Properties prop = new Properties();
            prop.load(input);

            BasicTextEncryptor textEncryptor = new BasicTextEncryptor();
            textEncryptor.setPasswordCharArray(decryptPass.toCharArray());
            return textEncryptor.decrypt(prop.getProperty("encrypted.pass"));

        } catch (IOException ex) {
            ex.printStackTrace();
        }

        return "";
    }

    public enum WebDriverMode {
        LOCAL;

        @Override
        public String toString() {
            return super.toString().toLowerCase();
        }
    }

    public enum Browser {
        CHROME, FIREFOX, EDGE;

        @Override
        public String toString() {
            return super.toString().toLowerCase();
        }
    }
}
