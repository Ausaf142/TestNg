package com.inteBanking.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;
import org.testng.reporters.jq.Main;

public class Excelutility {
	
public String valueFromSheet(String sheetname,int rowNum,int cellNum) throws IOException {
	
	FileInputStream fis = new FileInputStream("./Guru99.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	Sheet sheet = wb.getSheet(sheetname);
	Row row = sheet.getRow(rowNum);
	Cell cell = row.getCell(cellNum);
	String value = cell.getStringCellValue();
	return value;

}
	
}
