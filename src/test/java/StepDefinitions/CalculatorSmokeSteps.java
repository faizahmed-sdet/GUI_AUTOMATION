package StepDefinitions;

import Pages.FullscreenCalculatorPage;
import io.cucumber.java.en.*;

public class CalculatorSmokeSteps {
	
	@Given("^Some Random Numbers$")
	public void Launch_Application()
	{
		FullscreenCalculatorPage.launch_Chrome_Browser();
		FullscreenCalculatorPage.navigate_To_OnlineCalculator();
		
	}
	@When("^The Numbers are Pressed$")
	public void press_Random_Keys()
	{
		try {
			FullscreenCalculatorPage.initializeCalculator();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	@Then("^The Numbers are Shown on the Screen$")
	public void check_Key_Values_On_Screen()
	{
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("This is Smoke test");
		FullscreenCalculatorPage.closeBrowser();
	}


}
