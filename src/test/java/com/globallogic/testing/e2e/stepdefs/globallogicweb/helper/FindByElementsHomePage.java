package com.globallogic.testing.e2e.stepdefs.globallogicweb.helper;

import com.globallogic.testing.e2e.TestContext;
import com.globallogic.testing.e2e.stepdefs.CommonUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class FindByElementsHomePage {

    private final CommonUtility utility;
    private final TestContext testContext;

    public FindByElementsHomePage(TestContext testContext) {
        this.testContext = testContext;
        utility = new CommonUtility(testContext);
    }

    private WebElement dropdownMenuOptions;
    private WebElement clickCountryOption;

    private String dropdownMenu = "#primary-menu > li.nav-item.dropdown.loactionmenu > a";
    private String countryOptionRomaniaEnglish = "#service > div > a:nth-child(12) > span";

    public void hoverOverCountryOptions(){
        dropdownMenuOptions = utility.findElementBy(By.cssSelector(dropdownMenu));
        Actions actions = new Actions(testContext.getDriver());
        actions.moveToElement(dropdownMenuOptions).perform();
    }

    public void selectRomaniaEnglishCountryOption(){
        clickCountryOption = utility.findElementBy(By.cssSelector(countryOptionRomaniaEnglish));
        clickCountryOption.click();
    }



}
