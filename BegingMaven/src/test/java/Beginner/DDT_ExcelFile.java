package Beginner;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DDT_ExcelFile {
public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	FileInputStream fis =new FileInputStream("./Cadbury.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	Sheet sheet = wb.getSheet("Sheet1");
	String URL = sheet.getRow(0).getCell(1).getStringCellValue();
	double UN = sheet.getRow(1).getCell(1).getNumericCellValue(); //ye mtd double mein return krta hai
	long UNLong=(long)UN;   
	//int mein parsing krna muskil hai qk max capacity of int is small then double and long.int itna chhota hai k usme ni hoga isliye long me krdo
	
	/*Mean double convert hoga but usme decimal bhi hoga barde number isliye long mein parse kro usk bad string mein better hoga*/
	String USER=String.valueOf(UNLong);
//	double phoneNumber = sheet.getRow(1).getCell(1).getNumericCellValue();
//	String phoneNumberString = String.valueOf((long) phoneNumber); // Convert double to String

	String PWD=sheet.getRow(2).getCell(1).getStringCellValue();
	System.out.println(URL);
//	System.out.println(phoneNumberString);
	System.out.println(USER);
	System.out.println(PWD);
	driver.get(URL);
	driver.findElement(By.xpath("//button[text()='Already a member? Log In']")).click();
	driver.findElement(By.id("login_mobile")).sendKeys(USER);
	driver.findElement(By.id("login_password")).sendKeys(PWD);
	driver.findElement(By.className("loginbtn")).click();
		
	Thread.sleep(4000);
	driver.quit();
	
}
}
