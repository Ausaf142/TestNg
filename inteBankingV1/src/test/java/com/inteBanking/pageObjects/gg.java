package com.inteBanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class gg {
	public  WebDriver driver;
	@Test
	public void launch() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\inteBankingV1\\Drivers\\chromedriver.exe");
		 driver=new ChromeDriver();
		
	
	}

}
