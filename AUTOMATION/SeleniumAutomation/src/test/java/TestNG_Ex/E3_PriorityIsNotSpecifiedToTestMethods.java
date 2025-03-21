package TestNG_Ex;

import org.testng.annotations.Test;

public class E3_PriorityIsNotSpecifiedToTestMethods {
	//If priority's are no defined, the execution order will depends on methodNames Alphabetical order
	@Test
	void testB() {
		System.out.println("Executing testB()");
	}
	
	@Test
	void testA() {
		System.out.println("Executing testA()");
	}
	
	@Test
	void testC() {
		System.out.println("Executing testC()");
	}
}
