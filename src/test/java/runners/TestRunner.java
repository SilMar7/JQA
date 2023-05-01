package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import stepdefinitions.Hooks;

import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"classpath:features"},
        glue = {"stepdefinitions"},
        plugin = {"pretty", "html:target/cucumber-report", "json:target/cucumber.json"},
        tags = "@EndToEndTests",
        monochrome = true,
        dryRun = false,
        snippets = CAMELCASE
)
public class TestRunner extends Hooks {

}