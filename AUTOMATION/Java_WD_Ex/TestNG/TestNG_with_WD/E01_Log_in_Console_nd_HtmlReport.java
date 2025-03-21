package TestNG_with_WD;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class E01_Log_in_Console_nd_HtmlReport {
	@Test
	public void userLogin() {
		System.out.println("This statement can print in console only");
		Reporter.log("@This statement can print in HTML report only", false);
		Reporter.log("@This statement can print in both HTML report & console only", true);
	}
}
