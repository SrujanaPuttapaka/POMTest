package com.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestUtil {

	public static long page_load_time =10;
	public static long implicit_time =10;
	public static String test_data_path="C:\\Users\\sputtapaka\\MyEclispse\\POMTest\\src\\main\\java\\com\\Testdata\\Sruj.xlsx";
	
	public static Object[][] getData(String sheetname) throws IOException
	{
		FileInputStream fis =null;
		try {
			fis = new FileInputStream(test_data_path);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheetAt(1);
		Object [][] data = new Object [sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		for(int i=0;i<sheet.getLastRowNum();i++)
		{
			for(int k=0;k<sheet.getRow(0).getLastCellNum();k++)
			{
				data[i][k]=sheet.getRow(i+1).getCell(k).toString();
			
			}}
		return data;
	}

}