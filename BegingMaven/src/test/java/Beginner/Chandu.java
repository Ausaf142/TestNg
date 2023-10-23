package Beginner;
import java.awt.AWTException;

import java.awt.Robot;

import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.bouncycastle.jcajce.provider.keystore.pkcs12.PKCS12KeyStoreSpi;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;



import io.github.bonigarcia.wdm.WebDriverManager;


public class Chandu {
	public static void main(String[] args) throws AWTException, InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		driver.get("https://dev-dfs.bettdraft.com/login");

		Robot r =new Robot();



		//---------------------------------------------------- USERNAME-------------------------------------------------------------

		r.keyPress(KeyEvent.VK_B);

		r.keyRelease(KeyEvent.VK_B);

		r.keyPress(KeyEvent.VK_E);

		r.keyRelease(KeyEvent.VK_E);

		r.keyPress(KeyEvent.VK_T);

		r.keyRelease(KeyEvent.VK_T);

		r.keyPress(KeyEvent.VK_T);

		r.keyRelease(KeyEvent.VK_T);

		r.keyPress(KeyEvent.VK_D);

		r.keyRelease(KeyEvent.VK_D);

		r.keyPress(KeyEvent.VK_R);

		r.keyRelease(KeyEvent.VK_R);

		r.keyPress(KeyEvent.VK_A);

		r.keyRelease(KeyEvent.VK_A);

		r.keyPress(KeyEvent.VK_F);

		r.keyRelease(KeyEvent.VK_F);

		r.keyPress(KeyEvent.VK_T);

		r.keyRelease(KeyEvent.VK_T);

		//----------------------------------------------------------PASSWORD--------------------------------------------------------

		r.keyPress(KeyEvent.VK_TAB);

		r.keyRelease(KeyEvent.VK_TAB);	

		r.keyPress(KeyEvent.VK_1);

		r.keyRelease(KeyEvent.VK_1);

		r.keyPress(KeyEvent.VK_CAPS_LOCK);

		r.keyRelease(KeyEvent.VK_CAPS_LOCK);

		r.keyPress(KeyEvent.VK_V);

		r.keyRelease(KeyEvent.VK_V);

		r.keyPress(KeyEvent.VK_CAPS_LOCK);

		r.keyRelease(KeyEvent.VK_CAPS_LOCK);

		r.keyPress(KeyEvent.VK_6);

		r.keyRelease(KeyEvent.VK_6);

		r.keyPress(KeyEvent.VK_C);

		r.keyRelease(KeyEvent.VK_C);

		r.keyPress(KeyEvent.VK_T);

		r.keyRelease(KeyEvent.VK_T);

		r.keyPress(KeyEvent.VK_T);

		r.keyRelease(KeyEvent.VK_T);

		r.keyPress(KeyEvent.VK_CAPS_LOCK);

		r.keyRelease(KeyEvent.VK_CAPS_LOCK);

		r.keyPress(KeyEvent.VK_Z);

		r.keyRelease(KeyEvent.VK_Z);

		r.keyPress(KeyEvent.VK_CAPS_LOCK);

		r.keyRelease(KeyEvent.VK_CAPS_LOCK);

		r.keyPress(KeyEvent.VK_SHIFT);

		r.keyPress(KeyEvent.VK_8);

		r.keyRelease(KeyEvent.VK_8);

		r.keyRelease(KeyEvent.VK_SHIFT);

		r.keyPress(KeyEvent.VK_SHIFT);

		r.keyPress(KeyEvent.VK_2);

		r.keyRelease(KeyEvent.VK_2);

		r.keyRelease(KeyEvent.VK_SHIFT);

		r.keyPress(KeyEvent.VK_9);

		r.keyRelease(KeyEvent.VK_9);

		r.keyPress(KeyEvent.VK_7);

		r.keyRelease(KeyEvent.VK_7);

		r.keyPress(KeyEvent.VK_K);

		r.keyRelease(KeyEvent.VK_K);

		r.keyPress(KeyEvent.VK_ENTER);

		r.keyRelease(KeyEvent.VK_ENTER);

		//----------------------------------------------------------------LOG IN---------------------------------------------------------
		//Find user Name

				WebElement txtbx_username=driver.findElement(By.id("EMAIL"));	

				txtbx_username.sendKeys("Francis01");

			//Find password is set

				

				driver.findElement(By.id("PASSWORD")).sendKeys("Francis@123");
				driver.findElement(By.id("PASSWORD")).sendKeys(Keys.ENTER);



				
//for pop close
				Robot r1=new Robot();
				r1.keyPress(KeyEvent.VK_TAB);
				r1.keyRelease(KeyEvent.VK_TAB);	
				r1.keyPress(KeyEvent.VK_ENTER);
				r1.keyRelease(KeyEvent.VK_ENTER);
			
				System.out.println("rob");
				
				driver.findElement(By.xpath("//span[text()='NFL']")).click();	
	
	}
}