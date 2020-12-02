package com.assignments;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollWebpageAssignment {
		
	static WebDriver driver;
	static String url="http://openclinic.sourceforge.net/openclinic/home/index.php";
	
	@BeforeClass
	public static void setEnvironment()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		
	}
	
	@AfterClass
	public static void closeDriver(){
		
		driver.close();
	}
	
	@Test
	public void scrollTest() throws Exception
	{
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		//js.executeScript("window.scrollBy(0,1000)");
		 js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		 Thread.sleep(5000);
		 
	}
}
