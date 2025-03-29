package ReRun_Failed_TCs_usingIRetryAnalyzer2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MyTests {
	@Test(retryAnalyzer = IRetryAnalyzerDemo.class) //className.class
	public void test1() {
		Assert.assertEquals(true, false);
	}

	@Test(retryAnalyzer = IRetryAnalyzerDemo.class)
	public void test2() {
		Assert.assertEquals(true, false);
	}

	@Test(retryAnalyzer = IRetryAnalyzerDemo.class)
	public void test3() {
		Assert.assertEquals(true, true);
	}
}
