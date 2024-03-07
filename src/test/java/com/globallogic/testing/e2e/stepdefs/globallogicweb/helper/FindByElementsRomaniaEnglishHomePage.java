package com.globallogic.testing.e2e.stepdefs.globallogicweb.helper;

import com.globallogic.testing.e2e.TestContext;
import com.globallogic.testing.e2e.stepdefs.CommonUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FindByElementsRomaniaEnglishHomePage {

    private final CommonUtility utility;
    private final TestContext testContext;
    private Object element;

    public FindByElementsRomaniaEnglishHomePage(TestContext testContext) {
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

    private WebElement acceptCookie;

    private String servicesPrimaryMenu = "#primary-menu > li:nth-child(1) > a";
    private String workPrimaryMenu = "#primary-menu > li:nth-child(2) > a";
    private String insightsPrimaryMenu = "#primary-menu > li:nth-child(3) > a";
    private String careersPrimaryMenu = "#primary-menu > li:nth-child(4) > a";
    private String aboutPrimaryMenu = "#primary-menu > li:nth-child(5) > a";
    private String contactPrimaryMenu = "#primary-menu > li:nth-child(6) > a";

    private String footerMenu = "#main > footer > section.footer-second";

    private String servicesFooterMenu = "#main > footer > section.footer-second > div > div > div.col-md-2.col-4.order-2.order-sm-1.order-md-1.order-lg-1 > div > div #menu-footer-menu > li:nth-child(1) > a";
    private String workFooterMenu= "#main > footer > section.footer-second > div > div > div.col-md-2.col-4.order-2.order-sm-1.order-md-1.order-lg-1 > div > div #menu-footer-menu > li:nth-child(2) > a";
    private String insightsFooterMenu = "#main > footer > section.footer-second > div > div > div.col-md-2.col-4.order-2.order-sm-1.order-md-1.order-lg-1 > div > div #menu-footer-menu > li:nth-child(3) > a";
    private String careersFooterMenu = "#main > footer > section.footer-second > div > div > div.col-md-2.col-4.order-2.order-sm-1.order-md-1.order-lg-1 > div > div #menu-footer-menu > li:nth-child(4) > a";
    private String aboutFooterMenu = "#main > footer > section.footer-second > div > div > div.col-md-5.col-8.order-3.oorder-sm-2.order-md-2.order-lg-2 > div > div #menu-footer-menu-two> li:nth-child(1) > a";
    private String privacyFooterMenu = "#main > footer > section.footer-second > div > div > div.col-md-5.col-8.order-3.oorder-sm-2.order-md-2.order-lg-2 > div > div #menu-footer-menu-two> li:nth-child(2) > a";
    private String complianceDisclosuresFooterMenu = "#main > footer > section.footer-second > div > div > div.col-md-5.col-8.order-3.oorder-sm-2.order-md-2.order-lg-2 > div > div #menu-footer-menu-two> li:nth-child(3) > a";
    private String contactFooterMenu =               "#main > footer > section.footer-second > div > div > div.col-md-5.col-8.order-3.oorder-sm-2.order-md-2.order-lg-2 > div > div #menu-footer-menu-two> li:nth-child(4) > a";

    public String footerSecond = "#main > footer > section.footer-second > div > div > div.col-md-5.col-8.order-3.oorder-sm-2.order-md-2.order-lg-2";
    public String craft = "our-craft";
    public String subscribe = "#main > footer > section.footer-second > div > div > div.col-md-5.order-1.order-lg-3.order-sm-3.order-md-3.footer-social > div.footer-subscribe";

    public String linkedinSocial = "#main > footer > section.footer-second > div > div > div.col-md-5.order-1.order-lg-3.order-sm-3.order-md-3.footer-social > div.social-icons > a:nth-child(1)";
    public String twitterSocial = "#main > footer > section.footer-second > div > div > div.col-md-5.order-1.order-lg-3.order-sm-3.order-md-3.footer-social > div.social-icons > a:nth-child(2)";
    public String facebookSocial = "#main > footer > section.footer-second > div > div > div.col-md-5.order-1.order-lg-3.order-sm-3.order-md-3.footer-social > div.social-icons > a:nth-child(3)";
    public String youtubeSocial = "#main > footer > section.footer-second > div > div > div.col-md-5.order-1.order-lg-3.order-sm-3.order-md-3.footer-social > div.social-icons > a:nth-child(4)";
    public String instagramSocial = "#main > footer > section.footer-second > div > div > div.col-md-5.order-1.order-lg-3.order-sm-3.order-md-3.footer-social > div.social-icons > a:nth-child(5)";

    public String youtubeCookiesAccept = "#yDmH0d > c-wiz > div > div > div > div.v2Yske > div.CqMh6b > div.qqtRac > div.KZ9vpc > form:nth-child(3) > div > div > button";

    public void youtubeCookiesAcceptClick(){
        acceptCookie = utility.findElementBy(By.cssSelector(youtubeCookiesAccept));
        acceptCookie.click();
    }

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
        footerMenuBottom = utility.findElementBy(By.cssSelector(footerMenu));
        String script = "arguments[0].scrollIntoView();";
        ((JavascriptExecutor) testContext.getDriver()).executeScript(script, footerMenuBottom);
    }

    public void servicesOptionFooterMenuClick(){
//        WebDriverWait wait = new WebDriverWait(testContext.getDriver(), Duration.ofSeconds(5));
//        JavascriptExecutor js = (JavascriptExecutor)testContext.getDriver();
//        WebElement element =  wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(servicesFooterMenu)));
//        js.executeScript("arguments[0].click();", element);

        element = utility.clickArgumentsBy(By.cssSelector(servicesFooterMenu));
    }

    public void workOptionFooterMenuClick(){
        element = utility.clickArgumentsBy(By.cssSelector(workFooterMenu));
    }

    public void insightOptionFooterMenuClick(){
        element = utility.clickArgumentsBy(By.cssSelector(insightsFooterMenu));
    }

    public void careersOptionFooterMenuClick(){
        element = utility.clickArgumentsBy(By.cssSelector(careersFooterMenu));
    }

    public void aboutOptionFooterMenuClick(){
        element = utility.clickArgumentsBy(By.cssSelector(aboutFooterMenu));
    }

    public void privacyOptionFooterMenuClick(){
        element = utility.clickArgumentsBy(By.cssSelector(privacyFooterMenu));
    }

    public void complianceDisclosuresOptionFooterMenuClick(){
        element = utility.clickArgumentsBy(By.cssSelector(complianceDisclosuresFooterMenu));
    }

    public void contactOptionFooterMenuClick(){
        element = utility.clickArgumentsBy(By.cssSelector(contactFooterMenu));
    }

    public void linkedinFooterMenuClick() {
        element = utility.clickArgumentsBy(By.cssSelector(linkedinSocial));
    }

    public void twitterFooterMenuClick() {
        element = utility.clickArgumentsBy(By.cssSelector(twitterSocial));
    }

    public void facebookFooterMenuClick() {
        element = utility.clickArgumentsBy(By.cssSelector(facebookSocial));
    }

    public void youtubeFooterMenuClick() {
        element = utility.clickArgumentsBy(By.cssSelector(youtubeSocial));
    }

    public void instagramFooterMenuClick() {
        element = utility.clickArgumentsBy(By.cssSelector(instagramSocial));
    }

}