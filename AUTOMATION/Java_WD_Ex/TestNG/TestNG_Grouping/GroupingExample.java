package TestNG_Grouping;

import org.testng.annotations.Test;

public class GroupingExample {
	
	@Test(groups= {"sanity"})
	void test1() {
		System.out.println("Test1....");
	}
	@Test(groups= {"sanity"})
	void test2() {
		System.out.println("Test2....");
	}
	@Test(groups= {"regression"})
	void test3() {
		System.out.println("Test3....");
	}
	@Test(groups= {"regression"})
	void test4() {
		System.out.println("Test4....");
	}
	@Test(groups= {"sanity","regression"})
	void test5() {
		System.out.println("Test5....");
	}
	
}
