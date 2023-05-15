package com.inteBanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver ldriver;
	 public LoginPage(WebDriver rdriver){
		 ldriver=rdriver;
		PageFactory.initElements(rdriver, this );
	}
	@FindBy(name="uid")
	WebElement txtusername;
		
	@FindBy(name="password")
	
	WebElement txtuserpwd;
	
	@FindBy(name="btnLogin")
	
	WebElement usersubmit;

	
	public void setUsername(String uname) {
		txtusername.sendKeys(uname);
	}
	public void setpwd(String pass) {
		txtuserpwd.sendKeys(pass);
	}
	public void idsubmit() {
		usersubmit.click();
	}
}
