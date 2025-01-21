package TestNG_with_WD;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class EX7a_Skip_TC_UsingTestNG {
	@Test
	public void testCase1() {
		boolean condition = true; // Replace with your condition
		if (condition) {
			throw new SkipException("Skipping this test as the condition is true");
		}
		System.out.println("Executing Test Case 1");
	}
}
