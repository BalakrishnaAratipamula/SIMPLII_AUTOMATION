package TestNG_with_WD;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class EX4_BC_AC_BM_AM {
	@BeforeClass
	public void setUp() {
		Reporter.log("To initialize browser********************************@BeforeClass", true);
	}
	@AfterClass
	public void tearDown() {
		Reporter.log("To close the application*******************************@AfterClass", true);
	}
	@Test()
	public void priuserReg() {
		Reporter.log("To validate primary Registration fun", true);
	}
	@Test(priority=1)
	public void secuserReg() {
		Reporter.log("To validate secondary Registration fun", true);
	}
	@Test(priority=2)
	public void userLogin() {
		Reporter.log("To validate login fun", true);
	}
	@BeforeMethod
	public void setHomepg() {
		Reporter.log("To navigate Home page***************@BeforeMethod", true);
	}
	@AfterMethod
	public void refreshPg() {
		Reporter.log("To refresh the page*****************@AfterMethod", true);
	}
}
