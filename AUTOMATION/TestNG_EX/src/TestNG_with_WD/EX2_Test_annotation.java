package TestNG_with_WD;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class EX2_Test_annotation {
		@Test
	public void userLogin() {
		System.out.println("to validate login functionality");
		Reporter.log("simple script 'true'", true);//true-will print in both console and html report
	}
		@Test(priority=1)
	public void userReg() {
			System.out.println("to validate Registration functionality");
			Reporter.log("simple script 'false'", false);//false-will print in html report only
		}
}
