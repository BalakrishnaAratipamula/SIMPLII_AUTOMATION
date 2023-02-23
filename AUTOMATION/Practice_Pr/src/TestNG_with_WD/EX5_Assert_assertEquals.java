package TestNG_with_WD;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class EX5_Assert_assertEquals {
	@Test
	public void userReg() {
		Reporter.log("Reg fun performed", true);
		Assert.assertEquals("Balakrishna", "Balakrishna");
	}
	@Test
	public void userLogin() {
		Reporter.log("Login fun performed", true);
		Assert.assertEquals("Bhanu", "bala");
	}
	@Test
	public void sum() {
		int a=6;
		int b=4;
		Reporter.log("sum performed performed", true);
		Assert.assertEquals(10, a+b);
	}
}
