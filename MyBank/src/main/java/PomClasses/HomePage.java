package PomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
public HomePage(WebDriver driver) {
	PageFactory.initElements(driver , this );
}
@FindBy (xpath="//a[text()='New Customer']") 
private WebElement newuser;
@FindBy (xpath="//a[text()='Delete Customer']") 
private WebElement deleteuser;












public WebElement getNewuser() {
	return newuser;
}
public WebElement getDeleteuser() {
	return deleteuser;
}
public void addNewUser() {
	newuser.click();
}
 public void deleteNewUser() {
	deleteuser.click();
}
}
