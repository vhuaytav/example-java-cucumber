package skeleton;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "com.epam.reportportal.cucumber.ScenarioReporter"})
//@CucumberOptions(tags = "@ok", plugin = { "skeleton.RpListener" })
public class RunCukesTest {
}
