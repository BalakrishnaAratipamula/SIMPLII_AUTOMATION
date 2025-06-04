package ReRun4_Failed_TCs_using_TestNgFailedXMLfile;

import org.testng.Assert;
import org.testng.annotations.Test;

public class S1_ClassA {
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
