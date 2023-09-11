package TestCases;


import org.testng.Assert;
import org.testng.annotations.Test;
import GenericUtility.BaseClass;
import GenericUtility.JavaUtility;
import PomClasses.AddUser;
import PomClasses.HomePage;

public class NewUser extends BaseClass {
@Test
public void user() {
	JavaUtility rNum = new JavaUtility();
	int number = rNum.getRandomNumber();
	HomePage hp = new HomePage(driver) ;
		hp.addNewUser();
		AddUser auser = new AddUser(driver);
	 

	 auser.AddNewUserMale("bablu", "14-02-1996", "jasolla", "delhi", "NCR", "234234", "4554544", "s@g.com"+number,"78457"+number);
}
//@Test
//public void FailTest() {
//Assert.assertTrue(false);
//System.out.println("this is fail test cases");
//}
}
