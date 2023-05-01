package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import utils.Hooks;

import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"classpath:features"},
        glue = {"stepdefinitions"},
        plugin = {"pretty", "html:target/index"},
        tags = "@EndToEndTests",
        monochrome = true,
        dryRun = false,
        snippets = CAMELCASE
)
public class TestRunner extends Hooks {

}