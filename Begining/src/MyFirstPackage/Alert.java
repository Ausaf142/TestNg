package MyFirstPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://nxtgenaiacademy.com/alertandpopup/");
	driver.findElement(By.name("alertbox")).click();
	Thread.sleep(1000);
	driver.switchTo().alert().dismiss();
	driver.findElement(By.name("confirmalertbox")).click();
	Thread.sleep(1000);
	driver.switchTo().alert().accept();
	driver.findElement(By.name("promptalertbox1234")).click();
	driver.switchTo().alert().sendKeys("yes");
	Thread.sleep(1000);
	driver.switchTo().alert().accept();
	Thread.sleep(1000);
	driver.quit();
}
}