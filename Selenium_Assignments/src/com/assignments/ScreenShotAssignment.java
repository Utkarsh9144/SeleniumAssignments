package com.assignments;

import java.io.File;
import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotAssignment {
	
	static WebDriver driver;
	static String url="https://api.jquery.com/dblclick/";
	
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
	public void screenShotTest(){
		File screenShot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try{
			FileHandler.copy(screenShot, new File("D:\\screenshot.png"));
			
		} catch (IOException e){
			System.out.println("Exception is"+e.getMessage());
		}
	}
	
	

}
