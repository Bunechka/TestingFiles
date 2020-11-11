package Lesson12.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        tags = "@CarTest",
        features = "src/test/resources",
        glue = "Lesson12/steps"
)
public class TestRunner {
}
