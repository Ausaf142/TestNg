package POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogIn {
	public LogIn(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
@FindBy(xpath="//button[text()='Already a member? Log In']")
WebElement ExistingMember;

@FindBy(id="login_mobile")
WebElement userName;

@FindBy(id="login_password")
WebElement password;

@FindBy(className = "loginbtn")
WebElement loginClick;


public void LoginPageCashora(String userId,String pwd) {
	ExistingMember.click();
	userName.sendKeys(userId);
	password.sendKeys(pwd);
	loginClick.click();
}
}