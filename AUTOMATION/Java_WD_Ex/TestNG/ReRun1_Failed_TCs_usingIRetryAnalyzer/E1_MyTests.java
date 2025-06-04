package ReRun1_Failed_TCs_usingIRetryAnalyzer;

import org.testng.Assert;
import org.testng.annotations.Test;

public class E1_MyTests {
	@Test(retryAnalyzer = IRetryAnalyzer_Implementation.class) //className.class
	public void test1() {
		Assert.assertEquals(true, false);
	}

	@Test(retryAnalyzer = IRetryAnalyzer_Implementation.class)
	public void test2() {
		Assert.assertEquals(true, false);
	}

	@Test(retryAnalyzer = IRetryAnalyzer_Implementation.class)
	public void test3() {
		Assert.assertEquals(true, true);
	}
}
