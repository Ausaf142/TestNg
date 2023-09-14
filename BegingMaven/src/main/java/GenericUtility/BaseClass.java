package GenericUtility;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import POMClasses.LogIn;

public class BaseClass implements Excel {

	
	public static WebDriver driver;
	public WebDriver edriver=null;
	
	@BeforeSuite
	public void BS() {
	System.out.println("Conectiong to the database");
	}
	
	@BeforeTest
	public void BT() {
		System.out.println("Execute Script in parallel mode");		
	}
	
	
//	@Parameters("Browser")
	@BeforeClass 
//	public void BC(String Browser) {
	public void BC() {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			
		}
	
	@BeforeMethod
	public void BM() throws EncryptedDocumentException, IOException {
//		System.out.println("Login execution from excel-sheet");
		ExcelUtility elib=new ExcelUtility();
		String URL = elib.getUrlAndPass(excelPtah, page, 0, 1);
		String UN = elib.getUser(excelPtah,page, 1, 1);
		String PW = elib.getUrlAndPass(excelPtah,page, 2, 1);
		driver.get(URL);
		edriver=driver;
		LogIn log =new LogIn(driver);
		log.LoginPageCashora(UN, PW);
		
		
/*		driver.findElement(By.xpath("//button[text()='Already a member? Log In']")).click();
		driver.findElement(By.id("login_mobile")).sendKeys(un);
		driver.findElement(By.id("login_password")).sendKeys(pw);
		driver.findElement(By.className("loginbtn")).click();
 */
	}
}

