package com.globallogic.testing.e2e.stepdefs.globallogicweb.helper;

import com.globallogic.testing.e2e.TestContext;
import com.globallogic.testing.e2e.stepdefs.CommonUtility;

public class FindByElementsContactPage {

    private final CommonUtility utility;
    private final TestContext testContext;

    public FindByElementsContactPage(TestContext testContext) {
        this.testContext = testContext;
        utility = new CommonUtility(testContext);
    }

}
