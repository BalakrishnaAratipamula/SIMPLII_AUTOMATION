package ReRun4_Failed_TCs_using_TestNgFailedXMLfile;

import org.testng.Assert;
import org.testng.annotations.Test;

public class S2_ClassB {
	@Test

	public void testCase3() {
		System.out.println("this is testcase3");
		Assert.assertTrue(true);
	}

	@Test
	public void testCase4() {
		System.out.println("this is testcase4");
		Assert.assertTrue(false);
	}
}
