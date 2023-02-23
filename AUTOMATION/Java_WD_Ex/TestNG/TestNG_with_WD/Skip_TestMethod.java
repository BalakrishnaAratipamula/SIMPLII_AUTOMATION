package TestNG_with_WD;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Skip_TestMethod {
	@Test(priority=2)  
	public void C() {
		Reporter.log("Method-C executed", true);
		//Assert.assertEquals(12, 12,"---------not match----------");
	}
	@Test(priority=1, enabled=false) //false - entire method can skip (doesn't show in skip & test execution also)
	public void B() {
		Reporter.log("Method-B executed", true);
		//Assert.assertEquals(12, 13, "---------not match---------");
	}
	@Test(priority=0)
	public void A() {
		Reporter.log("Method-A executed", true);
		//Assert.assertEquals(12, 13, "---------not match---------");
	}
}
