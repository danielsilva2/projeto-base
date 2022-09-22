package runner;

import cucumber.api.CucumberOptions;
import io.cucumber.core.snippets.SnippetType;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/resources"},
        snippets = SnippetType.CAMELCASE,
        plugin = {
                "pretty",
                "html:target/cucumber-html-report",
                "json:target/cucumber-json-report/cucumber.json",
                "support.CustomFormatter"
        },
        glue = {""},
        tags = {"@"}
)
public class RunnerTest {
}
