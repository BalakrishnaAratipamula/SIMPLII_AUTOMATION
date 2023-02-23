package TestNG_with_WD;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Annotations1 {

	@BeforeTest		//can prepare in any class
	void beforetest() {
		System.out.println("This is @BeforeTest....");
	}

	@AfterTest		//can prepare in any class
	void aftertest() {
		System.out.println("This is @AfterTest....");
	}
	
	@BeforeClass
	void beforeclass() {
		System.out.println("This is @BeforeClass....");
	}

	@AfterClass
	void afterclass() {
		System.out.println("This is @AfterClass....");
	}
	
	@BeforeMethod
	void beforemethod() {
		System.out.println("This is @BeforeMethod....");
	}

	@AfterMethod
	void aftermethod() {
		System.out.println("This is @AfterMethod....");
	}

	@Test
	void test1() {
		System.out.println("This is @Test1....");
	}

	@Test
	void test2() {
		System.out.println("This is @Test2....");
	}

}
