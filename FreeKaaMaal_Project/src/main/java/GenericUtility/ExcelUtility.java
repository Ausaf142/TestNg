package GenericUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
public String getStringCellValue(String path,String pageName,int row,int cell) throws EncryptedDocumentException, IOException {
	FileInputStream fis = new FileInputStream(path);
	Workbook wb = WorkbookFactory.create(fis);
	Sheet sheet = wb.getSheet(pageName);
	Row r = sheet.getRow(row);
	String data = r.getCell(cell).getStringCellValue();
//	String PWD=sheet.getRow(row).getCell(cell).getStringCellValue();
	return data;
}
public String getNumericCellValue(String path,String pageName,int row,int cell) throws EncryptedDocumentException, IOException {
	FileInputStream fis = new FileInputStream(path);
	Workbook wb = WorkbookFactory.create(fis);
	Sheet sheet = wb.getSheet(pageName);
double UN = sheet.getRow(row).getCell(cell).getNumericCellValue();
long UNLong=(long)UN;  
String USER=String.valueOf(UNLong);
return USER;
}
public static void writeValue(String path,String pageName,int row,int cell,int inputcellNo,String output) throws EncryptedDocumentException, IOException {
	FileInputStream fis = new FileInputStream(path);
	Workbook wb = WorkbookFactory.create(fis);
	Sheet sheet = wb.getSheet(pageName);
	Row r = sheet.getRow(row);
		   
			r.createCell(inputcellNo).setCellValue(output);
			FileOutputStream fos = new FileOutputStream(path);
			wb.write(fos);
			fos.close();
	
}
}
