package TestNG_Features;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class E03c_AssertionsForValidation {
	@Test
	public void hardAssertExample() {
	    Assert.assertEquals("Java", "Java"); // passes
	}
	
	@Test
	public void softAssertExample() {
	    SoftAssert sa = new SoftAssert();
	    sa.assertEquals("Hello", "Hi"); // fails but test continues
	    sa.assertAll(); // marks test as failed at end
	}
}
