package TestNG_with_WD;

import org.testng.Assert;
import org.testng.annotations.Test;

public class EX5a_Assertion {
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
	public void test3() {
		String myStr = "Balakrishna";
		Assert.assertTrue(myStr.equals("Bhanu"), "----------------String not match---------------");//(condition, user msg)
	} 
	@Test(priority=4)
	public void test4() {
		//String myStr = "Balakrishna";
		Assert.assertTrue(true);//(condition, user msg)
	}
	@Test(priority=5)
	public void test5() {
		//String myStr = "Balakrishna";
		Assert.assertFalse(true);//(condition, user msg) //this can be used to find the element is present or not and to print the Element is not present message
	}
	
}
