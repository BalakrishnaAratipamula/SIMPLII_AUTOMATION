package TestNG_Features;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class E14_ThreadPullSize {
	@Test(invocationCount=10, threadPoolSize=2) //invocationCount - allow to execute any test method multiple times. 
												//threadPoolSize - is used to defines the number of threads to be used while running a test method
	void testThreadPools() {
		System.out.println("testThreadPools() is executing and Thread ID is:  "+Thread.currentThread().getId());
	}
}
