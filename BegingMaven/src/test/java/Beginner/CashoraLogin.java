package Beginner;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class CashoraLogin {
	public WebDriver driver=null;
@Test
@Parameters("browser")
public void test(String browser)
{
//	WebDriver driver=new ChromeDriver();
	
	if(browser.equalsIgnoreCase("chrome"))
		driver=new ChromeDriver();
	else if(browser.equalsIgnoreCase("edge")) {
		driver=new EdgeDriver();
	}
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://cashora.com/");
	driver.findElement(By.xpath("//button[text()='Already a member? Log In']")).click();
	driver.findElement(By.id("login_mobile")).sendKeys("8800877601");
	driver.findElement(By.id("login_password")).sendKeys("admin123");
	driver.findElement(By.className("loginbtn")).click();
//	driver.quit();
	
	
}
@Test
public void thread() {
	System.out.println("Cashora : " +Thread.currentThread().getName());
}
@Test  (groups="smoke")
public void Me() {
	System.out.println("Print Me");
}
@Test  (groups="system")
public void Metoo() {
	System.out.println("Print MeToo");
}
}
