package com.assignments;



import java.util.Iterator;
import java.util.Set;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindowPopup {
	
	static WebDriver driver;
	static String url="http://popuptest.com/goodpopups.html";
	
	
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
	public static void test()
	{
		
			driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td/font/b/a[4]")).click();
			Set<String> set1=driver.getWindowHandles();
			Iterator<String> it=set1.iterator();
			String parent=it.next();
			String child=it.next();
			driver.switchTo().window(child);
			System.out.println("Child Title:"+driver.getTitle());
			driver.close();
			driver.switchTo().window(parent);
			System.out.println("Parent Title :"+driver.getTitle() );
			
		}
	}
	

