package Beginner;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowHandle {
@Test
public void campaignWithProduct() throws InterruptedException {
	String product="hari";
	String camp="me";
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("http://localhost:8888/index.php?action=index&module=Home");
	driver.findElement(By.name("user_name")).sendKeys("admin");
	driver.findElement(By.name("user_password")).sendKeys("admin");
	driver.findElement(By.id("submitButton")).click();
 
	driver.findElement(By.xpath("//a[text()='More']")).click();
	driver.findElement(By.xpath("//a[text()='Campaigns']")).click();	
	driver.findElement(By.xpath("//img[@alt='Create Campaign...']")).click();
	String Pid = driver.getWindowHandle();
	driver.findElement(By.xpath("//img[@alt='Select']")).click();
	Thread.sleep(2000);
	Set <String>Childid = driver.getWindowHandles();

		   Iterator<String> iterator = Childid.iterator();
		   while (iterator.hasNext()) {
		       String win = iterator.next();
		       if (!win.equalsIgnoreCase(Pid)) {
		           driver.switchTo().window(win); // Switch to the current window
		           driver.findElement(By.id("search_txt")).sendKeys(product); // Find an element by ID and input "product"
		           driver.findElement(By.name("search")).click(); // Find an element by name and click it
		           driver.findElement(By.xpath("//a[text()='" + product + "']")).click(); // Find an element by XPath and click it
		           break; // Exit the loop
		       }
		   }

	
//	for(String win:Childid) {
//	if(!win.equalsIgnoreCase(Pid)) {
//		driver.switchTo().window(win);
//		driver.findElement(By.id("search_txt")).sendKeys(product);
//		driver.findElement(By.name("search")).click();
//		driver.findElement(By.xpath("//a[text()='"+product+"']")).click();
//		break;
//	}
//	}	
	
	
	driver.switchTo().window(Pid);
	driver.findElement(By.name("campaignname")).sendKeys(camp);
	driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
	
}
}
