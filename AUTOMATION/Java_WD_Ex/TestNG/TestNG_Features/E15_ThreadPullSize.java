package TestNG_Features;

import org.testng.annotations.Test;

public class E15_ThreadPullSize { //invocationCount - invocationCount allow to exe any test method multiple times. It allows to set int value i.e., @Test(invocationCount = 5)
								//threadPoolSize - threadPoolSize attribute is used to defines the number of threads to be used while running a test method. It is used in conjunction with invocationCount attribute @Test(invocationCount = 7, threadPoolSize = 3)

	@Test(invocationCount = 10, threadPoolSize = 4)
	public void testThreadPools() {

		System.out.printf("Thread Id : %s%n", Thread.currentThread().getId());

	}
}
