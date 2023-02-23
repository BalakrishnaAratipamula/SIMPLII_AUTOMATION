package TestNG_Simple2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Class003 {
	@Test
	public void method01(){
		Reporter.log("Method01 from Class003",true);
	}
	
	@Test
	public void method02(){
		Reporter.log("Method02 from Class003",true);
	}
}
