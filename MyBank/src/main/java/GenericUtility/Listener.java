package GenericUtility;

import java.io.File;

import org.apache.commons.compress.compressors.FileNameUtil;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener {
	JavaUtility RNum = new JavaUtility();
	int Rnumber = RNum.getRandomNumber();
public void onTestFailure(ITestResult result) {
	
	String mName = result.getMethod().getMethodName();
	System.out.println("fail is at method: "+mName);
	EventFiringWebDriver edriver=new EventFiringWebDriver(BaseClass.driver);
	File data = edriver.getScreenshotAs(OutputType.FILE);
	try {
	 
	 File file=new File("./Photo/SSFail"+Rnumber+".png");
	 FileUtils.copyFile(data, file);
	}
	catch(Throwable e){
	e.printStackTrace();
	}
}
}
                                                      