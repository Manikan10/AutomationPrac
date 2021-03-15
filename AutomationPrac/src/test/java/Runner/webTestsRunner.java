package Runner;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber; 


@RunWith(Cucumber.class) 
@CucumberOptions(
features = "src/test/java/Features/WebPageTests.feature", //This is for running single feature file
//features = {"classpath:Features"}, //This is for running all the feature files under Features folder
tags = "@Test3",
glue= {"StepDefinitions"},
plugin = {"pretty", "html:Result/WebTests"}
)

public class webTestsRunner {
	

}
