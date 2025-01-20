package TestNG_with_WD;

import org.testng.annotations.Test;

public class EX2c_Assigning_NegetivePriority_to_testMethods { //...-2,-1,0,1,2...
	@Test(priority = -1)
	public void testA1() {
		System.out.println("Executing testA1");
	}

	@Test(priority = -2)
	public void testA2() {
		System.out.println("Executing testA2");
	}
	
	@Test(priority = 0)
	public void testB() {
		System.out.println("Executing testB");
	}

	@Test(priority = 2)
	public void testC2() {
		System.out.println("Executing testC2");
	}
	
	@Test(priority = 1)
	public void testC1() {
		System.out.println("Executing testC1");
	}
}
