package com.assignments;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateGoogleAccount {
	
	static WebDriver driver;
	static String url="https://accounts.google.com/signup";
	
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
	public void SignupGoogleAccount() {
		WebElement firstName=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div[1]/div[1]/div/div[1]/div/div[1]/input"));
		firstName.sendKeys("Utkarsh");
		String f1=firstName.getAttribute("value");
		System.out.println("FirstName:"+f1);
		
		WebElement lastName=driver.findElement(By.name("lastName"));
		lastName.sendKeys("Agrawal");
		String l1=lastName.getAttribute("value");
		System.out.println("LastName:"+l1);
		WebElement use=driver.findElement(By.name("Username"));
		use.sendKeys("utkarsh29031997");
		String user=use.getAttribute("value");
		System.out.println("UserName:"+user);
		
		
		WebElement pas=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[3]/div[1]/div/div/div[1]/div/div[1]/div/div[1]/input"));
		pas.sendKeys("Utkarsh@123");
		String pass=pas.getAttribute("value");
		System.out.println("Password:"+pass);
		
		WebElement cnfrmPass=driver.findElement(By.name("ConfirmPasswd"));
		cnfrmPass.sendKeys("Utkarsh@123");
		String p=cnfrmPass.getAttribute("value");
		System.out.println("ConfirmPassword:"+p);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/div/button/div[2]")).click();
}
}
