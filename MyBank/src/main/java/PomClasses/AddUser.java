package PomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddUser {
	public AddUser(WebDriver ldriver) {
		PageFactory.initElements(ldriver , this );
	}
	
	@FindBy(name="name")
	WebElement username;
	@FindBy(xpath="//input[@value='m']")
	WebElement userMale;
	@FindBy(xpath="//input[@value='f']")
	WebElement userFemale;
	@FindBy(id="dob")
	WebElement userdob;
	@FindBy(name="addr")
	WebElement userAdd;
	@FindBy(name="city")
	WebElement userCity;
	@FindBy(name="state")
	WebElement userState;
	@FindBy(name="pinno")
	WebElement userPin;
	@FindBy(name="telephoneno")
	WebElement userMob;
	@FindBy(name="emailid")
	WebElement userId;
	@FindBy(name="password")
	WebElement userpwd;
	@FindBy(name="sub")
	WebElement userSubmit;
	
	public void AddNewUserMale(String uname,String dob,String add,String city,String state,String pin,String ph,String eid,String pass) {
		username.sendKeys(uname);
		userMale.click();
		userdob.sendKeys(dob);
		userAdd.sendKeys(add);
		userCity.sendKeys(city);
		userState.sendKeys(state);
		userPin.sendKeys(pin);
		userMob.sendKeys(ph);
		userId.sendKeys(eid);
		userpwd.sendKeys(pass);
		userSubmit.click();
	}
	
	
	
	
	
	
	
	
}
