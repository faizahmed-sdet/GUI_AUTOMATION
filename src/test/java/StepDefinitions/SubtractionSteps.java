package StepDefinitions;

import Pages.FullscreenCalculatorPage;
import io.cucumber.java.en.*;

//
//Scenario: Validate the Subtraction operation is working as expected
//Given Two positive numbers
//When second number is subtracted from first
//Then Correct Value is Derived
public class SubtractionSteps {
	
	@Given("Launch Application and provide Two positive non zero numbers")
	public void Launch_Application()
	{
		FullscreenCalculatorPage.launch_Chrome_Browser();
		FullscreenCalculatorPage.navigate_To_OnlineCalculator();
		
	}
	@When("^second number is subtracted from first$")
	public void provide_Two_Numbers_And_Subtract()
	{
		FullscreenCalculatorPage.prese9();
		FullscreenCalculatorPage.prese8();
		
		FullscreenCalculatorPage.subtractFrom();
		
		FullscreenCalculatorPage.prese2();
		
		FullscreenCalculatorPage.equalsTo();
		
	}
	
	@Then("^Correct Value is Derived$")
	public void verify_Remainder_Value_For_Subtraction()
	{
		System.out.println("Hello");
		FullscreenCalculatorPage.closeBrowser();
		//Using OCR code
	}

}
