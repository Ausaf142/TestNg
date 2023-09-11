package Beginner;

import org.testng.annotations.Test;

import net.bytebuddy.build.Plugin.Factory.UsingReflection.Priority;

/*Annotation of testNg are :
 >enabled
 >priority
 >dependOntheMethod
 >invocationCount*/
//NOTE--Priority working sbpe tb rhega jbtk priorty sbko di ni jaye warna priorty wala default k baad exe hoga
//By Default methods -1 se 0 ke bich rhta hai
//invcation>priority


public class AllAnnotation {
	@Test (invocationCount = 2)
	public void Test1() {
		System.out.println("Test1");
		
	}
	@Test (dependsOnMethods = "Test4")
	public void Test2() {
		System.out.println("Test2");
	
		
	}
	@Test (priority=0)
	public void Test3() {
		System.out.println("Test3");
		
	}
	@Test (enabled = true)
	public void Test4() {
		System.out.println("Test4");
		
	}
	@Test (priority=1)
	public void Test5() {
		System.out.println("Test5");
		
	}

}
