package TestNG_Ex;

import org.testng.Assert;
import org.testng.annotations.Test;

public class E5_CommonAssertions_inTestNG {
	//Common Assertions: .assertEquals(), .assertNotEquals(), .assertTrue(), .assertFals(), .assertNull(), .assertSame(), .assertNotSame(), .assertEquals(),.assertFail(),
	@Test
	void m1() {
		Assert.assertEquals(12, 13, "----Numbers does not match---");
	}
	
	@Test
	void m2() {
		Assert.assertEquals("Orange", "orange", "----Strings does not match---");
	}
	
	@Test
	void m3() {
		int a=6, b=4;
		Assert.assertEquals(10, a+b, "----Sum does not match---");
	}
	
	@Test
	void m4() {
		Assert.assertNotEquals(12, 13, "----Numbers are same---");
	}
	
	@Test
	void m5() {
		Assert.assertNotEquals(12, 12, "----Numbers are same---");
	}
	
	@Test
	void m6() {
		String str = "Java";
		Assert.assertTrue(str.equals("Java"), "String not match");
	}
	
	@Test
	void m7() {
		String str = "Java";
		Assert.assertTrue(str.equals("Jddddava"), "String not match");
	}
	
	@Test
	void m8() {
		Assert.assertTrue(false, "not as method expectation");
	}
	
	@Test
	void m9() {
		String str = null;
		Assert.assertNull(str, "object is not null");
	}
	
	@Test
	void m10() {
		String str = "Hello";
		Assert.assertNotNull(str, "object is null");
	}
	
	@Test
	void m11() {
		String str1 = "test1";
		String str2 = str1;
		Assert.assertSame(str1, str2, "objects are not same");
	}
	
	@Test
	void m12() {
		Assert.assertSame("Hello", "Hello", "objects are not same");
	}
	
	@Test
	void m13() {
		String str1 = "test1";
		String str2 = new String("test1"); //if we use new keyword the object will store in new address
		Assert.assertNotSame(str1, str2, "objects are not same"); //both address is different
	}
	
	//Compare two Arrays
	@Test
	void m14() {
		int[] atualArray = {1, 2, 3, 4};
		int[] expectedArray = {1, 2, 3, 4};
		Assert.assertEquals(atualArray, expectedArray, "Arrays does not match"); //both address is different
	}
	
	@Test
	void m15() {
		Assert.fail("This test is intentionally failed");
	}
}
