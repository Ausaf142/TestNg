package MyFirstPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://jqueryui.com/draggable/");
	
//	driver.get("http://omayo.blogspot.com/");
//	WebElement target = driver.findElement(By.id("blogsmenu"));
//	act.moveToElement(target).perform();
//	act.contextClick(driver.findElement(By.className("widget-content"))).perform();
//	act.doubleClick(driver.findElement(By.xpath("//button[contains(text(),'Double')]"))).perform();
	
	Actions act = new Actions(driver);
	act.keyDown(Keys.ARROW_DOWN).perform();
	driver.switchTo().frame(0);
	WebElement drag =driver.findElement(By.xpath("//p[contains(text(),'Drag')]"));
	act.dragAndDropBy(drag, 300, 10).perform();
	driver.switchTo().defaultContent();
	act.moveByOffset(0, 0).perform();

	Thread.sleep(2000);
	driver.quit();
}
}
