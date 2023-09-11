package TestCases;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import GenericUtility.BaseClass;
import GenericUtility.Listener;

public class Fail extends BaseClass {
	
	@Test(retryAnalyzer = GenericUtility.reTryClass.class)
public void testFail() {
	Assert.assertTrue(false);
	System.out.println("this is fail test cases");
}
}
