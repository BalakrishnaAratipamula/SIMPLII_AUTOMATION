package TestNG_Features;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class E15_InvocationCount { //invocationCount - invocationCount is used to allow to execute any test method multiple times. And it allow the value in integer format.
	@Test(invocationCount = 7)
	public void testMethod() { 
		System.out.println("Test Method is executing and its current Thread ID is:  "+Thread.currentThread().getId()); //printing current Thread ID
	}
}
