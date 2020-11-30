package com.assignments;


import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DraggnDropAssignment2 {
	static WebDriver driver;
	static String url="https://jqueryui.com/droppable/";
	
	@BeforeClass
	public static void setEnvironment()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
	}
	@AfterClass
	public static void closeDriver(){
		
		driver.close();
	}
	
	@Test
	public void testMethod() throws Exception
	{
		WebElement source= driver.findElement(By.id("draggable"));
		WebElement target= driver.findElement(By.id("droppable"));
		Actions action = new Actions(driver);
		Thread.sleep(3000);
		action.dragAndDrop(source, target).perform();
		Thread.sleep(3000);
		
	}
	

}
