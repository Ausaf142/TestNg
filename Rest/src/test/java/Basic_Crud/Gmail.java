package Basic_Crud;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Gmail {
@Test
public void gmail() throws InterruptedException {
	WebDriver driver =new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.navigate().to("https://mail.google.com/mail/u/0/#inbox");

	driver.findElement(By.name("identifier")).sendKeys("");
	driver.findElement(By.xpath("//span[text()='Next']")).click();
	Thread.sleep(1000);
	driver.findElement(By.name("Passwd")).sendKeys("Ankit@123");
	driver.findElement(By.name("Passwd")).sendKeys(Keys.ENTER);
	
	Thread.sleep(1000);
	driver.findElement(By.xpath("//button[text()='No thanks']")).click();
	driver.findElement(By.xpath("//div[text()='Compose']")).click();
	

	driver.findElement(By.xpath("//input[@peoplekit-id=\"BbVjBd\"]")).sendKeys("chandraketus3@gmail.com");

	driver.findElement(By.xpath("//div[@aria-label=\"Message Body\"]")).sendKeys("MESSAGE");
	driver.findElement(By.xpath("//div[text()='Send']")).click();
	driver.close();
	
}
}
