package TestNG_with_WD;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class E03_CommonAssertions_in_TestNG {
	//
	@Test(priority=1)
	public void test1() {
		System.out.println("Test case 1 started");
		Assert.assertEquals(12, 13, "------------count does not match----------");//(Actual, Expected, user msg)--------//from here prog terminated
		System.out.println("Test case 1 completed"); // if above stmt is fail this stmt will not print
	}
	@Test(priority=2)
	public void test2() {
		System.out.println("Test case 2 started");
		Assert.assertEquals("Bhanu", "Bhanu", "---------------String not match-----------------");//When script is fail this user msg can print in C & html report  
		System.out.println("Test case 2 completed");
	} 
	@Test(priority=3)
	public void sum() {
		int a=6;
		int b=4;
		Reporter.log("sum performed performed", true);
		Assert.assertEquals(10, a+b);
	} 
	@Test(priority=4)
	public void test3() {
		System.out.println("Test case 2 started");
		Assert.assertNotEquals(10, 20, "Values are equal, test failed"); //String also we can pass
		System.out.println("Test case 2 completed");
	}
	@Test(priority=5)
	public void test4() {
		String myStr = "Balakrishna";
		Assert.assertTrue(myStr.equals("Bhanu"), "----------------String not match---------------");//(condition, user msg)
	} 
	@Test(priority=6)
	public void test5() {
		//String myStr = "Balakrishna";
		Assert.assertTrue(true);//(condition, user msg)
	}
	@Test(priority=7)
	public void test6() {
		//String myStr = "Balakrishna";
		Assert.assertFalse(true);//(condition, user msg) //this can be used to find the element is present or not and to print the Element is not present message
	} 
	@Test(priority=8)
	public void test7() {
		String str = null;
		Assert.assertNull(str, "Object is not null");
	}
	@Test(priority=9)
	public void userLogin1() {
		Reporter.log("assertNull", true);
		Assert.assertNull("Bhanu", "Bhanu"); //always it show 'fail' /////this can be used to find the element is present or not and to print the Element is not present message
	} 
	@Test(priority=10)
	public void test8() {
		String str = "Hello";
		Assert.assertNotNull(str, "Object is null");
	}
	@Test(priority=11)
	public void userLogin2() {
		Reporter.log("assertNotNull", true);
		Assert.assertNotNull("Bhanu", "ffff"); //always it show 'pass'
	} 
	@Test(priority=12)
	public void test9() {
		String str1 = "Test";
		String str2 = str1;
		Assert.assertSame(str1, str2, "Objects are not the same");
	}
	@Test(priority=13)
	public void userLogin3() {
		Reporter.log("assertSame", true);
		Assert.assertSame("Bhanu", "Bhanu");
	} 
	@Test(priority=14)
	public void test10() {
		String str1 = "Test";
		String str2 = new String("Test");
		Assert.assertNotSame(str1, str2, "Objects are the same");
	} 
	//Compare two Arrays
	@Test(priority=15)
	public void test11() {
		int[] actualArray = {1, 2, 3};
		int[] expectedArray = {1, 2, 3};
		Assert.assertEquals(actualArray, expectedArray, "Arrays are not equal");
	}
	@Test(priority=16)
	public void test12() {
		if (true) {
		    Assert.fail("This test is intentionally failed");
		}
	} //*/
}
