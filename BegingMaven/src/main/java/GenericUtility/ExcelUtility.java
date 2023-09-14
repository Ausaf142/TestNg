package GenericUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
public String getUrlAndPass(String path,String pageName,int row,int cell) throws EncryptedDocumentException, IOException {
	FileInputStream fis = new FileInputStream(path);
	Workbook wb = WorkbookFactory.create(fis);
	Sheet sheet = wb.getSheet(pageName);
	String data = sheet.getRow(row).getCell(cell).getStringCellValue();
	
//	String PWD=sheet.getRow(row).getCell(cell).getStringCellValue();
	return data;
}
public String getUser(String path,String pageName,int row,int cell) throws EncryptedDocumentException, IOException {
	FileInputStream fis = new FileInputStream(path);
	Workbook wb = WorkbookFactory.create(fis);
	Sheet sheet = wb.getSheet(pageName);
double UN = sheet.getRow(row).getCell(cell).getNumericCellValue();
long UNLong=(long)UN;  
String USER=String.valueOf(UNLong);
return USER;
}
}