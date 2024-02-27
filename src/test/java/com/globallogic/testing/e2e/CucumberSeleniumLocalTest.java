package com.globallogic.testing.e2e;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        junit = {"--filename-compatible-names", "--step-notifications"},
        plugin = {"pretty", "junit:target/surefire-reports/com.globallogic.testing.e2e.CucumberSeleniumLocalTest.xml", "html:target/surefire-reports/CucumberSeleniumLocalTest", "json:target/surefire-reports/XrayCucumberTest.json"},
        features = {"src/test/features"},
        extraGlue = {"com.globallogic.testing.extraglue.localwebdriver"},
        tags = "not @skip and not @Negative and  @Smoke and not @End2End"
)

public class CucumberSeleniumLocalTest {
}
