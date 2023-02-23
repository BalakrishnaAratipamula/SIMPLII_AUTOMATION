package TestNG_with_WD;

import org.testng.Assert;
import org.testng.annotations.Test;

public class dependsOnMethods {
	@Test(priority=2,dependsOnMethods={"userReg"})
public void userLogin() {
	System.out.println("to validate login functionality");
	Assert.assertEquals(15, 17);
}
	@Test(priority=1)
public void userReg() {
	System.out.println("to validate registration functionality");
	Assert.assertEquals(15, 17);
}
}
