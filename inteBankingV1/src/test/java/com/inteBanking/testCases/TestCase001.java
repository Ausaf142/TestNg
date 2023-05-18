package com.inteBanking.testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;
import com.inteBanking.pageObjects.LoginPage;
import com.inteBanking.utilities.Excelutility;

public class TestCase001 extends BaseClass{
	Excelutility elib=new Excelutility();
	
	
	@Test
	public void loginTest() throws IOException {
		String url=elib.valueFromSheet(sheet, 0, 1);
		System.out.println(url);
		String un = elib.valueFromSheet(sheet, 1, 1);
		System.out.println(un);
		String pw = elib.valueFromSheet(sheet, 2, 1);
		System.out.println(pw);
		System.out.println(driver.getWindowHandle());
		driver.get(url);
		LoginPage lp = new LoginPage(driver);
		lp.setUsername(un);
		lp.setpwd(pw);
		lp.idsubmit();
		Reporter.log("Opening browser",true);
		System.out.println("yuppppppppppp");
	}

}
