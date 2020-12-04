package com.assignments;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextWithoutSendKeys {
	
	static WebDriver driver;
	static String url="https://github.com/login";
	
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
	public void textWithoutSendKeysTest() throws Exception{
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("document.getElementById('login_field').value='Utkarsh@gmail.com'");
		js.executeScript("document.getElementById('password').value='Utkarsh@01'");
		driver.findElement(By.name("commit")).click();
		Thread.sleep(5000);
		
		
	}

}
