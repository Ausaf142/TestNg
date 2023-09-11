package MyFirstPackage;
/*All locators are of 8 type
 1>id
 2>name
 3>class
 
 
   
 3>linkText
 4>partialLinktext
 5>tagName
 6>CssSelector
 7>Xpath--byAtttributes/index/contains/ancestor/text*/

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//we will solve Xpath expression for dynamic
public class Locators_All {
//public static void main(String[] args) {
//	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
//	WebDriver driver=new ChromeDriver();
//	driver.get("https://www.myntra.com/myntra-fashion-store?f=Gender%3Amen%20women%2Cwomen");
//	driver.findElement(By.xpath("(//img[@class='img-responsive'])[1]")).click();
//	                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
//}
	
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.cricbuzz.com/cricket-team/india/2/players");
	driver.findElement(By.xpath("//a[@class=\"cb-col cb-col-50\"]/ancestor::div[@id='series-news-list']/descendant::div[text()='Virat Kohli']")).click();
	
	
	
	}
}
