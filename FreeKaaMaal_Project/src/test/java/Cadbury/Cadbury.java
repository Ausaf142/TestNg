package Cadbury;

import java.io.File;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

import GenericUtility.ExcelUtility;

public class Cadbury {
	
	public static void main(String[] args) throws Throwable {
		 String excelPtah="./Cadbury.xlsx";
		 String page ="Sheet1";
//		 int cell=0;
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://cadburygifting.in/track-my-order/");
		
			for(int row=0;row<4;row++) {
				System.out.println(row);
				int cell=0;
				ExcelUtility excel =new ExcelUtility();
				String id =excel.getNumericCellValue(excelPtah,page,row,cell);
//			    System.out.println(id);
				
				int cell2=cell+1;
				String email = excel.getStringCellValue(excelPtah,page,row,cell2);
//			    System.out.println(email);


				driver.findElement(By.id("trackOderId")).sendKeys("00"+id);
				driver.findElement(By.id("email")).sendKeys(email);
//
				Thread.sleep(1000);
				driver.findElement(By.xpath("//button[text()='Track Order']")).click();
				Thread.sleep(4000);

				int cell3=cell2+1;
				String status = driver.findElement(By.xpath("(//div[@class='right']/.)[1]")).getText();
//				String status = driver.findElement(By.xpath("//div[@class='right']/../.")).getText();

				excel.writeValue(excelPtah, page, row, cell2, cell3, status);
				String amount = driver.findElement(By.xpath("//span[@class='total-amount']")).getText();
				int cell4=cell2+2;
				excel.writeValue(excelPtah, page, row, cell2, cell4, amount);
//				String status = driver.findElement(By.xpath("//div[@class='right']/ancestor::div[@class='order-details-out']")).getText();
				
				System.out.println(status);
				driver.navigate().refresh();
			
			}
	   System.out.println("EXCEL SHEET AUTO RUN COMPLETED");
	   driver.quit();
}
}