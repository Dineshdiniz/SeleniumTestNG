package test.utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BaseClass {
	public static WebDriver driver;
	public static void launchBrowser() {
		System.setProperty("webdriver.driver.chrome", "C:/Users/dines/eclipse-workspace/SeleniumTestNG/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		
	}
	
	
}
