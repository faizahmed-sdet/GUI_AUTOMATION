package StepDefinitions;


import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Pages.FullscreenCalculatorPage;
//import cucumber.api.java.en.*;
import io.cucumber.java.en.*;


public class LaunchCalculatorSteps 
{
	
	@Given("^Browser is Opened$")
	public void launchBrowser() throws Throwable 
	{
		FullscreenCalculatorPage.launch_Chrome_Browser();
	}

	@When("^User Hits the URL$")
	public void navigate_ToURL()  throws Throwable
	{
		FullscreenCalculatorPage.navigate_To_OnlineCalculator();
	    
	}


	@Then("^The Calculator Page Should Be displayed$")
	public void checkWhetherLaunched() throws Throwable 
	{
		//FullscreenCalculatorPage.initializeCalculator();
		
		FullscreenCalculatorPage.prese1();
		FullscreenCalculatorPage.prese0();
		FullscreenCalculatorPage.prese0();
		FullscreenCalculatorPage.divideBy();
		FullscreenCalculatorPage.prese1();
		FullscreenCalculatorPage.prese0();
		FullscreenCalculatorPage.equalsTo();

		FullscreenCalculatorPage.closeBrowser();
	}	
	
}
