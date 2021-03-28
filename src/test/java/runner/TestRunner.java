package runner;

import io.cucumber.junit.CucumberOptions;


@CucumberOptions(features = {"src/test/resources/scenarios"},
                monochrome = true,
                glue = {"src/test/java/stepDefs"})

public class TestRunner  {
}
