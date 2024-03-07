package com.globallogic.testing.e2e.stepdefs.globallogicweb;

import com.globallogic.testing.e2e.Utils;
import com.globallogic.testing.e2e.TestContext;
import com.globallogic.testing.e2e.stepdefs.CommonUtility;
import com.globallogic.testing.e2e.stepdefs.WindowManager;
import com.globallogic.testing.e2e.stepdefs.globallogicweb.helper.DataUtility;
import com.globallogic.testing.e2e.stepdefs.globallogicweb.helper.FindByElementsHomePage;
import com.globallogic.testing.e2e.stepdefs.globallogicweb.helper.FindByElementsRomaniaEnglishHomePage;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assume.assumeTrue;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class Stepdefs {

    private static final Logger LOGGER = LoggerFactory.getLogger(Stepdefs.class);
    private final TestContext testContext;
    private final CommonUtility utility;
    private WebDriverWait wait;
    private String requestDescription;

    public Stepdefs(TestContext testContext) {
        this.testContext = testContext;
        utility = new CommonUtility(testContext);
    }

    @After()
    public void closeBrowser(Scenario scenario) {
        requestDescription = null;
        if (testContext.getDriver() != null) {
            Utils.createScreenshotIfFailed(testContext.getDriver(), scenario);
            testContext.getDriver().quit();
            testContext.setDriver(null);
        }
    }

    @Given("I open GlobalLogic Home page on {browser}")
    public void iOpenGlobalLogicHomepageoOnBrowser(Utils.Browser browser) throws InterruptedException {
        testContext.setWebDriverOption(testContext.getWebDriverMode() + "_" + browser);
        if (!Utils.ACTIVE_BROWSERS.contains(browser.toString())) {
            assumeTrue(browser + " browser is not yet supported.", false);
        }
        WebDriver driver = Utils.getWebDriver(testContext.getWebDriverMode(), browser);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        testContext.setDriver(driver);
        try {
            testContext.getDriver().get(DataUtility.HOME_LINK);
        } catch (WebDriverException e) {
            LOGGER.info("Driver:***** EXCEPTION CAUGHT *******");
        }
    }

    private void hoverOverCountryOptions() {
        FindByElementsHomePage element = new FindByElementsHomePage(testContext);
        element.hoverOverCountryOptions();
    }

    @And("I change to Romania English from country options")
    public void iChangeToRomaniaEnglishFromCountryOptions() {
        hoverOverCountryOptions();
        FindByElementsHomePage element = new FindByElementsHomePage(testContext);
        element.selectRomaniaEnglishCountryOption();
    }

    @When("I select Services option from primary menu")
    public void iSelectServicesOptionFromPrimaryMenu() {
        FindByElementsRomaniaEnglishHomePage element = new FindByElementsRomaniaEnglishHomePage(testContext);
        getWindowManager().switchToNewTab();
        element.servicesOptionPrimaryMenuClick();
    }

    @When("I select Work option from primary menu")
    public void iSelectWorkOptionFromPrimaryMenu() {
        FindByElementsRomaniaEnglishHomePage element = new FindByElementsRomaniaEnglishHomePage(testContext);
        getWindowManager().switchToNewTab();
        element.workOptionPrimaryMenuClick();
    }

    @When("I select Insights option from primary menu")
    public void iSelectInsightsOptionFromPrimaryMenu() {
        FindByElementsRomaniaEnglishHomePage element = new FindByElementsRomaniaEnglishHomePage(testContext);
        getWindowManager().switchToNewTab();
        element.insightOptionPrimaryMenuClick();
    }

    @When("I select Careers option from primary menu")
    public void iSelectCareersOptionFromPrimaryMenu() {
        FindByElementsRomaniaEnglishHomePage element = new FindByElementsRomaniaEnglishHomePage(testContext);
        getWindowManager().switchToNewTab();
        element.careersOptionPrimaryMenuClick();
    }

    @When("I select About option from primary menu")
    public void iSelectAboutOptionFromPrimaryMenu() {
        FindByElementsRomaniaEnglishHomePage element = new FindByElementsRomaniaEnglishHomePage(testContext);
        getWindowManager().switchToNewTab();
        element.aboutOptionPrimaryMenuClick();
    }

    @When("I select Contact option from primary menu")
    public void iSelectContactOptionFromPrimaryMenu() {
        FindByElementsRomaniaEnglishHomePage element = new FindByElementsRomaniaEnglishHomePage(testContext);
        getWindowManager().switchToNewTab();
        element.contactOptionPrimaryMenuClick();
    }

    public WindowManager getWindowManager() {
        return new WindowManager(testContext.getDriver());
    }

    @And("I scroll to footer menu from GlobalLogic Home Romania English page")
    public void iScrollToFooterMenuFromGlobalLogicHomeRomaniaEnglishPage() throws InterruptedException {
        FindByElementsRomaniaEnglishHomePage element = new FindByElementsRomaniaEnglishHomePage(testContext);
        //getWindowManager().switchToNewTab();
        element.footerMenuScroll();
        //Thread.sleep(10000);
    }

    @When("I select Services option from footer menu")
    public void iSelectServicesOptionFromFooterMenu() {
        FindByElementsRomaniaEnglishHomePage element = new FindByElementsRomaniaEnglishHomePage(testContext);
        element.servicesOptionFooterMenuClick();
    }

    @When("I select Work option from footer menu")
    public void iSelectWorkOptionFromFooterMenu() {
        FindByElementsRomaniaEnglishHomePage element = new FindByElementsRomaniaEnglishHomePage(testContext);
        element.workOptionFooterMenuClick();
    }

    @When("I select Insights option from footer menu")
    public void iSelectInsightsOptionFromFooterMenu() {
        FindByElementsRomaniaEnglishHomePage element = new FindByElementsRomaniaEnglishHomePage(testContext);
        element.insightOptionFooterMenuClick();
    }

    @When("I select Careers option from footer menu")
    public void iSelectCareersOptionFromFooterMenu() {
        FindByElementsRomaniaEnglishHomePage element = new FindByElementsRomaniaEnglishHomePage(testContext);
        element.careersOptionFooterMenuClick();
    }

    @When("I select About option from footer menu")
    public void iSelectAboutOptionFromFooterMenu() {
        FindByElementsRomaniaEnglishHomePage element = new FindByElementsRomaniaEnglishHomePage(testContext);
        element.aboutOptionFooterMenuClick();
    }

    @When("I select Privacy option from footer menu")
    public void iSelectPrivacyOptionFromFooterMenu() {
        FindByElementsRomaniaEnglishHomePage element = new FindByElementsRomaniaEnglishHomePage(testContext);
        element.privacyOptionFooterMenuClick();
    }

    @When("I select Compliance and Disclosures option from footer menu")
    public void iSelectComplianceAndDisclosuresOptionFromFooterMenu() {
        FindByElementsRomaniaEnglishHomePage element = new FindByElementsRomaniaEnglishHomePage(testContext);
        element.complianceDisclosuresOptionFooterMenuClick();
    }

    @When("I select Contact option from footer menu")
    public void iSelectContactOptionFromFooterMenu() {
        FindByElementsRomaniaEnglishHomePage element = new FindByElementsRomaniaEnglishHomePage(testContext);
        element.contactOptionFooterMenuClick();
    }

    private String getPageURL() {
        System.out.println("URL: " + testContext.getDriver().getCurrentUrl());
        return testContext.getDriver().getCurrentUrl();
    }

    private String getTitlePage() {
        System.out.println("Title: " + testContext.getDriver().getTitle());
        return testContext.getDriver().getTitle();
    }

    @Then("GlobalLogic Services Offerings page is opened")
    public void GlobalLogicServicesPageIsOpened() {
        String pageURL = getPageURL();
        assertEquals(DataUtility.SERVICES_LINK, pageURL);

    }

    @Then("GlobalLogic Work page is opened")
    public void GlobalLogicWorkPageIsOpened() {
        String pageURL = getPageURL();
        assertEquals(DataUtility.WORK_LINK, pageURL);
    }

    @Then("GlobalLogic Insights page is opened")
    public void GlobalLogicInsightsPageIsOpened() {
        String pageURL = getPageURL();
        assertEquals(DataUtility.INSIGHTS_LINK, pageURL);
    }

    @Then("GlobalLogic Careers page is opened")
    public void GlobalLogicCareersPageIsOpened() {
        String pageURL = getPageURL();
        assertEquals(DataUtility.CAREERS_LINK, pageURL);
    }

    @Then("GlobalLogic About page is opened")
    public void GlobalLogicAboutPageIsOpened() {
        String pageURL = getPageURL();
        assertEquals(DataUtility.ABOUT_LINK, pageURL);
    }

    @Then("GlobalLogic Privacy page is opened")
    public void GlobalLogicPrivacyPageIsOpened() {
        String pageURL = getPageURL();
        assertEquals(DataUtility.PRIVACY_LINK, pageURL);
    }

    @Then("GlobalLogic Compliance and Disclosures page is opened")
    public void GlobalLogicComplianceAndDisclosuresPageIsOpened() {
        String pageURL = getPageURL();
        assertEquals(DataUtility.COMPLIANCEDISCLOSURES_LINK, pageURL);
    }

    @Then("GlobalLogic Contact page is opened")
    public void GlobalLogicContactPageIsOpened() {
        String pageURL = getPageURL();
        assertEquals(DataUtility.CONTACT_LINK, pageURL);
    }

    @And("GlobalLogic Home Romania English page is opened")
    public void GlobalLogicHomeRomaniaEnglishPageIsOpened() {
        getWindowManager().switchToNewTab();
        String pageURL = getPageURL();
        assertEquals(DataUtility.ROMANIA_ENGLISH_LINK, pageURL);
    }

    @And("GlobalLogic Services Offerings Title page is displayed")
    public void GlobalLogicServicesOfferingsTitlePageIsDisplayed() {
        String titlePage = getTitlePage();
        assertEquals(DataUtility.SERVICES_TITLE, titlePage);

    }

    @And("GlobalLogic Work Title page is displayed")
    public void GlobalLogicWorkTitlePageIsDisplayed() {
        String titlePage = getTitlePage();
        assertEquals(DataUtility.WORK_TITLE, titlePage);
    }

    @And("GlobalLogic Insights Title page is displayed")
    public void GlobalLogicInsightsTitlePageIsDisplayed() {
        String titlePage = getTitlePage();
        assertEquals(DataUtility.INSIGHTS_TITLE, titlePage);
    }

    @And("GlobalLogic Careers Title page is displayed")
    public void GlobalLogicCareersTitlePageIsDisplayed() {
        String titlePage = getTitlePage();
        assertEquals(DataUtility.CAREERS_TITLE, titlePage);
    }

    @And("GlobalLogic About Title page is displayed")
    public void GlobalLogicAboutTitlePageIsDisplayed() {
        String titlePage = getTitlePage();
        assertEquals(DataUtility.ABOUT_TITLE, titlePage);
    }

    @And("GlobalLogic Privacy Title page is displayed")
    public void GlobalLogicPrivacyTitlePageIsDisplayed() {
        String titlePage = getTitlePage();
        assertEquals(DataUtility.PRIVACY_TITLE, titlePage);
    }

    @And("GlobalLogic Compliance and Disclosures Title page is displayed")
    public void GlobalLogicComplianceAndDisclosuresTitlePageIsDisplayed() {
        String titlePage = getTitlePage();
        assertEquals(DataUtility.COMPLIANCEDISCLOSURES_TITLE, titlePage);
    }

    @And("GlobalLogic Contact Title page is displayed")
    public void GlobalLogicContactTitlePageIsDisplayed() {
        String titlePage = getTitlePage();
        assertEquals(DataUtility.CONTACT_TITLE, titlePage);
    }

    @Then("GlobalLogic Social Pages are displayed")
    public void GlobalLogicSocialPagesAreDisplayed() {
        FindByElementsRomaniaEnglishHomePage element = new FindByElementsRomaniaEnglishHomePage(testContext);
        WebDriverWait wait = new WebDriverWait(testContext.getDriver(), Duration.ofSeconds(10));

        List<WebElement> allSocialMedia = utility.findElements(with(
                By.tagName("a")
        ).toRightOf(wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(element.footerSecond)))
        ).below(wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(element.craft)))
        ).above(wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(element.subscribe)))));
        System.out.println("Social Media are: " + allSocialMedia.size());

        List<String> supplierNames = Arrays.asList(DataUtility.LINKEDIN_HREF, DataUtility.TWITTER_HREF,
                DataUtility.FACEBOOK_HREF, DataUtility.YOUTUBE_HREF, DataUtility.INSTAGRAM_HREF);

        IntStream.range(0, allSocialMedia.size())
                .forEach(index -> {
                    String socialMedia = allSocialMedia.get(index).getAttribute("href");
                    assertEquals(supplierNames.get(index), socialMedia);
                    System.out.println("Social media is:" + socialMedia);

                });
    }

    @When("I select Linkedin from footer menu")
    public void ISelectLinkedinFromFooterMenu() {
        FindByElementsRomaniaEnglishHomePage element = new FindByElementsRomaniaEnglishHomePage(testContext);
        element.linkedinFooterMenuClick();
    }

    @When("I select Twitter from footer menu")
    public void ISelectTwitterFromFooterMenu() {
        FindByElementsRomaniaEnglishHomePage element = new FindByElementsRomaniaEnglishHomePage(testContext);
        element.twitterFooterMenuClick();
    }

    @When("I select Facebook from footer menu")
    public void ISelectFacebookFromFooterMenu() {
        FindByElementsRomaniaEnglishHomePage element = new FindByElementsRomaniaEnglishHomePage(testContext);
        element.facebookFooterMenuClick();
    }

    @When("I select Youtube from footer menu")
    public void ISelectYoutubeFromFooterMenu() {
        FindByElementsRomaniaEnglishHomePage element = new FindByElementsRomaniaEnglishHomePage(testContext);
        element.youtubeFooterMenuClick();
    }

    @When("I select Instagram from footer menu")
    public void ISelectInstagramFromFooterMenu() {
        FindByElementsRomaniaEnglishHomePage element = new FindByElementsRomaniaEnglishHomePage(testContext);
        element.instagramFooterMenuClick();
    }

    @Then("Linkedin page is opened")
    public void LinkedinPageIsOpened() {
        getWindowManager().switchToNewTab();
        String pageURL = getPageURL();
        assertEquals(DataUtility.LINKEDIN_LINK, pageURL);
    }

    @Then("Twitter page is opened")
    public void TwitterPageIsOpened() {
        getWindowManager().switchToNewTab();
        String pageURL = getPageURL();
        assertEquals(DataUtility.TWITTER_LINK, pageURL);
    }

    @Then("Facebook page is opened")
    public void FacebookPageIsOpened() {
        getWindowManager().switchToNewTab();
        String pageURL = getPageURL();
        assertEquals(DataUtility.FACEBOOK_LINK, pageURL);
    }

    @Then("Youtube page is opened")
    public void YoutubePageIsOpened() {
        getWindowManager().switchToNewTab();
        FindByElementsRomaniaEnglishHomePage element = new FindByElementsRomaniaEnglishHomePage(testContext);
        element.youtubeCookiesAcceptClick();
        String pageURL = getPageURL();
        assertEquals(DataUtility.YOUTUBE_LINK, pageURL);
    }

    @Then("Instagram page is opened")
    public void InstagramPageIsOpened() {
        getWindowManager().switchToNewTab();
        String pageURL = getPageURL();
        assertEquals(DataUtility.INSTAGRAM_LINK, pageURL);
    }

    @And("Linkedin Title page is displayed")
    public void LinkedinTitlePageIsDisplayed() {
        String titlePage = getTitlePage();
        System.out.println(titlePage);
        assertEquals(DataUtility.LINKEDIN_TITLE, titlePage);
    }

    @And("Twitter Title page is displayed")
    public void TwitterTitlePageIsDisplayed() {
        String titlePage = getTitlePage();
        System.out.println(titlePage);
        assertEquals(DataUtility.TWITTER_TITLE, titlePage);
    }

    @And("Facebook Title page is displayed")
    public void FacebookTitlePageIsDisplayed() {
        String titlePage = getTitlePage();
        System.out.println(titlePage);
        assertEquals(DataUtility.FACEBOOK_TITLE, titlePage);
    }

    @And("Youtube Title page is displayed")
    public void YoutubeTitlePageIsDisplayed() {
        String titlePage = getTitlePage();
        System.out.println(titlePage);
        assertEquals(DataUtility.YOUTUBE_TITLE, titlePage);
    }

    @And("Instagram Title page is displayed")
    public void InstagramTitlePageIsDisplayed() {
        String titlePage = getTitlePage();
        System.out.println(titlePage);
        assertEquals(DataUtility.INSTAGRAM_TITLE, titlePage);
    }

}
