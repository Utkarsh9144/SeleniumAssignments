package com.assignments;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSizeOfBrowserWindow {
	static WebDriver driver;
	static String url="http://amazon.in";
	
	@BeforeClass
	public static void setEnvironment()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
	}
	
	@AfterClass
	public static void closeDriver(){
		
		driver.close();
	}
	
	@Test
	public void setTheSizeofBrowserAssignment() throws Exception{
		Dimension dimension=new Dimension(500, 250);
		
		driver.manage().window().setSize(dimension);
		Thread.sleep(3000);
		
	}

}
