package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FullscreenCalculatorPage {
	
	public static WebDriver driver;
	
	private By calculatorCanvas = By.id("canvas");
	private By ifullFrame = By.id("fullframe");
	private By navigateBackToSmallCalculator = By.xpath("//a[@title='Back to Homepage']");
	private static String WEBURL = "https://www.online-calculator.com/full-screen-calculator/";
	private String CHROME_DRIVER_PATH = "";
	private static Rectangle dl;
	public static WebElement canvas;

	//Center is 6
	private static int XAXIS = 0;
	private static int YAXIS = 10;
	
	public static void launch_Chrome_Browser()
	{
		System.setProperty("webdriver.chrome.driver", "C://Users/Faiz//Downloads//chromedriver_win32 (2)//chromedriver.exe");
		driver = new  ChromeDriver();
	}
	
	
	
	@SuppressWarnings("deprecation")
	public static void navigate_To_OnlineCalculator()
	{
		driver.get(WEBURL);
		new WebDriverWait(driver, 10).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.id("fullframe")));
		canvas = new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.id("canvas")));
		dl = canvas.getRect();
		System.out.println("sysioos");
		System.out.println(XAXIS);
		System.out.println((YAXIS));
			}
	
	
	
	public static void initializeCalculator() throws InterruptedException 
	{
		System.out.println("Hello");
		
		new Actions(driver).moveToElement(canvas, 0, 0).moveByOffset(-139,100).click().build().perform();//1
		new Actions(driver).moveToElement(canvas, 0, 0).moveByOffset(XAXIS-69,YAXIS*10).click().build().perform();
		new Actions(driver).moveToElement(canvas, 0, 0).moveByOffset(XAXIS,YAXIS*10).click().build().perform();
		new Actions(driver).moveToElement(canvas, 0, 0).moveByOffset(XAXIS-139,YAXIS*1).click().build().perform();
		new Actions(driver).moveToElement(canvas, 0, 0).moveByOffset(XAXIS-69,YAXIS).click().build().perform();
		new Actions(driver).moveToElement(canvas, 0, 0).moveByOffset(XAXIS,YAXIS).click().build().perform();
		new Actions(driver).moveToElement(canvas, 0, 0).moveByOffset(XAXIS-139,-10).click().build().perform();
		new Actions(driver).moveToElement(canvas, 0, 0).moveByOffset(-69,-10).click().build().perform();
		divideBy();
		new Actions(driver).moveToElement(canvas, 0, 0).moveByOffset(0,-10).click().build().perform();//9
		new Actions(driver).moveToElement(canvas, 0, 0).moveByOffset(-139,150).click().build().perform();//0
		
		Thread.sleep(3000);
		//clearScreen();
	}
	//Numbers
	
	public static void prese1()	
	{
		try
		{
	
			new Actions(driver).moveToElement(canvas, 0, 0).moveByOffset(XAXIS-139,YAXIS*10).click().build().perform();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void prese2()	{new Actions(driver).moveToElement(canvas, 0, 0).moveByOffset(XAXIS-69,YAXIS*10).click().build().perform();}
	public static void prese3()	{new Actions(driver).moveToElement(canvas, 0, 0).moveByOffset(XAXIS,YAXIS*10).click().build().perform();}
	public static void prese4()	{new Actions(driver).moveToElement(canvas, 0, 0).moveByOffset(XAXIS-139,YAXIS*1).click().build().perform();}
	public static void prese5()	{new Actions(driver).moveToElement(canvas, 0, 0).moveByOffset(XAXIS-69,YAXIS).click().build().perform();}
	public static void prese6()	{new Actions(driver).moveToElement(canvas, 0, 0).moveByOffset(XAXIS,YAXIS).click().build().perform();}
	public static void prese7()	{new Actions(driver).moveToElement(canvas, 0, 0).moveByOffset(XAXIS-139,YAXIS*-1).click().build().perform();}
	public static void prese8()	{new Actions(driver).moveToElement(canvas, 0, 0).moveByOffset(XAXIS-69,YAXIS*-1).click().build().perform();}
	public static void prese9()	{new Actions(driver).moveToElement(canvas, 0, 0).moveByOffset(XAXIS, YAXIS*-1).click().build().perform();}
	public static void prese0()	{new Actions(driver).moveToElement(canvas, 0, 0).moveByOffset(XAXIS-139,YAXIS*15).click().build().perform();}
	
	//org.openqa.selenium.interactions.MoveTargetOutOfBoundsException
	
	//Equals 
	public static void equalsTo() {new Actions(driver).moveToElement(canvas, 0, 0).moveByOffset(139,150).click().build().perform();}
	public static void divideBy() {new Actions(driver).moveToElement(canvas, 0, 0).moveByOffset(XAXIS+69,-10).click().build().perform();}
	public static void multiplyBy() {new Actions(driver).moveToElement(canvas, 0, 0).moveByOffset(XAXIS+69,10).click().build().perform();}
	public static void subtractFrom() {new Actions(driver).moveToElement(canvas, 0, 0).moveByOffset(XAXIS+69,100).click().build().perform();}
	public static void clearScreen() {new Actions(driver).moveToElement(canvas, 0, 0).moveByOffset(XAXIS+139,YAXIS*-10).click().build().perform();}


}
