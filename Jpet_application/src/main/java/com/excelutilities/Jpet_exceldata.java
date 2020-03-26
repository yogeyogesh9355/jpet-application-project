package com.excelutilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Jpet_exceldata {
	//to get username from excel data
	public  String excel_username(int i) throws IOException 
	{	  
		FileInputStream fil = new FileInputStream(new File("src/test/resources/test_data/jpet_test_data.xlsx"));
		XSSFWorkbook workbook = new XSSFWorkbook(fil);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		XSSFRow row =sheet.getRow(i);
		XSSFCell cell =row.getCell(0);
		cell.setCellType(CellType.STRING);
		String un =cell.getStringCellValue();
		return un;
	}
			
	// to get password from excel data
	public  String excel_password(int i) throws IOException 
	{ 
		FileInputStream fil = new FileInputStream(new File("src/test/resources/test_data/jpet_test_data.xlsx"));
		XSSFWorkbook workbook = new XSSFWorkbook(fil);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		XSSFRow row =sheet.getRow(i);
		XSSFCell cell1 =row.getCell(1);
		cell1.setCellType(CellType.STRING);
		String pwd =cell1.getStringCellValue();
		return pwd;
		
	}
}
