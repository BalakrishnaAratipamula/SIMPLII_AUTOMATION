package TestNG_Features;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class E02_Priority {
	/*/ If we dot assign priority in TestNG by default considering as priority is 'zero'
	@Test
	public void userLogin() {
		Reporter.log("Login functionality done---NP", true);
	}
	
	@Test(priority = 1)
	public void regFun() {
		Reporter.log("Registration functionality done---P", true);
	} //*/

	
	/*/ Order of priority execution is 0,1,2....
	@Test(priority = 1)
	public void userLogin() {
		Reporter.log("Login fun executed---P1", true);
	}

	@Test(priority = 0)
	public void regFun() {
		Reporter.log("Reg fun executed---P0", true);
	} //*/

	
	// If priority's are same will print based on methodName alphabetical order and then numeric order
	@Test(priority = 0)
	public void B() {
		Reporter.log("B method executed---P0", true);
	}

	@Test(priority = 0)
	public void A() { //1st
		Reporter.log("A method executed---P0", true);
	} 
	
	@Test(priority = 0)
	public void A2() { //3rd
		Reporter.log("A2 method executed---P0", true);
	}
	
	@Test(priority = 0)
	public void A1() { //2nd
		Reporter.log("A1 method executed---P0", true);
	} //*/
}