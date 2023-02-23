package TestNG_with_WD;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EX6_TestNG_dataProvider {
	@Test(dataProvider = "LoginData")
public void userLogin(String a, String b) {
	System.out.println(a+" "+b);
	}
	@DataProvider(name="LoginData")
	public Object[][] getData() {
		Object[][] data = new Object[3][2];
		data[0][0]="userId";
		data[0][1]="passWd";
		
		data[1][0]="Bhanu";
		data[1][1]="Nellore";
		
		data[2][0]="Ram";
		data[2][1]="UK";
		
		return(data);
		
	}
}

