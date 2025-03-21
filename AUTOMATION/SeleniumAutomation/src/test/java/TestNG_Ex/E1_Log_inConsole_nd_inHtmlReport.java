package TestNG_Ex;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class E1_Log_inConsole_nd_inHtmlReport {
	@Test
	public void userLogin() {
		System.out.println("This statement can print in console only");
		Reporter.log("@This statement can print in HTML report only", false);
		Reporter.log("@This statement can print in both HTML report & console only", true);
	}
}
