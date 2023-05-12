package com.Woost1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import net.bytebuddy.build.Plugin.Factory.UsingReflection.Priority;

public class OthersAnnotaion {
@Test 
public void usb1() {
	
	System.out.println("1");
}

@Test (invocationCount = 2)
public void usb2() {
	System.out.println("2");
}

@Test (dependsOnMethods = "usb1")
public void usb3() {
	System.out.println("3");
}

@Test  (priority=-1)
public void usb4() {
	System.out.println("4");
}



}
