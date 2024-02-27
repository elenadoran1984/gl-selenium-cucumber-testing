package com.globallogic.testing.e2d.stepdefs.globallogicweb;

import com.globallogic.testing.e2d.SeleniumUtils;
import com.globallogic.testing.e2d.TestContext;
import com.globallogic.testing.e2d.stepdefs.CommonUtility;
import com.globallogic.testing.e2d.stepdefs.WindowManager;
import com.globallogic.testing.e2d.stepdefs.globallogicweb.helper.DataUtilityGlobalLogic;
import com.globallogic.testing.e2d.stepdefs.globallogicweb.helper.FindByElementsGlobalLogicHomePage;
import com.globallogic.testing.e2d.stepdefs.globallogicweb.helper.FindByElementsGlobalLogicHomeRomaniaEnglishPage;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assume.assumeTrue;

public class GlobalLogicStepdefs {

    private static final Logger LOGGER = LoggerFactory.getLogger(GlobalLogicStepdefs.class);
    private final TestContext testContext;
    private final CommonUtility utility;
    private WebDriverWait wait;
    private String requestDescription;

    public GlobalLogicStepdefs(TestContext testContext) {
        this.testContext = testContext;
        utility = new CommonUtility(testContext);
    }

    @After()
    public void closeBrowser(Scenario scenario) {
        requestDescription = null;
        if (testContext.getDriver() != null) {
            SeleniumUtils.createScreenshotIfFailed(testContext.getDriver(), scenario);
            testContext.getDriver().quit();
            testContext.setDriver(null);
        }
    }

    @Given("I open GlobalLogic Home page on {browser}")
    public void iOpenGlobalLogicHomepageoOnBrowser(SeleniumUtils.Browser browser) throws InterruptedException {
        testContext.setWebDriverOption(testContext.getWebDriverMode() + "_" + browser);
        if (!SeleniumUtils.ACTIVE_BROWSERS.contains(browser.toString())) {
            assumeTrue(browser + " browser is not yet supported.", false);
        }
        WebDriver driver = SeleniumUtils.getWebDriver(testContext.getWebDriverMode(), browser);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        testContext.setDriver(driver);
        try {
            testContext.getDriver().get(DataUtilityGlobalLogic.HOME_LINK);
        } catch (WebDriverException e) {
            LOGGER.info("Driver:***** EXCEPTION CAUGHT *******");
        }
    }

    private void hoverOverCountryOptions() {
        FindByElementsGlobalLogicHomePage element = new FindByElementsGlobalLogicHomePage(testContext);
        element.hoverOverCountryOptions();
    }

    @And("I change to Romania English from country options")
    public void iChangeToRomaniaEnglishFromCountryOptions() {
        hoverOverCountryOptions();
        FindByElementsGlobalLogicHomePage element = new FindByElementsGlobalLogicHomePage(testContext);
        element.selectRomaniaEnglishCountryOption();
    }

    @When("I select Services option from primary menu")
    public void iSelectServicesOptionFromPrimaryMenu() {
        FindByElementsGlobalLogicHomeRomaniaEnglishPage element = new FindByElementsGlobalLogicHomeRomaniaEnglishPage(testContext);
        element.servicesOptionPrimaryMenuClick();
    }

    @When("I select Work option from primary menu")
    public void iSelectWorkOptionFromPrimaryMenu() {
        FindByElementsGlobalLogicHomeRomaniaEnglishPage element = new FindByElementsGlobalLogicHomeRomaniaEnglishPage(testContext);
        element.workOptionPrimaryMenuClick();
    }

    @When("I select Insights option from primary menu")
    public void iSelectInsightsOptionFromPrimaryMenu() {
        FindByElementsGlobalLogicHomeRomaniaEnglishPage element = new FindByElementsGlobalLogicHomeRomaniaEnglishPage(testContext);
        element.insightOptionPrimaryMenuClick();
    }

    @When("I select Careers option from primary menu")
    public void iSelectCareersOptionFromPrimaryMenu() {
        FindByElementsGlobalLogicHomeRomaniaEnglishPage element = new FindByElementsGlobalLogicHomeRomaniaEnglishPage(testContext);
        element.careersOptionPrimaryMenuClick();
    }

    @When("I select About option from primary menu")
    public void iSelectAboutOptionFromPrimaryMenu() {
        FindByElementsGlobalLogicHomeRomaniaEnglishPage element = new FindByElementsGlobalLogicHomeRomaniaEnglishPage(testContext);
        element.aboutOptionPrimaryMenuClick();
    }

    @When("I select Contact option from primary menu")
    public void iSelectContactOptionFromPrimaryMenu() {
        FindByElementsGlobalLogicHomeRomaniaEnglishPage element = new FindByElementsGlobalLogicHomeRomaniaEnglishPage(testContext);
        element.contactOptionPrimaryMenuClick();
    }

    public WindowManager getWindowManager(){
        return new WindowManager(testContext.getDriver());
    }

    @And("I scroll to footer menu from GlobalLogic Home Romania English page")
    public void iScrollToFooterMenuFromGlobalLogicHomeRomaniaEnglishPage() throws InterruptedException {
        FindByElementsGlobalLogicHomeRomaniaEnglishPage element = new FindByElementsGlobalLogicHomeRomaniaEnglishPage(testContext);
        getWindowManager().switchToNewTab();
        element.footerMenuScroll();
        //Thread.sleep(10000);
    }

    @When("I select Services option from footer menu")
    public void iSelectServicesOptionFromFooterMenu() {
        FindByElementsGlobalLogicHomeRomaniaEnglishPage element = new FindByElementsGlobalLogicHomeRomaniaEnglishPage(testContext);
        element.servicesOptionFooterMenuClick();
    }

    @When("I select Work option from footer menu")
    public void iSelectWorkOptionFromFooterMenu() {
        FindByElementsGlobalLogicHomeRomaniaEnglishPage element = new FindByElementsGlobalLogicHomeRomaniaEnglishPage(testContext);
        element.workOptionFooterMenuClick();
    }

    @When("I select Insights option from footer menu")
    public void iSelectInsightsOptionFromFooterMenu() {
        FindByElementsGlobalLogicHomeRomaniaEnglishPage element = new FindByElementsGlobalLogicHomeRomaniaEnglishPage(testContext);
        element.insightOptionFooterMenuClick();
    }

    @When("I select Careers option from footer menu")
    public void iSelectCareersOptionFromFooterMenu() {
        FindByElementsGlobalLogicHomeRomaniaEnglishPage element = new FindByElementsGlobalLogicHomeRomaniaEnglishPage(testContext);
        element.careersOptionFooterMenuClick();
    }

    @When("I select About option from footer menu")
    public void iSelectAboutOptionFromFooterMenu() {
        FindByElementsGlobalLogicHomeRomaniaEnglishPage element = new FindByElementsGlobalLogicHomeRomaniaEnglishPage(testContext);
        element.aboutOptionFooterMenuClick();
    }

    @When("I select Privacy option from footer menu")
    public void iSelectPrivacyOptionFromFooterMenu() {
        FindByElementsGlobalLogicHomeRomaniaEnglishPage element = new FindByElementsGlobalLogicHomeRomaniaEnglishPage(testContext);
        element.privacyOptionFooterMenuClick();
    }

    @When("I select Compliance and Disclosures option from footer menu")
    public void iSelectComplianceAndDisclosuresOptionFromFooterMenu() {
        FindByElementsGlobalLogicHomeRomaniaEnglishPage element = new FindByElementsGlobalLogicHomeRomaniaEnglishPage(testContext);
        element.complianceDisclosuresOptionFooterMenuClick();
    }

    @When("I select Contact option from footer menu")
    public void iSelectContactOptionFromFooterMenu() {
        FindByElementsGlobalLogicHomeRomaniaEnglishPage element = new FindByElementsGlobalLogicHomeRomaniaEnglishPage(testContext);
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
        assertEquals(DataUtilityGlobalLogic.SERVICES_LINK, pageURL);

    }

    @Then("GlobalLogic Work page is opened")
    public void GlobalLogicWorkPageIsOpened() {
        String pageURL = getPageURL();
        assertEquals(DataUtilityGlobalLogic.WORK_LINK, pageURL);
    }

    @Then("GlobalLogic Insights page is opened")
    public void GlobalLogicInsightsPageIsOpened() {
        String pageURL = getPageURL();
        assertEquals(DataUtilityGlobalLogic.INSIGHTS_LINK, pageURL);
    }

    @Then("GlobalLogic Careers page is opened")
    public void GlobalLogicCareersPageIsOpened() {
        String pageURL = getPageURL();
        assertEquals(DataUtilityGlobalLogic.CAREERS_LINK, pageURL);
    }

    @Then("GlobalLogic About page is opened")
    public void GlobalLogicAboutPageIsOpened() {
        String pageURL = getPageURL();
        assertEquals(DataUtilityGlobalLogic.ABOUT_LINK, pageURL);
    }

    @Then("GlobalLogic Privacy page is opened")
    public void GlobalLogicPrivacyPageIsOpened() {
        String pageURL = getPageURL();
        assertEquals(DataUtilityGlobalLogic.PRIVACY_LINK, pageURL);
    }

    @Then("GlobalLogic Compliance and Disclosures page is opened")
    public void GlobalLogicComplianceAndDisclosuresPageIsOpened() {
        String pageURL = getPageURL();
        assertEquals(DataUtilityGlobalLogic.COMPLIANCEDISCLOSURES_LINK, pageURL);
    }

    @Then("GlobalLogic Contact page is opened")
    public void GlobalLogicContactPageIsOpened() {
        String pageURL = getPageURL();
        assertEquals(DataUtilityGlobalLogic.CONTACT_LINK, pageURL);
    }

    @And("GlobalLogic Home Romania English page is opened")
    public void GlobalLogicHomeRomaniaEnglishPageIsOpened() {
        String pageURL = getPageURL();
        assertEquals(DataUtilityGlobalLogic.ROMANIA_ENGLISH_LINK, pageURL);
    }

    @And("GlobalLogic Services Offerings Title page is displayed")
    public void GlobalLogicServicesOfferingsTitlePageIsDisplayed() {
        String titlePage = getTitlePage();
        assertEquals(DataUtilityGlobalLogic.SERVICES_TITLE, titlePage);

    }

    @And("GlobalLogic Work Title page is displayed")
    public void GlobalLogicWorkTitlePageIsDisplayed() {
        String titlePage = getTitlePage();
        assertEquals(DataUtilityGlobalLogic.WORK_TITLE, titlePage);
    }

    @And("GlobalLogic Insights Title page is displayed")
    public void GlobalLogicInsightsTitlePageIsDisplayed() {
        String titlePage = getTitlePage();
        assertEquals(DataUtilityGlobalLogic.INSIGHTS_TITLE, titlePage);
    }

    @And("GlobalLogic Careers Title page is displayed")
    public void GlobalLogicCareersTitlePageIsDisplayed() {
        String titlePage = getTitlePage();
        assertEquals(DataUtilityGlobalLogic.CAREERS_TITLE, titlePage);
    }

    @And("GlobalLogic About Title page is displayed")
    public void GlobalLogicAboutTitlePageIsDisplayed() {
        String titlePage = getTitlePage();
        assertEquals(DataUtilityGlobalLogic.ABOUT_TITLE, titlePage);
    }

    @And("GlobalLogic Privacy Title page is displayed")
    public void GlobalLogicPrivacyTitlePageIsDisplayed() {
        String titlePage = getTitlePage();
        assertEquals(DataUtilityGlobalLogic.PRIVACY_TITLE, titlePage);
    }

    @And("GlobalLogic Compliance and Disclosures Title page is displayed")
    public void GlobalLogicComplianceAndDisclosuresTitlePageIsDisplayed() {
        String titlePage = getTitlePage();
        assertEquals(DataUtilityGlobalLogic.COMPLIANCEDISCLOSURES_TITLE, titlePage);
    }

    @And("GlobalLogic Contact Title page is displayed")
    public void GlobalLogicContactTitlePageIsDisplayed() {
        String titlePage = getTitlePage();
        assertEquals(DataUtilityGlobalLogic.CONTACT_TITLE, titlePage);
    }
}
