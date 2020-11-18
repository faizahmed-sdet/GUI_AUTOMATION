package StepDefinitions;


import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//import cucumber.api.java.en.*;
import io.cucumber.java.en.*;


public class LaunchCalculator 
{
	WebDriver driver; 
	
	
	
	@Given("^Browser is Opened$")
	public void launchBrowser() throws Throwable 
	{
		System.setProperty("webdriver.chrome.driver", "C://Users/Faiz//Downloads//chromedriver_win32 (2)//chromedriver.exe");
		driver = new  ChromeDriver();
		
		System.out.println("Assalamualaikum");
	}

	@When("^User Hits the URL$")
	public void navigate_ToURL()  throws Throwable{
		driver.get("https://www.online-calculator.com/full-screen-calculator/");
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Assalamualaikum");
	    
	}


	@SuppressWarnings("deprecation")
	@Then("^The Calculator Page Should Be displayed$")
	public void checkWhetherLaunched() throws Throwable {
		new WebDriverWait(driver, 10).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.id("fullframe")));
		WebElement canvas = new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.id("canvas")));
		Rectangle dl = canvas.getRect();
		System.out.println("Assalamualaikum");
	    
	}	
	
}
