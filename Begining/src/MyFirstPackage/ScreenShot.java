package MyFirstPackage;


import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenShot {
	public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://freekaamaal.com/");
	TakesScreenshot ts =(TakesScreenshot)driver;
//	File src = ts.getScreenshotAs(OutputType.FILE);
	WebElement ele = driver.findElement(By.xpath("(//img[@alt=\"Freekaamaal.com\"])[1]"));
	File pic = ele.getScreenshotAs(OutputType.FILE);
	File dest=new File("./ss1.png");
	Files.copy(pic, dest);
	

	
}
}