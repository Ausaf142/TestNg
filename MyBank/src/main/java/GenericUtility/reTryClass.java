package GenericUtility;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.util.RetryAnalyzerCount;

public class reTryClass implements IRetryAnalyzer {
 
		int count = 0;
		int reTryLimit =4;
		public boolean retry(ITestResult result) {
			if(count<reTryLimit) {
				count++;
				return true;
				}
				return false;
		}
	}


