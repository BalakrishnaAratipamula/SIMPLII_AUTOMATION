package TestNG_with_WD;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class EX2_TestNG_priority {
	@Test
	public void userLogin() {
		Reporter.log("Login functionality done", true);
	}
	@Test(priority=1)
	public void regFun() {
		Reporter.log("Registration functionality done", true);
	}
}
