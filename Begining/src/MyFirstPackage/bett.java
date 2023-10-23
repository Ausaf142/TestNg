package MyFirstPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;





public class bett{
public static void main(String[] args) throws InterruptedException {


WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
driver.get("https://dfs.bettdraft.com/login");
System.out.println("Application opened");
// Actions act = new Actions(driver);


WebElement txtbx_username=driver.findElement(By.id("EMAIL"));

txtbx_username.sendKeys("vinnie@bettdraft.com");

driver.findElement(By.id("PASSWORD")).sendKeys("User@#$%12345");
driver.findElement(By.id("PASSWORD")).sendKeys(Keys.ENTER);
//String Msg1 = driver.findElement(By.xpath("//div[text()='Your username or password is invalid. Please try again.']")).getText();
//    String actuallMessage1= "Your username or password is invalid. Please try again.";
//
//     if (actuallMessage1.equalsIgnoreCase(Msg1))
// {
//
//
//// driver.navigate().to(actuallMessage).
// driver.navigate().to("https://mail.google.com/mail/u/0/#inbox");
// driver.findElement(By.name("identifier")).sendKeys("chandraketus@bettdraft.com");
// driver.findElement(By.xpath("//span[text()='Next']")).click();
// driver.findElement(By.name("Passwd")).sendKeys("Ankit#12345");
// driver.findElement(By.name("Passwd")).sendKeys(Keys.ENTER);
//
// Thread.sleep(1000);
// driver.findElement(By.xpath("/html/body/div[17]/div[2]/div[3]/button[2]")).click();
//// driver.findElement(By.xpath("//button[text()='No thanks']")).click();
// driver.findElement(By.xpath("//div[text()='Compose']")).click();
//
// driver.findElement(By.xpath("//input[@peoplekit-id=\"BbVjBd\"]")).sendKeys("vinnie@bettdraft.com");
//
//
// driver.findElement(By.xpath("//div[@aria-label=\"Message Body\"]")).sendKeys("The account entered does not exist");
// driver.findElement(By.xpath("//div[text()='Send']")).click();
// }
// else {


Thread.sleep(2000);

JavascriptExecutor js = (JavascriptExecutor) driver;
js.executeScript("window.scroll(0,350)");
Thread.sleep(4000);

//driver.findElement(By.xpath("(//div[@class='Sport-count-name'])[2]")).click();

driver.findElement(By.xpath("(//div[@class='allplayers col-lg-6 col-md-6 col-12'])[1]")).click();
driver.findElement(By.xpath("(//div[@class='allplayers col-lg-6 col-md-6 col-12'])[2]")).click();
driver.findElement(By.xpath("(//div[@class='allplayers col-lg-6 col-md-6 col-12'])[3]")).click();
// driver.findElement(By.xpath("(//div[@class='allplayers col-lg-6 col-md-6 col-12'])[4]")).click();


driver.findElement(By.xpath("(//div[@class='col-lg-6'])[1]")).click();
driver.findElement(By.xpath("(//h6[text()='LESS'])[2]")).click();
driver.findElement(By.xpath("(//h6[text()='MORE'])[3]")).click();
// driver.findElement(By.xpath("(//h6[text()='MORE'])[4]")).click();

// act.sendKeys(Keys.ARROW_DOWN).perform();

System.out.println("Player Selected");
driver.findElement(By.cssSelector(".input-box-no")).sendKeys("600");
//driver.findElement(By.xpath("(//input[@class='input-box-no']")).sendKeys("1");


JavascriptExecutor jas = (JavascriptExecutor) driver;
jas.executeScript("window.scroll(0,750)");
Thread.sleep(4000);
driver.findElement(By.cssSelector(".btn-success")).click();
String Msg = driver.findElement(By.xpath("//div[text()='Entry amount exceeds the maximum entry fee of $20']")).getText();
String actuallMessage= "Entry amount exceeds the maximum entry fee of $20";
if (actuallMessage.equalsIgnoreCase(Msg))
{
// driver.navigate().to(actuallMessage).
driver.navigate().to("https://mail.google.com/mail/u/0/#inbox");
driver.findElement(By.name("identifier")).sendKeys("chandraketus@bettdraft.com");
driver.findElement(By.xpath("//span[text()='Next']")).click();
driver.findElement(By.name("Passwd")).sendKeys("Ankit#12345");
driver.findElement(By.name("Passwd")).sendKeys(Keys.ENTER);

Thread.sleep(1000);
driver.findElement(By.xpath("/html/body/div[17]/div[2]/div[3]/button[2]")).click();
// driver.findElement(By.xpath("//button[text()='No thanks']")).click();
driver.findElement(By.xpath("//div[text()='Compose']")).click();

driver.findElement(By.xpath("//input[@peoplekit-id=\"BbVjBd\"]")).sendKeys("vinnie@bettdraft.com");


driver.findElement(By.xpath("//div[@aria-label=\"Message Body\"]")).sendKeys("There is a issues on betplace");
driver.findElement(By.xpath("//div[text()='Send']")).click();
driver.close();
}

System.out.println("Successfully Placed Bet");
Thread.sleep(5000);
JavascriptExecutor jas1 = (JavascriptExecutor) driver;
jas1.executeScript("window.scroll(650,0)");
}

}

// }
