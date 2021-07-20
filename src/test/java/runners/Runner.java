package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/default-cucumber-reports"},
        features = "src/test/resources/features",
        glue = "stepdefinitions",
        tags ="@US_01_sayfaGörunurlugu",
        dryRun = false
)
public class Runner {
}
