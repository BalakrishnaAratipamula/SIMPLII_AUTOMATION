package TestNG_with_WD;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class EX2_TestNG_priority {
	// if we dot assign priority in TestNG by default considering as priority is 'zero'
	@Test
	public void userLogin() {
		Reporter.log("Login functionality done---NP", true);
	}
	
	@Test(priority = 1)
	public void regFun() {
		Reporter.log("Registration functionality done---P", true);
	} 

	
	/*/ order of priority execution is 0,1,2....
	@Test(priority = 1)
	public void userLogin() {
		Reporter.log("Login fun executed---P1", true);
	}

	@Test(priority = 0)
	public void regFun() {
		Reporter.log("Reg fun executed---P0", true);
	} */

	
	/*/if priority's are same will print based on method alphabetical order
	@Test(priority = 0)
	public void B() {
		Reporter.log("B method executed---P0", true);
	}

	@Test(priority = 0)
	public void A() {
		Reporter.log("A method executed---P0", true);
	} */
}