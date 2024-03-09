package TestNG_with_WD;

import org.testng.annotations.Test;

public class ThreadPullSize_E {
	@Test(invocationCount = 7, threadPoolSize = 3)
	public void testThreadPools() {

		System.out.printf("Thread Id : %s%n", Thread.currentThread().getId());

	}
}
