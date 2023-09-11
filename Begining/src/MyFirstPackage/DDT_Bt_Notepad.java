
package MyFirstPackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.bouncycastle.crypto.CryptoServicesRegistrar.Property;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DDT_Bt_Notepad {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	FileInputStream fis= new FileInputStream("./Cashora.txt");
	Properties pro = new Properties();
	pro.load(fis);
	String userid = pro.getProperty("user");
	String pwd = pro.getProperty("pw");
	
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://cashora.com/");
	driver.findElement(By.xpath("//button[text()='Already a member? Log In']")).click();
	driver.findElement(By.id("login_mobile")).sendKeys(userid);
	driver.findElement(By.id("login_password")).sendKeys(pwd);
	driver.findElement(By.className("loginbtn")).click();
}
}
