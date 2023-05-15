package com.inteBanking.testCases;

import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClass {
public String baseURI="http://demo.guru99.com/v3/index.php";
public String username="mngr503226";
public String password="dUnAbuj";
public  WebDriver driver;






@BeforeTest
public void setup() {
	Reporter.log("Opening browser",true);
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\inteBankingV1\\Drivers\\chromedriver.exe");
	
	driver = new ChromeDriver();

}
@AfterTest
public void tear() {
	driver.quit();
}






	

}
