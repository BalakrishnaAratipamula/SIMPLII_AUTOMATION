package ReRunFailedTCs_immediatlyAfterExecution;

import org.testng.Assert;
import org.testng.annotations.Test;

public class E3_SimpleTest {
	@Test
	public void testCase1() {
		System.out.println("this is testcase1");
		Assert.assertTrue(false);
	}

	@Test
	public void testCase2() {
		System.out.println("this is testcase2");
		Assert.assertTrue(true);
	}
}
