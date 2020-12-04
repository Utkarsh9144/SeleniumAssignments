package com.assignments;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyPinCodesAssignment {
	
	static WebDriver driver;
	static String url="https://chennaiiq.com/chennai/pincode-by-name.php";
	
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
	public void verifyPinCodes() throws Exception{
		
		WebElement pincode1=driver.findElement(By.xpath("/html/body/table/tbody/tr[3]/td[2]/table[1]/tbody/tr[53]/td[2]"));
		WebElement pincode2=driver.findElement(By.xpath("/html/body/table/tbody/tr[3]/td[2]/table[1]/tbody/tr[86]/td[2]"));
		Assert.assertNotEquals(pincode1, pincode2);
		System.out.println("Both pincodes are different");
		Thread.sleep(5000);
		
	}
	

}
