package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty", "html:src/main/report",
                "json:src/main/report/cucumber.json",
                "junit:src/main/report/cucumber.xml"
        },
        features = {
                "src/test/java/feature/"
        },
        glue = {
                "src.test.java.step","src.test.java.hooks"
        },
        tags = "@Regressivo"
)


public class RunTest {
}
