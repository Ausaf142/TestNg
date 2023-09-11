package MyFirstPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//There are 14 Abstract-Method which are required for webpage action
/*
 1>click()
 2>sendKeys()
 3>getText()
 4>clear()
 5>getTagName()
 6>submit()
 7>getSize()
 8>getLoacation()
 9>getReact()
 10>getAttribute()
 11>getCSSValue
 12>isSelect()
 13>isEnable()                       
 14>isDisplayed
 */
public class WebElements_Methods {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.get("https://www.ironspider.ca/forms/checkradio.htm");
//	JavascriptExecutor js= (JavascriptExecutor)driver;
//	WebElement ele = driver.findElement(By.xpath("//input[@name='color'][1]"));
//	js.executeScript("arguments[0].scrollIntoView();", ele);
//	js.executeScript("window.scrollBy(0,600)");
	
	
	driver.get("https://www.google.com/");
	boolean result = driver.findElement(By.xpath("//div[@jsname=\"gLFyf\"]")).isEnabled();
	System.out.println(result);
	boolean result2 = driver.findElement(By.xpath("//div[@jsname=\"gLFyf\"]")).isDisplayed();
	System.out.println(result2);
	boolean result3 = driver.findElement(By.xpath("//div[@jsname=\"gLFyf\"]")).isSelected();
	System.out.println(result3);
	
	

}
}
