package TestNG_Features;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class E06_dependsOnMethods {
	@Test(priority=2, dependsOnMethods={"userReg"})
	public void userLogin() {
		Reporter.log("To validate login fun", true);
		Assert.assertEquals(12, 13,"---------not match----------");
		System.out.println("****userLogin()****");
	}
	@Test(priority=1)
	public void userReg() {
		Reporter.log("To validate reg fun", true);
		Assert.assertEquals(12, 13, "---------not match---------");
		System.out.println("****userReg()****");
	}
}
