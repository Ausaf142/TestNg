package Beginner;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class FB {
	public WebDriver driver;
@Test
//@Parameters("browser")
//public void LoginFB(String browser) throws InterruptedException {
	public void LoginFB() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
//	if(browser.equalsIgnoreCase("chrome"))
//			driver=new ChromeDriver();
//	else if(browser.equalsIgnoreCase("edge")) {
//			driver=new EdgeDriver();
//		}
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("https://www.facebook.com/");
	driver.findElement(By.id("email")).sendKeys("anaadimika@gmail.com");
	driver.findElement(By.id("pass")).sendKeys("naaz bano");
	driver.findElement(By.id("pass")).sendKeys(Keys.ENTER);
	Thread.sleep(5000);
	driver.switchTo().alert().dismiss();
	driver.findElement(By.xpath("//div[@class='x78zum5 x1n2onr6']")).click();
}
@Test
public void thread() {
	System.out.println("FB : " +Thread.currentThread().getId());
}
@Test  (groups="system")
public void You() {
	System.out.println("Print You");
}
@Test  (groups="smoke")
public void yootoo() {
	System.out.println("Print youtoo");
}
}
