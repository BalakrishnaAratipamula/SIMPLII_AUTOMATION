package TestNG_Features;

import org.testng.Assert;
import org.testng.annotations.Test;

public class E07_alwaysRun {
	@Test
	public void patetTest() {
		Assert.fail("failed test intentionally");
	}
	
	@Test(dependsOnMethods="patetTest", alwaysRun=true)
	public void dependentTest() {
		System.out.println("*********************Running even if parentTest() failed*********************");
	}
}
