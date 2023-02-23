package TestNG_with_WD;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class EX4_BC_AC_BM_AM {
	@BeforeClass
	public void setUp() {
		System.out.println("To Initialize Browser");
	}
	
	@AfterClass
	public void tearDown() {
		System.out.println("To close application and Browser");
	}
	
	@Test (priority=1)
	public void userReg() {
		System.out.println("To validate user Registration functionality");
	}
	
	@Test (priority= 2)
	public void userLogin() {
		System.out.println("To validate Login functionality");
	}
	
	@BeforeMethod
	public void setHomePg() {
		System.out.println("To navigate Home page");
	}
	
	@AfterMethod
	public void refreshPg() {
		System.out.println("To refresh the page");
	}

}
