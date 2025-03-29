package TestNG_Features;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class E11_TestNG_Annotations1 {

	@BeforeTest		//can prepare in any class
	void beforetest() {
		System.out.println("@BeforeTest....from E11_TestNG_Annotations1");
	}

	@AfterTest		//can prepare in any class
	void aftertest() {
		System.out.println("@AfterTest....from E11_TestNG_Annotations1");
	}
	
	@BeforeClass
	void beforeclass() {
		System.out.println("@BeforeClass....from E11_TestNG_Annotations1");
	}

	@AfterClass
	void afterclass() {
		System.out.println("@AfterClass....from E11_TestNG_Annotations1");
	}
	
	@BeforeMethod
	void beforemethod() {
		System.out.println("@BeforeMethod....from E11_TestNG_Annotations1");
	}

	@AfterMethod
	void aftermethod() {
		System.out.println("@AfterMethod....from E11_TestNG_Annotations1");
	}

	@Test
	void test1() {
		System.out.println("@Test1 Executing....from E11_TestNG_Annotations1");
	}

	@Test
	void test2() {
		System.out.println("@Test2 Executing....from E11_TestNG_Annotations1");
	}

}
