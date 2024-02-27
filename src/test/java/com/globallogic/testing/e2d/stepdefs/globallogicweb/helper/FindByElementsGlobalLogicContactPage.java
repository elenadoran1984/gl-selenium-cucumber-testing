package com.globallogic.testing.e2d.stepdefs.globallogicweb.helper;

import com.globallogic.testing.e2d.TestContext;
import com.globallogic.testing.e2d.stepdefs.CommonUtility;
import org.openqa.selenium.By;

public class FindByElementsGlobalLogicContactPage {

    private final CommonUtility utility;
    private final TestContext testContext;

    public FindByElementsGlobalLogicContactPage(TestContext testContext) {
        this.testContext = testContext;
        utility = new CommonUtility(testContext);
    }

}
