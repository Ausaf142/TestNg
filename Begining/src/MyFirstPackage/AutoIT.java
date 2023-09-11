package MyFirstPackage;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoIT {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.naukri.com/registration/createAccount?othersrcp=23531&wExp=N&utm_source=google&utm_medium=cpc&utm_campaign=Brand&gad=1&gclid=CjwKCAjw6eWnBhAKEiwADpnw9sAh2xIsi7FqUqlTA81yaIEu4HEMXfetQPx2XBca1yN7s436SCG1vxoC5P4QAvD_BwE&gclsrc=aw.ds");
	driver.findElement(By.xpath("//button[text()='Upload Resume']")).click();
	Runtime.getRuntime().exec("./cv.exe");
	

}
}
