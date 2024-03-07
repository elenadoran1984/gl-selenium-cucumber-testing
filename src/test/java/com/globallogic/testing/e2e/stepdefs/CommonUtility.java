package com.globallogic.testing.e2e.stepdefs;

import com.globallogic.testing.e2e.TestContext;
import com.globallogic.testing.e2e.stepdefs.globallogicweb.helper.FindByElementsRomaniaEnglishHomePage;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class CommonUtility {

    private final TestContext testContext;

    public CommonUtility(TestContext testContext) {
        if (testContext == null)
            throw new InvalidArgumentException("testContext argument must not be null!");
        this.testContext = testContext;
    }

    public WebElement findElementBy(By by) {
        List<WebElement> webElements = testContext.getDriver().findElements(by);
        if (webElements.isEmpty()) {
            throw new NotFoundException("Element not found for: " + by.toString());
        }
        if (webElements.size() > 1) {
            System.out.println("Multiple element found (" + webElements.size() + ") for By condition:  " + by.toString() + " returning the first");
        }
        return webElements.get(0);
    }

    public List<WebElement> findElementsBy(By by) {
        return testContext.getDriver().findElements(by);
    }

    public List<WebElement> findElements(By by) {
        return testContext.getDriver().findElements(by);
    }

    public WebElement waitElementBy(By by) {
        if (testContext.getWait().isEmpty())
            throw new IllegalStateException("Test context is missing the wait instance!");

        WebElement element = testContext.getWait().get().until(ExpectedConditions.visibilityOfElementLocated(by));
        try {
            element.isDisplayed();
        } catch (StaleElementReferenceException ex) {
            testContext.getWait().get().until(ExpectedConditions.refreshed(ExpectedConditions.stalenessOf(element)));
            element = testContext.getWait().get().until(ExpectedConditions.visibilityOfElementLocated(by));
        }

        return element;
    }

//    public WebElement socialPagesBy(By by){
//        WebDriverWait wait = new WebDriverWait(testContext.getDriver(), Duration.ofSeconds(10));
//        WebElement socialPages = wait.until(ExpectedConditions.visibilityOfElementLocated(by));
//
//        return socialPages;
//    }

    public boolean isElementEnabled(String elementId) {
        WebElement webElement = findElementBy(By.id(elementId));
        return webElement.isEnabled();
    }

    public void sleep() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException();
        }
    }
}
