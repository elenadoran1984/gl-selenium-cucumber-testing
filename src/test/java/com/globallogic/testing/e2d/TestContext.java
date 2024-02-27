package com.globallogic.testing.e2d;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Optional;

/**
 * Central class to hold information collected and used by all Cucumber Step Definitions.
 */
public class TestContext {

    private WebDriver driver;

    private String webDriverOption;

    private SeleniumUtils.WebDriverMode webDriverMode;

    private WebDriverWait wait;


    public TestContext() {
    }


    public WebDriver getDriver() {
        return driver;
    }

    public TestContext setDriver(WebDriver driver) {
        this.driver = driver;
        return this;
    }

    public String getWebDriverOption() {
        return webDriverOption;
    }

    public void setWebDriverOption(String webDriverOption) {
        this.webDriverOption = webDriverOption;
    }

    public SeleniumUtils.WebDriverMode getWebDriverMode() {
        return webDriverMode;
    }

    public void setWebDriverMode(SeleniumUtils.WebDriverMode webDriverMode) {
        this.webDriverMode = webDriverMode;
    }

    public Optional<WebDriverWait> getWait() {
        if (wait == null)
            return Optional.empty();

        return Optional.of(wait);
    }

    public void setWait(WebDriverWait wait) {
        this.wait = wait;
    }
}
