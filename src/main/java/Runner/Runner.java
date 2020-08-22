package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
@CucumberOptions(
        plugin = { "html:target/cucumber-report"},
        features = {"src/test/java/FeatuareFiles"},
        glue = {"StepDefinitions"},
        dryRun = false
)


public class Runner extends AbstractTestNGCucumberTests {

}
