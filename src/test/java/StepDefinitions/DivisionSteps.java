package StepDefinitions;

import Pages.FullscreenCalculatorPage;
import io.cucumber.java.en.*;

public class DivisionSteps {
//	
//	Scenario: Validate the Division operation
//	Given Two positive non zero numbers
//	When second number divides first
//	Then Correct Value is Derived
	@Given("^Launch Application and provide Two positive non zero numbers$")
	public void Launch_Application()
	{
		FullscreenCalculatorPage.launch_Chrome_Browser();
		FullscreenCalculatorPage.navigate_To_OnlineCalculator();
		
	}
	@When("^second number divides first$")
	public void provide_Two_Numbers_And_Subtract()
	{
		FullscreenCalculatorPage.prese9();
		FullscreenCalculatorPage.prese8();
		
		FullscreenCalculatorPage.divideBy();
		
		FullscreenCalculatorPage.prese2();
		
	}
	
	@Then("^Correct Value is Derived$")
	public void verify_Remainder_Value()
	{
		//Using OCR code
	}
	
}
