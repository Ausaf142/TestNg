package TestCases;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import GenericUtility.Listner;
@Listeners(Listner.class)
public class Fail {
	@Test
public void testFail() {
	Assert.assertTrue(false);
	System.out.println("this is fail test cases");
}
}
