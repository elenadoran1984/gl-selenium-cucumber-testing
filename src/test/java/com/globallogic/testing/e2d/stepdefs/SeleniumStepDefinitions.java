package com.globallogic.testing.e2d.stepdefs;

import com.globallogic.testing.e2d.SeleniumUtils;
import com.globallogic.testing.e2d.TestContext;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assume;
import org.openqa.selenium.By;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SeleniumStepDefinitions {

    private static final Logger LOGGER = LoggerFactory.getLogger(SeleniumStepDefinitions.class);

    private final TestContext testContext;
    private WebDriverWait wait;
    private int rowsCountBeforeSave;

    public SeleniumStepDefinitions(TestContext testContext) {
        this.testContext = testContext;
    }

    @After()
    public void closeBrowser(Scenario scenario) {
        if (testContext.getDriver() != null) {
            SeleniumUtils.createScreenshotIfFailed(testContext.getDriver(), scenario);
            testContext.getDriver().quit();
            testContext.setDriver(null);
        }
    }

    @Given("the user navigates to {string} with browser {browser}")
    public void theUserNavigatesToWithBrowse(String url, SeleniumUtils.Browser browser) {
        testContext.setWebDriverOption(testContext.getWebDriverMode() + "_" + browser);
        if (!SeleniumUtils.ACTIVE_BROWSERS.contains(browser.toString())) {
            Assume.assumeTrue(browser + " browser is not yet supported.", false);
        }
        WebDriver driver = SeleniumUtils.getWebDriver(testContext.getWebDriverMode(), browser);
        testContext.setDriver(driver);
        testContext.getDriver().get(url);
        wait = new WebDriverWait(this.testContext.getDriver(), Duration.ofSeconds(15));
    }

    @And("the user logs into the application with user name {string}")
    public void theUserLogsIntoTheApplicationWithUserName(String username) {
        findElementBy(By.id("userid")).click();
        findElementBy(By.id("userid")).sendKeys(username);
        findElementBy(By.id("next-btn")).click();
        findElementBy(By.id("password")).sendKeys(SeleniumUtils.getPass());
        findElementBy(By.id("loginSubmitButton")).click();
    }

    @And("is valid from {string} until {string}")
    public void isValidFromUntil(String validFromDate, String validToDate) {
        findElementBy(By.cssSelector(".form-group:nth-child(2) .i-interface-essential-date-calendar-calendar")).click();
        int selectedDay = calculateCorrectDay(validFromDate);
        findElementBy(By.cssSelector(String.format(".react-datepicker__day--0%02d", selectedDay))).click();

        findElementBy(By.cssSelector(".form-group:nth-child(3) .i-interface-essential-date-calendar-calendar")).click();
        selectedDay = calculateCorrectDay(validToDate);
        findElementBy(By.cssSelector(String.format(".react-datepicker__day--0%02d", selectedDay))).click();

        sleep();
    }

    private int calculateCorrectDay(String arg0) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate inputDate = LocalDate.parse(arg0, formatter);
        LocalDate currentDate = LocalDate.now();
        int timesToCycleRight = (inputDate.getMonthValue() - currentDate.getMonthValue()) + ((inputDate.getYear() - currentDate.getYear()) * 12);
        if (timesToCycleRight > 0) {
            findElementBy(By.cssSelector(".react-datepicker__navigation")).click();
            for (int i = 1; i < timesToCycleRight; i++) {
                findElementBy(By.cssSelector(".react-datepicker__navigation--next")).click();
            }
        }
        return inputDate.getDayOfMonth();
    }

    private void sleep() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException();
        }
    }

    private WebElement findElementBy(By by) {
        List<WebElement> webElements = testContext.getDriver().findElements(by);
        if (webElements.isEmpty()) {
            throw new NotFoundException("Element not found for: " + by.toString());
        }
        if (webElements.size() > 1) {
            LOGGER.warn("Multiple element found (" + webElements.size() + ") for By condition:  " + by.toString() + " returning the first");
        }
        return webElements.get(0);
    }

    private List<WebElement> findElementsBy(By by) {
        return testContext.getDriver().findElements(by);
    }
}
