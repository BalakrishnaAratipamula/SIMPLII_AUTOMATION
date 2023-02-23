package TestNG_Simple1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Class001 {
	@Test
	public void method01(){
		Reporter.log("Method01 from Class001",true);
	}
	
	@Test
	public void method02(){
		Reporter.log("Method02 from Class001",true);
	}
}
