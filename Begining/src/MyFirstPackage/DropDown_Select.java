package MyFirstPackage;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/*Drop Down is handle by Select Obj and all select methods*/

public class DropDown_Select {
public static void main(String[] args)throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
		WebElement drop=driver.findElement(By.id("multiselect1"));
		Select sel =new Select(drop);
		System.out.println(sel.isMultiple());
		sel.selectByIndex(0);
		sel.selectByValue("swiftx");
		sel.selectByVisibleText("Hyundai");
		Thread.sleep(3000);
		sel.deselectAll();
		
		driver.quit();
}
}
