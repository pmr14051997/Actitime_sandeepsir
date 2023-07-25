package com.actitime.generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLib {
	public String getpropertydata(String key) throws IOException
	{
		FileInputStream fis=new FileInputStream("./data/dataproject.property");
		Properties p=new Properties();
		p.load(fis);
		String data=p.getProperty(key);
		return data;
	}
	public String getexceldata(String Sheetname,int row,int cell) throws IOException
	{
		FileInputStream fis=new FileInputStream("./data/testdata1.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		String data = wb.getSheet(Sheetname).getRow(row).getCell(cell).getStringCellValue();
		return data;
	}

}
