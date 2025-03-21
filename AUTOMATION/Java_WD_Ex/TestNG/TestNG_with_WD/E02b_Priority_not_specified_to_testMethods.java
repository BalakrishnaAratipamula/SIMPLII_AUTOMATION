package TestNG_with_WD;

import org.testng.annotations.Test;

public class E02b_Priority_not_specified_to_testMethods {
	//If priority's are no defined, the execution order will depends on methodNames Alphabetical order
	@Test
	public void testB() {
		System.out.println("Executing testB");
	}

	@Test
	public void testA() {
		System.out.println("Executing testA");
	}

	@Test
	public void testC() {
		System.out.println("Executing testC");
	}

}
