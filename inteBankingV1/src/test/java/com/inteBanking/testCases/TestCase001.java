package com.inteBanking.testCases;

import org.testng.Reporter;
import org.testng.annotations.Test;
import com.inteBanking.pageObjects.LoginPage;

public class TestCase001 extends BaseClass{
	@Test
	public void loginTest() {
		
		driver.get(baseURI);
		LoginPage lp = new LoginPage(driver);
		lp.setUsername(username);
		lp.setpwd(password);
		lp.idsubmit();
		Reporter.log("Opening browser",true);
		
	}

}
