package Beginner;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {
	public static void main(String[] args) throws Throwable {
//		System.setProperty("window.chrome.driver", "./driver/chromedriver.exe");
//		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://cashora.com/");
		driver.findElement(By.xpath("//button[text()='Already a member? Log In']")).click();
		driver.findElement(By.id("login_mobile")).sendKeys("8800877601");
		driver.findElement(By.id("login_password")).sendKeys("admin123");
		driver.findElement(By.className("loginbtn")).click();
}
}