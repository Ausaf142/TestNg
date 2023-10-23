package Beginner;

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
		 int cell=0;
		 int cell2=0;
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("https://cadburygifting.in/track-my-order/");
			for(int row = 0;row<=2;row++) {
				
				ExcelUtility excel =new ExcelUtility();
				String email = excel.getUrlAndPass(excelPtah, page, row, cell);
				System.out.println(email);
				cell2=cell+1;
				String id =excel.getUser(excelPtah, page, row, cell2);
				System.out.println(id);

//				WebDriver driver = new ChromeDriver();
//				driver.manage().window().maximize();
//				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//				driver.get("https://cadburygifting.in/track-my-order/");
				
				driver.findElement(By.id("trackOderId")).sendKeys("00"+id);
				driver.findElement(By.id("email")).sendKeys(email);
//				driver.findElement(By.xpath("//button[@aria-label=\"Close Banner\"]/ancestor::div[@class='ot-sdk-row']/descendant::button[contains(@class,'onetrust-close-btn-handler onetrust-close-btn-ui banner-close-button onetrust-lg close-icon')]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//button[text()='Track Order']")).click();
				Thread.sleep(4000);
//				TakesScreenshot ts= (TakesScreenshot)driver;
//				File SS =ts.getScreenshotAs(OutputType.FILE);
//				File f =new File("./New folder/"+id+".png");
//				Files.copy(SS, f);
				
				String status = driver.findElement(By.xpath("//div[@class='right']/../.")).getText();
//				String status = driver.findElement(By.xpath("//div[@class='right']/ancestor::div[@class='order-details-out']")).getText();
				
				System.out.println(status);
				driver.navigate().refresh();
			}
		
		
		
		
		
}
}