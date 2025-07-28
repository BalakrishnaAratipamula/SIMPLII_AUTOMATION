package Custom_TestNGAnnotation2;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Custom_TestNGAnnotation2.E1_MyListeners.class)
public class E2_LoginTest {
	@Test
	void setUp() {
		Assert.fail();
	}
	
	@Test
	void loginByEmail() {
		Assert.assertTrue(true);;
	}
	
	@Test(dependsOnMethods= {"setUp"})
	void loginByFacebook() {
		Assert.assertTrue(true);;
	}
}
