package com.assignments;

import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomisedXpath {
	
	static WebDriver driver;
	static String url="https://www.google.com";
	
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
	public void test() throws InterruptedException {
		
		driver.findElement(By.xpath(".//*[@name='q']")).sendKeys("icici");
		Thread.sleep(3000);
		List<WebElement> list=driver.findElements(By.xpath("//ul[@class='erkvQe']/li"));
		for(WebElement element:list)
		{
			if(element.getText().trim().equals("icici net banking"))  
			{
				element.click();
				break;
			}
		}
		Thread.sleep(5000);
	
	}
	
	

}
