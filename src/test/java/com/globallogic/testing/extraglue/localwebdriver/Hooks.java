package com.globallogic.testing.extraglue.localwebdriver;

import com.globallogic.testing.e2e.Utils;
import com.globallogic.testing.e2e.TestContext;
import cucumber.api.Scenario;
import cucumber.api.java.Before;


public class Hooks {

    private TestContext testContext;

    public Hooks(TestContext testContext) {
        this.testContext = testContext;
    }

    @Before(order = 9000)
    public void determineWebDriverOptions(Scenario scenario) {
        testContext.setWebDriverMode(Utils.WebDriverMode.LOCAL);
    }
}
