package TestNG_with_WD;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class EX1_TestNG_annotations1 {
	@Test
	public void uesrLogin() {
	System.out.println("This statement can print in Console only");	
	Reporter.log("This statement can print in HTML reprt only", false);
	Reporter.log("This statement can print in HTML reprt & Console", true);
	}
	
}
