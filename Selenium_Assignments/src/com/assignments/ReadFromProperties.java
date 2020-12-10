package com.assignments;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadFromProperties {
	
	public static void main(String[] args)  {
		
		  File file = new File("C:\\Users\\hp\\git\\SeleniumAssignments1\\Selenium_Assignments\\dataFile.properties");
		  
			FileInputStream fileInput = null;
			try {
				fileInput = new FileInputStream(file);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			Properties prop = new Properties();
			
			//load properties file
			try {
				prop.load(fileInput);
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (1)\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();

			driver.get(prop.getProperty("URL"));
			driver.findElement(By.id("login_field")).sendKeys(prop.getProperty("username"));
			driver.findElement(By.id("password")).sendKeys(prop.getProperty("password"));
			driver.findElement(By.name("commit")).click();
			
			
			System.out.println("URL ::" + prop.getProperty("URL"));
			System.out.println("User name::" +prop.getProperty("username"));
		    System.out.println("Password::" +prop.getProperty("password"));
	  }
	}


