package GenericUtility;



import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.google.common.io.Files;

public class ListenerMethod  implements ITestListener {
	JavaUtility jlib=new JavaUtility();
	
	public void onTestFailure(ITestResult result) {
		int number = jlib.GetRandomNumber();
		String failMethod = result.getMethod().getMethodName();
		System.out.println("fail is at method: "+failMethod);
		EventFiringWebDriver edriver= new EventFiringWebDriver(BaseClass.driver);
		
		File proof = edriver.getScreenshotAs(OutputType.FILE);
		try {
			File file =new File("./SS"+number+".png");
			Files.copy(proof, file);
		}
		catch(Throwable e){
			e.printStackTrace();
			}
		
	}

}
 