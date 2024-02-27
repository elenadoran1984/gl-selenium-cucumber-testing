package com.globallogic.testing.e2d.stepdefs.globallogicweb.helper;

import com.globallogic.testing.e2d.TestContext;
import com.globallogic.testing.e2d.stepdefs.CommonUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FindByElementsGlobalLogicHomeRomaniaEnglishPage {

    private final CommonUtility utility;
    private final TestContext testContext;

    public FindByElementsGlobalLogicHomeRomaniaEnglishPage(TestContext testContext) {
        this.testContext = testContext;
        utility = new CommonUtility(testContext);
    }

    private WebElement servicesOptionPrimaryMenu;
    private WebElement workOptionPrimaryMenu;
    private WebElement insightsOptionPrimaryMenu;
    private WebElement careersOptionPrimaryMenu;
    private WebElement aboutOptionPrimaryMenu;
    private WebElement contactOptionPrimaryMenu;
    private WebElement footerMenuBottom;

    private String servicesPrimaryMenu = "#primary-menu > li:nth-child(1) > a";
    private String workPrimaryMenu = "#primary-menu > li:nth-child(2) > a";
    private String insightsPrimaryMenu = "#primary-menu > li:nth-child(3) > a";
    private String careersPrimaryMenu = "#primary-menu > li:nth-child(4) > a";
    private String aboutPrimaryMenu = "#primary-menu > li:nth-child(5) > a";
    private String contactPrimaryMenu = "#primary-menu > li:nth-child(6) > a";

    private String servicesFooterMenu = "#main > footer > section.footer-second > div > div > div.col-md-2.col-4.order-2.order-sm-1.order-md-1.order-lg-1 > div > div #menu-footer-menu > li:nth-child(1) > a";
    private String workFooterMenu= "#main > footer > section.footer-second > div > div > div.col-md-2.col-4.order-2.order-sm-1.order-md-1.order-lg-1 > div > div #menu-footer-menu > li:nth-child(2) > a";
    private String insightsFooterMenu = "#main > footer > section.footer-second > div > div > div.col-md-2.col-4.order-2.order-sm-1.order-md-1.order-lg-1 > div > div #menu-footer-menu > li:nth-child(3) > a";
    private String careersFooterMenu = "#main > footer > section.footer-second > div > div > div.col-md-2.col-4.order-2.order-sm-1.order-md-1.order-lg-1 > div > div #menu-footer-menu > li:nth-child(4) > a";
    private String aboutFooterMenu = "#main > footer > section.footer-second > div > div > div.col-md-5.col-8.order-3.oorder-sm-2.order-md-2.order-lg-2 > div > div #menu-footer-menu-two> li:nth-child(1) > a";
    private String privacyFooterMenu = "#main > footer > section.footer-second > div > div > div.col-md-5.col-8.order-3.oorder-sm-2.order-md-2.order-lg-2 > div > div #menu-footer-menu-two> li:nth-child(2) > a";
    private String complianceDisclosuresFooterMenu = "#main > footer > section.footer-second > div > div > div.col-md-5.col-8.order-3.oorder-sm-2.order-md-2.order-lg-2 > div > div #menu-footer-menu-two> li:nth-child(3) > a";
    private String contactFooterMenu =               "#main > footer > section.footer-second > div > div > div.col-md-5.col-8.order-3.oorder-sm-2.order-md-2.order-lg-2 > div > div #menu-footer-menu-two> li:nth-child(4) > a";

    public void servicesOptionPrimaryMenuClick(){
        servicesOptionPrimaryMenu = utility.findElementBy(By.cssSelector(servicesPrimaryMenu));
        servicesOptionPrimaryMenu.click();
    }

    public void workOptionPrimaryMenuClick(){
        workOptionPrimaryMenu = utility.findElementBy(By.cssSelector(workPrimaryMenu));
        workOptionPrimaryMenu.click();
    }

    public void insightOptionPrimaryMenuClick(){
        insightsOptionPrimaryMenu = utility.findElementBy(By.cssSelector(insightsPrimaryMenu));
        insightsOptionPrimaryMenu.click();
    }

    public void careersOptionPrimaryMenuClick(){
        careersOptionPrimaryMenu = utility.findElementBy(By.cssSelector(careersPrimaryMenu));
        careersOptionPrimaryMenu.click();
    }

    public void aboutOptionPrimaryMenuClick(){
        aboutOptionPrimaryMenu = utility.findElementBy(By.cssSelector(aboutPrimaryMenu));
        aboutOptionPrimaryMenu.click();
    }

    public void contactOptionPrimaryMenuClick(){
        contactOptionPrimaryMenu = utility.findElementBy(By.cssSelector(contactPrimaryMenu));
        contactOptionPrimaryMenu.click();
    }

    public void footerMenuScroll() {
        footerMenuBottom = utility.findElementBy(By.cssSelector("#main > footer > section.footer-second"));
        String script = "arguments[0].scrollIntoView();";
        ((JavascriptExecutor) testContext.getDriver()).executeScript(script, footerMenuBottom);
    }

    public void servicesOptionFooterMenuClick(){
        WebDriverWait wait = new WebDriverWait(testContext.getDriver(), Duration.ofSeconds(5));
        JavascriptExecutor js = (JavascriptExecutor)testContext.getDriver();
        WebElement element =  wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(servicesFooterMenu)));
        js.executeScript("arguments[0].click();", element);
    }

    public void workOptionFooterMenuClick(){
        WebDriverWait wait = new WebDriverWait(testContext.getDriver(), Duration.ofSeconds(5));
        JavascriptExecutor js = (JavascriptExecutor)testContext.getDriver();
        WebElement element =  wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(workFooterMenu)));
        js.executeScript("arguments[0].click();", element);
    }

    public void insightOptionFooterMenuClick(){
        WebDriverWait wait = new WebDriverWait(testContext.getDriver(), Duration.ofSeconds(5));
        JavascriptExecutor js = (JavascriptExecutor)testContext.getDriver();
        WebElement element =  wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(insightsFooterMenu)));
        js.executeScript("arguments[0].click();", element);
    }

    public void careersOptionFooterMenuClick(){
        WebDriverWait wait = new WebDriverWait(testContext.getDriver(), Duration.ofSeconds(5));
        JavascriptExecutor js = (JavascriptExecutor)testContext.getDriver();
        WebElement element =  wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(careersFooterMenu)));
        js.executeScript("arguments[0].click();", element);
    }

    public void aboutOptionFooterMenuClick(){
        WebDriverWait wait = new WebDriverWait(testContext.getDriver(), Duration.ofSeconds(5));
        JavascriptExecutor js = (JavascriptExecutor)testContext.getDriver();
        WebElement element =  wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(aboutFooterMenu)));
        js.executeScript("arguments[0].click();", element);
    }

    public void privacyOptionFooterMenuClick(){
        WebDriverWait wait = new WebDriverWait(testContext.getDriver(), Duration.ofSeconds(5));
        JavascriptExecutor js = (JavascriptExecutor)testContext.getDriver();
        WebElement element =  wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(privacyFooterMenu)));
        js.executeScript("arguments[0].click();", element);
    }

    public void complianceDisclosuresOptionFooterMenuClick(){
        WebDriverWait wait = new WebDriverWait(testContext.getDriver(), Duration.ofSeconds(5));
        JavascriptExecutor js = (JavascriptExecutor)testContext.getDriver();
        WebElement element =  wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(complianceDisclosuresFooterMenu)));
        js.executeScript("arguments[0].click();", element);
    }

    public void contactOptionFooterMenuClick(){
        WebDriverWait wait = new WebDriverWait(testContext.getDriver(), Duration.ofSeconds(5));
        JavascriptExecutor js = (JavascriptExecutor)testContext.getDriver();
        WebElement element =  wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(contactFooterMenu)));
        js.executeScript("arguments[0].click();", element);
    }
}