package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.MoveTargetOutOfBoundsException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FullscreenCalculatorPage {
	
	public static WebDriver driver;
	
	private static By calculatorCanvas = By.id("canvas");
	private static By ifullFrame = By.id("fullframe");
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
		System.setProperty("webdriver.chrome.driver", "C://Users/c_faiz.shaikh.lcl//Downloads//chromedriver_win32 (2)//chromedriver.exe");
		driver = new  ChromeDriver();
	}
	
	
	
	
	public static void navigate_To_OnlineCalculator()
	{
		driver.get(WEBURL);
		new WebDriverWait(driver, Duration.ofMillis(10000)).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(ifullFrame));
		canvas = new WebDriverWait(driver, Duration.ofMillis(10000)).until(ExpectedConditions.elementToBeClickable(calculatorCanvas));
		dl = canvas.getRect();
		System.out.println("sysioos");
		System.out.println(XAXIS);
		System.out.println((YAXIS));
			}
	
	
	
	public static void initializeCalculator() throws InterruptedException 
	{
		System.out.println("Hello");
		
		try {
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
		} catch (MoveTargetOutOfBoundsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Thread.sleep(3000);
		//clearScreen();
	}
	//Numbers
	public static void closeBrowser()
	{
		driver.quit();
	}
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
	public static void prese2()	{try {
		new Actions(driver).moveToElement(canvas, 0, 0).moveByOffset(XAXIS-69,YAXIS*10).click().build().perform();
	} catch (MoveTargetOutOfBoundsException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}}
	public static void prese3()	{try {
		new Actions(driver).moveToElement(canvas, 0, 0).moveByOffset(XAXIS,YAXIS*10).click().build().perform();
	} catch (MoveTargetOutOfBoundsException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}}
	public static void prese4()	{try {
		new Actions(driver).moveToElement(canvas, 0, 0).moveByOffset(XAXIS-139,YAXIS*1).click().build().perform();
	} catch (MoveTargetOutOfBoundsException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}}
	
	public static void prese5()	{try {
		new Actions(driver).moveToElement(canvas, 0, 0).moveByOffset(XAXIS-69,YAXIS).click().build().perform();
	} catch (MoveTargetOutOfBoundsException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}}
	public static void prese6()	{try {
		new Actions(driver).moveToElement(canvas, 0, 0).moveByOffset(XAXIS,YAXIS).click().build().perform();
	} catch (MoveTargetOutOfBoundsException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}}
	public static void prese7()	{try {
		new Actions(driver).moveToElement(canvas, 0, 0).moveByOffset(XAXIS-139,YAXIS*-1).click().build().perform();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}}
	public static void prese8()	{try {
		new Actions(driver).moveToElement(canvas, 0, 0).moveByOffset(XAXIS-69,YAXIS*-1).click().build().perform();
	} catch (MoveTargetOutOfBoundsException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}}
	public static void prese9()	{try {
		new Actions(driver).moveToElement(canvas, 0, 0).moveByOffset(XAXIS, YAXIS*-1).click().build().perform();
	} catch (MoveTargetOutOfBoundsException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}}
	public static void prese0()	{try {
		new Actions(driver).moveToElement(canvas, 0, 0).moveByOffset(XAXIS-139,YAXIS*15).click().build().perform();
	} catch (MoveTargetOutOfBoundsException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}}
	
	//org.openqa.selenium.interactions.MoveTargetOutOfBoundsException
	
	//Equals 
	public static void equalsTo() {
		try {
			Thread.sleep(3000);
			new Actions(driver).moveToElement(canvas, 0, 0).moveByOffset(139,150).click().build().perform();
		} catch (MoveTargetOutOfBoundsException e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}}
	public static void divideBy() {try {
		new Actions(driver).moveToElement(canvas, 0, 0).moveByOffset(XAXIS+69,-10).click().build().perform();
	} catch (MoveTargetOutOfBoundsException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}}
	public static void multiplyBy() {try {
		new Actions(driver).moveToElement(canvas, 0, 0).moveByOffset(XAXIS+69,10).click().build().perform();
	} catch (MoveTargetOutOfBoundsException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}}
	public static void subtractFrom() {try {
		new Actions(driver).moveToElement(canvas, 0, 0).moveByOffset(XAXIS+69,100).click().build().perform();
	} catch (MoveTargetOutOfBoundsException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}}
	public static void clearScreen() {try {
		new Actions(driver).moveToElement(canvas, 0, 0).moveByOffset(XAXIS+139,YAXIS*-10).click().build().perform();
	} catch (MoveTargetOutOfBoundsException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}}


}
