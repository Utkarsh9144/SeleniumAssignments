package com.assignments;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ScriptToReadExcelFileAssignment {
	
	@Test
	public void readExcelData() throws IOException{
		File file=new File("D:\\Excel01.xlsx");
		FileInputStream input=new FileInputStream(file);
		XSSFWorkbook workbook=new XSSFWorkbook(input);
		XSSFSheet xs=workbook.getSheet("Sheet1");
		int rowNumber=xs.getLastRowNum();
		int column=xs.getRow(0).getLastCellNum();
		for(int i=0;i<=rowNumber;i++){
			XSSFRow row=xs.getRow(i);
			for(int j=0;j<column;j++){
				String value= row.getCell(j).toString();
				System.out.println(value+" ");
			}
		}
		
		
	}
	

	

}
