package PomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LPage {
	
public LPage(WebDriver ldriver) {
	PageFactory.initElements(ldriver, this);
}
	@FindBy(name="uid")
	WebElement userid;
	@FindBy(name="password")
	WebElement userpwd;
	@FindBy(name="btnLogin")
	WebElement idLogin;
	




	public void bankIdLogin(String bankid,String idpwd) {
		userid.sendKeys(bankid);
		userpwd.sendKeys(idpwd);
		idLogin.click();
	}
	
	
	
}

