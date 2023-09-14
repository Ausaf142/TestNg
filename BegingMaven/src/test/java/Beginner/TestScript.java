package Beginner;

import org.testng.annotations.Test;

import GenericUtility.BaseClass;

import POMClasses.HomePageCashora;

public class TestScript extends BaseClass{
@Test (retryAnalyzer = GenericUtility.CustomRetry.class)
public void foodEntertaiment() {
	HomePageCashora hpage=new HomePageCashora(driver);
//	hpage.FoodEntertainment();
	hpage.FreeStuff();//i have made wrong xpath by removing one alphabate 'e' for the execution of retry
	
}
}
