package com.assignments;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderAnnotationAssignment {
	
	@Test(dataProvider="getData")
	  public void setdata(String username,String password) 
		{
			System.out.println("UserName:"+username);
			System.out.println("Password:"+password);
			
	  }
		@DataProvider
		public Object[][] getData()
		{
			Object[][] data=new Object[2][2];
			data[0][0]="Utkarsh";
			data[0][1]="Utkarsh@123";
			data[1][0]="Ram";
			data[1][1]="Ram@123";
			return data;
		}
}
