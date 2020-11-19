package StepDefinitions;

import Pages.FullscreenCalculatorPage;
import io.cucumber.java.en.*;

public class CalculatorSmokeSteps {
	
	@Given("^Calculator is Successfully Launched$")
	public void Launch_Application()
	{
		FullscreenCalculatorPage.launch_Chrome_Browser();
		FullscreenCalculatorPage.navigate_To_OnlineCalculator();
		
	}
	@When("^Random Numbers are Pressed$")
	public void press_Random_Keys()
	{
		try {
			FullscreenCalculatorPage.initializeCalculator();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	@Then("^The key values are Shown on the Screen$")
	public void check_Key_Values_On_Screen()
	{
		
	}


}
