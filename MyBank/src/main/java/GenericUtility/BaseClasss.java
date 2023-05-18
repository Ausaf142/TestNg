package GenericUtility;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class BaseClasss {
	
	public WebDriver driver;
	
	@BeforeSuite
	public void BS() {
	System.out.println("Conectiong to the database");
	}
	@BeforeTest
	public void BT() {
		System.out.println("Execute Script in parallel mode");		
	}
	@BeforeClass
	public void BC() {
		System.out.println("launching the Browser");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	}
	@BeforeMethod
	public void BM() throws IOException {
		System.out.println("Login taken");
		Excelutility elib=new Excelutility();
		String url = elib.valueFromSheet("inteBank", 0, 1);
		String un = elib.valueFromSheet("inteBank", 1, 1);
		String pw = elib.valueFromSheet("inteBank", 2, 1);
		driver.get(url);
		LoginPage lp = new LoginPage(driver);
	}

	@AfterMethod
	public void AM() {
		System.out.println("Logout placed");
		
	}
	@AfterClass
	public void AC() {
		System.out.println("close the browser");
	}

	@AfterTest
	public void AT() {
		System.out.println("stop the execution");
	}
	@AfterSuite
	public void AS() {
		System.out.println("Disconnected to the databases");
	}
}

