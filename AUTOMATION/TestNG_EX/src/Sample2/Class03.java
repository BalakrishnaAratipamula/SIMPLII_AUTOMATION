package Sample2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Class03 {
	@Test
	public void method01(){
		Reporter.log("Method01 from Class03",true);
	}
	
	@Test
	public void method02(){
		Reporter.log("Method02 from Class03",true);
	}
}
