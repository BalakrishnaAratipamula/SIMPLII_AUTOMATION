package TestNG_with_WD;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class timeOut {
	@Test(timeOut=1000) //timeOut - timeOut represents the max time method can take for execution
	public void userLogin() {
		Reporter.log("Login functionality done---NP", true);
	}

	@Test(priority = 0)
	public void regFun() {
		Reporter.log("Registration functionality done---P", true);
	} 
}
