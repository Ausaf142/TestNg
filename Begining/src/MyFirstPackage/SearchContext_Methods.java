package MyFirstPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchContext_Methods {
public static void main(String[] args) throws Throwable {
	System.setProperty("window.chrome.driver", "./driver/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://cashora.com/");
	driver.findElement(By.xpath("//button[text()='Already a member? Log In']")).click();
	driver.findElement(By.id("login_mobile")).sendKeys("8800877601");
	driver.findElement(By.id("login_password")).sendKeys("admin123");
	driver.findElement(By.className("loginbtn")).click();
//	driver.navigate().to("https://www.facebook.com/");//to go subURL in the same tab and window
	
	driver.switchTo().newWindow(WindowType.TAB); //new tab or You can open new window by Uppercase "WINDOW"


	driver.get("https://www.facebook.com/");
	Thread.sleep(3000);
	 
	driver.close();	//it close running window or Tab
//	driver.quit();	//it close complete window
	
}
}
