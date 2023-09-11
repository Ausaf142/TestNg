package Practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {
public static void main(String[] args) throws IOException, AWTException, InterruptedException {
	Random random=new Random();
	int name = random.nextInt(1000);
	int name2 = random.nextInt(100);
	WebDriver driver=new ChromeDriver();
	driver.get("https://m.freekaamaal.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	Thread.sleep(2000);
	Robot robot =new Robot();
	 robot.keyPress(KeyEvent.VK_TAB);
	 robot.keyPress(KeyEvent.VK_ENTER);
	 
	TakesScreenshot ts= (TakesScreenshot)driver;
	File src = ts.getScreenshotAs(OutputType.FILE);
	File file =  new File("./Photo/Page"+name+".png");
	FileUtils.copyFile(src, file);
	
	TakesScreenshot tss= (TakesScreenshot)driver;
	File src2 = driver.findElement(By.xpath("//div[@class='col-xs-12 col-md-12 signup-baar']")).getScreenshotAs(OutputType.FILE);

	File file2 =  new File("./Photo/Ele"+name2+".png");
	FileUtils.copyFile(src2, file2);
	driver.quit();
	
}
}
