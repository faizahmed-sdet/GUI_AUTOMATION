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


public class LaunchCalculator 
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
//		new WebDriverWait(driver, 10).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.id("fullframe")));
//		WebElement canvas = new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.id("canvas")));
//		Rectangle dl = canvas.getRect();
//		System.out.println("Height of Canvas is : " + dl.height);
//		System.out.println("Width of Canvas is : " + dl.width);
	    
	}	
	
}
