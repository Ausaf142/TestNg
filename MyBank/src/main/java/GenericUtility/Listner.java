package GenericUtility;

import java.io.File;

import org.apache.commons.compress.compressors.FileNameUtil;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listner implements ITestListener {
public void onTestFailure(ITestResult result) {
	String mName = result.getMethod().getMethodName();
	System.out.println("fail is at method: "+mName);
	EventFiringWebDriver edriver=new EventFiringWebDriver(BaseClasss.driver);
	File data = edriver.getScreenshotAs(OutputType.FILE);
	try {
	 
	 File file=new File("./Photo/SS.png");
	 FileUtils.copyDirectory(data, file);
	}
	catch(Throwable e){
	e.printStackTrace();
	}
}
}
                                                      