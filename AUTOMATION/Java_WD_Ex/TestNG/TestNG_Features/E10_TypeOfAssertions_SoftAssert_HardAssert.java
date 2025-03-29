package TestNG_Features;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class E10_TypeOfAssertions_SoftAssert_HardAssert {

	//HardAssert
	@Test
	public void x() {
		Assert.assertEquals(true, true); //pass
		System.out.println("Xstatement1");
		Assert.assertEquals(false, true); //fail
		System.out.println("Xstatement2");
		Assert.assertEquals(true, true); //pass
		System.out.println("Xstatement3");
	} //*/
	
	
	/*/SoftAssert
	@Test
	public void y() {
		SoftAssert softassert = new SoftAssert();
		Assert.assertEquals(true, true); //pass
		System.out.println("Ystatement1");
		softassert.assertEquals(false, true); //fail
		System.out.println("Ystatement2");
		softassert.assertEquals(true, true); //pass
		System.out.println("Ystatement3");
		
		softassert.assertAll(); //if we not give this command exception msg will not print at the end
	} //*/
}
