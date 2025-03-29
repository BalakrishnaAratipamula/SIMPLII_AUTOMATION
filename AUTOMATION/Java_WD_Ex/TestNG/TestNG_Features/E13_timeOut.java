package TestNG_Features;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class E13_timeOut {
	@Test(timeOut=1000) //timeOut - timeOut represents the max time a method can take for execution
	public void userLogin() {
		Reporter.log("Login functionality done---NP", true);
	}

	@Test(priority = 0)
	public void regFun() {
		Reporter.log("Registration functionality done---P", true);
	} 
}
