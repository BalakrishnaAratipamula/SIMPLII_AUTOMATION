package TestNG_with_WD;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class EX3_TestNG_priority {
	@Test(priority=2)
	public void userLogin() {
		Reporter.log("Login fun executed", true);
	}
	@Test(priority=1)
	public void regFun(){
		Reporter.log("Reg fun executed", true);
	}
	
}
