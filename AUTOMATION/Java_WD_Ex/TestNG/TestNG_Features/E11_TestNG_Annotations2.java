package TestNG_Features;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class E11_TestNG_Annotations2 {
	
	@BeforeSuite	//can prepare in any class
	void beforesuite() {
		System.out.println("BeforeSuite....from E11_TestNG_Annotations2");
	}

	@AfterSuite		//can prepare in any class
	void aftersuite() {
		System.out.println("@AfterSuite....from E11_TestNG_Annotations2");
	}
	
	@BeforeClass
	void beforeclass() {
		System.out.println("@BeforeClass....from E11_TestNG_Annotations2");
	}

	@AfterClass
	void afterclass() {
		System.out.println("@AfterClass....from E11_TestNG_Annotations2");
	}
	@BeforeMethod
	void beforemethod() {
		System.out.println("@BeforeMethod....from E11_TestNG_Annotations2");
	}

	@AfterMethod
	void aftermethod() {
		System.out.println("@AfterMethod....from E11_TestNG_Annotations2");
	}
	
	@Test
	void test3() {
		System.out.println("@Test3 Executing....from E11_TestNG_Annotations2");
	}
	
	@Test
	void test4() {
		System.out.println("@Test4....from E11_TestNG_Annotations2");
	}
}
