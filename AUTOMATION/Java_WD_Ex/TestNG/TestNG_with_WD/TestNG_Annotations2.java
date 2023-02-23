package TestNG_with_WD;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNG_Annotations2 {
	
	@BeforeSuite		//can prepare in any class
	void beforesuite() {
		System.out.println("This is @BeforeSuite....");
	}

	@AfterSuite
	void aftersuite() {
		System.out.println("This is @AfterSuite....");
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
	void test3() {
		System.out.println("This is @Test3....");
	}
	
	@Test
	void test4() {
		System.out.println("This is @Test4....");
	}
}
