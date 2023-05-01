package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;


import static driver.DriverFactory.closeDriver;
import static driver.DriverFactory.getDriver;
import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"classpath:features"},
        glue = {"stepdefinitions"},
        plugin = {"pretty", "html:target/index"},
        tags ="@EndToEndTests",
        dryRun = false,
        snippets = CAMELCASE
)
public class TestRunner {

    @BeforeClass
    public static void setup() {
        getDriver();
    }

    @AfterClass
    public static void tearDown() {
        closeDriver();
    }


}