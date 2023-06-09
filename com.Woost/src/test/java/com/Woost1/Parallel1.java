package com.Woost1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Parallel1 {
	public WebDriver driver=null;
	@Test 
	@Parameters("browser")
public void Test1(String browser) {
	
	if(browser.equalsIgnoreCase("chrome")) {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("Edge")) {
			WebDriverManager.edgedriver().setup();
			 driver=new EdgeDriver();
			 }
	driver.get("https://freekaamaal.com/");
	System.out.println("test1 |" + Thread.currentThread().getId());
	
}


}
