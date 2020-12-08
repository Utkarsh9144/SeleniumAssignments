package com.assignments;

import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootStrapHandle {
	
	static WebDriver driver;
	static String url="https://www.jquery-az.com/boots/demo.php?ex=63.0_2";
	
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
	public void test() throws Exception {
		
		
		driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click();
		List<WebElement> list1=driver.findElements(By.xpath("//ul[contains(@class,'multiselect-container')]//li//a//label"));
		//For Java
		for(int i=0;i<list1.size();i++)
		{
			System.out.println(list1.get(i).getText());
			if(list1.get(i).getText().equals("Java"))
			{
				list1.get(i).click();
				
				break;
			}
		}
		
		}

}
