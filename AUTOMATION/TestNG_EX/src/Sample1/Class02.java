package Sample1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Class02 {
	@Test
	public void method01(){
		Reporter.log("Method01 from Class02",true);
	}
	
	@Test
	public void method02(){
		Reporter.log("Method02 from Class02",true);
	}
}
