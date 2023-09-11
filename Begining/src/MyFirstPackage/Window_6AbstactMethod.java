package MyFirstPackage;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_6AbstactMethod {
//AM-maximize/fullscreen/getSize/getPosition/setSize/SetPosition
	public static void main(String[] args) {
		System.setProperty("window.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Window wind = driver.manage().window();  //used
		wind.maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://cashora.com/");
		System.out.println(wind.getSize());
//		Dimension d=new Dimension(500,500);
//		wind.setSize(d);
		System.out.println(wind.getPosition());
//		Point p=new Point(200,500);
//		wind.setPosition(p);
		WebElement ele =driver.findElement(By.xpath("//button[text()='Already a member? Log In']"));
		System.out.println(ele.getSize());
	}
}
