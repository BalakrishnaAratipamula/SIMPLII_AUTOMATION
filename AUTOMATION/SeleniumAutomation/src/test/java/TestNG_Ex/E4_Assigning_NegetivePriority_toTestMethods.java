package TestNG_Ex;

import org.testng.annotations.Test;

public class E4_Assigning_NegetivePriority_toTestMethods {
	//If priority's are assigned with Negative vale, the execution order is ......-4, -3, -2, -1, 0, 1, 2, 3, 4.....
	@Test(priority=-2)
	void testA2() {
		System.out.println("Executing testA2");
	}
	
	@Test(priority=-1)
	void testA1() {
		System.out.println("Executing testA1");
	}
	
	@Test(priority=-1)
	void testA3() {
		System.out.println("Executing testA3");
	}
	
	@Test(priority=0)
	void testB() {
		System.out.println("Executing testB");
	}
	
	@Test(priority=2)
	void testD() {
		System.out.println("Executing testD");
	}
	
	@Test(priority=1)
	void testC() {
		System.out.println("Executing testC");
	}
}
