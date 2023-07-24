package practice;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import utility.ScreenshotClass;

public class TC22_TakseScreenshot 
{
	
	static WebDriver driver;
	@Test
	public  void TakseScreenshot() throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		driver =new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://nmk.co.in/recruitment/");
		System.out.println("url opened");
		
		ScreenshotClass sc = new ScreenshotClass();
		sc.ScreenshotOfPage(driver, "Homepage");
	//	Screenshot("3");
			
		driver.close();
		System.out.println("Browser closed");
	}
}
