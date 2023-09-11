package MyFirstPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbstractMethod_WebDriver {
	public static void main(String[] args) {
		System.setProperty("window.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		driver.manage().window().fullscreen();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://cashora.com/");
//		driver.navigate().refresh();
//		driver.switchTo().alert().accept();
		
		System.out.println(driver.getCurrentUrl());
//		System.out.println(driver.getPageSource());
		System.out.println(driver.getTitle());
		System.out.println(driver.getWindowHandle());
		System.out.println(driver.getWindowHandles());
		driver.close();
		driver.quit();               
		
		
	}
}
