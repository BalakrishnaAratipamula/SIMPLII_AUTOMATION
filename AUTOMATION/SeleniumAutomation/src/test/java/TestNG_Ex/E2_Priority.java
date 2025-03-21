package TestNG_Ex;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class E2_Priority { //Execution order depends on priority: 0, 1, 2, 3......
	/*/If we don't assign the priority in TestNG by default considering the priority is 'Zero'
	@Test(priority=1)
	public void userLogin() {
		Reporter.log("Login functionality is done---P", true);
	}
	
	@Test	//If we don't assign the priority in TestNG by default considering the priority is 'Zero'
	public void regFun() {
		Reporter.log("Registration functionality is done---NP", true);
	} //*/
	
	
	/*/ Execution order of priority: 0, 1, 2, 3......
	@Test(priority=1)
	public void userLogin() {
		Reporter.log("Login functionality is done", true);
	}
	
	@Test(priority=0)
	public void regFun() {
		Reporter.log("Registration functionality is done", true);
	} //*/
	
	
	//If priority's are same, the execution order will depends on methodNames Alphabetical order
	@Test(priority=0)
	public void userLogin() {
		Reporter.log("Login functionality is done", true);
	}
	
	@Test(priority=0)
	public void regFun() {
		Reporter.log("Registration functionality is done", true);
	} //*/
}
