package TestNG_Features;

import org.testng.annotations.Test;

public class E16_ExceptionTestExample {
	@Test(expectedExceptions = ArithmeticException.class)
    public void testDivideByZero() {
        int result = 10 / 0; // This line will throw an ArithmeticException
    }
}
