package TestNG_with_WD;

import org.testng.Assert;
import org.testng.annotations.Test;

public class EX5_Assert_assertEquals {
	@Test
public void userReg() {
	System.out.println("to validate user reg functionality");
	Assert.assertEquals("BalaKrishna", "Balakrishna");
}
	@Test
	public void userReg2() {
		System.out.println("to validate user reg functionality2");
		Assert.assertEquals("Bhanu", "Bhanu");
}
}