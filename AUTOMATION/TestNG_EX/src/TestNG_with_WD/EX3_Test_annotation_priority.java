package TestNG_with_WD;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class EX3_Test_annotation_priority {
		@Test(priority=2)
	public void userLogin() {
		System.out.println("to validate login functionality");
	}
		@Test(priority=1)
	public void userReg() {
		System.out.println("to validate Registration functionality");			
	}

}
