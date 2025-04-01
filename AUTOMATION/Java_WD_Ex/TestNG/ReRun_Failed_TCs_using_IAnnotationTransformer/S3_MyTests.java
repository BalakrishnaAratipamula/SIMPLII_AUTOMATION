package ReRun_Failed_TCs_using_IAnnotationTransformer;

import org.testng.Assert;
import org.testng.annotations.Test;

public class S3_MyTests {
	@Test
	public void test1() {
		Assert.assertEquals(true, false);
	}

	@Test
	public void test2() {
		Assert.assertEquals(true, false);
	}

	@Test
	public void test3() {
		Assert.assertEquals(true, true);
	}
}
