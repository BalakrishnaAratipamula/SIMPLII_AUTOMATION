package TestNG_with_WD;

import org.testng.Assert;
import org.testng.annotations.Test;

public class enabled {
	@Test(priority=2,enabled=false)
public void userLogin() {
		System.out.println("to validate login functionality");
		Assert.assertEquals(15, 15);
	}
	@Test(priority=1)
public void userReg() {
		System.out.println("to validate reg functionality");
		Assert.assertEquals(15, 17);
}
}
