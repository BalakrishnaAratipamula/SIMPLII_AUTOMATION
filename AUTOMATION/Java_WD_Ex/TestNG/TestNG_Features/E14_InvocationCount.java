package TestNG_Features;

import org.testng.annotations.Test;

public class E14_InvocationCount {
	@Test(invocationCount = 5)
	public void testMethod() {
		System.out.println("Test method executed and current Thread ID is:  "+Thread.currentThread().getId());
	}
}
