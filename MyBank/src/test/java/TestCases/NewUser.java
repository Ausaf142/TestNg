package TestCases;


import org.testng.annotations.Test;
import GenericUtility.BaseClasss;
import GenericUtility.JavaUtility;
import PomClasses.AddUser;
import PomClasses.HomePage;

public class NewUser extends BaseClasss {
@Test
public void user() {
	JavaUtility rNum = new JavaUtility();
	int number = rNum.getRandomNumber();
	HomePage hp = new HomePage(driver) ;
		hp.addNewUser();
		AddUser auser = new AddUser(driver);
	 

	 auser.AddNewUserMale("ausaf", "14-02-1996", "jasolla", "delhi", "NCR", "234234", "4554544", "s@g.com"+number,"78457"+number);
}
}
