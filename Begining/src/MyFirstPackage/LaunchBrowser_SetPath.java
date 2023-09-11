package MyFirstPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser_SetPath {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\Begining\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
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
}
