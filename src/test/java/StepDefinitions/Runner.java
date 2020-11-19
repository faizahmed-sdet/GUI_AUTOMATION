package StepDefinitions;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;


	@RunWith(Cucumber.class)

	
	//Below cofiguration is for Cucumber Reporting Services
	//Features and Glue attributes link with each other.
	@CucumberOptions(
		features="src\\test\\resources\\features",
		glue={"LaunchCalculatorSteps"},
		monochrome = true,
		plugin= {"pretty","json:target/JSONReports"}
	)


	public class Runner 
	{
	
	}
