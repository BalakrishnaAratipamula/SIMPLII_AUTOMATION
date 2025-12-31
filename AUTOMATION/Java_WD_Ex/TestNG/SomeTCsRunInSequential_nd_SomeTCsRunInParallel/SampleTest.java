package SomeTCsRunInSequential_nd_SomeTCsRunInParallel;

import org.testng.annotations.Test;

public class SampleTest {
	// Sequential tests
	@Test(groups = "sequential")
	public void test1() {
		System.out.println("Test 1 - " + Thread.currentThread().getId());
	}

	@Test(groups = "sequential")
	public void test2() {
		System.out.println("Test 2 - " + Thread.currentThread().getId());
	}

	@Test(groups = "sequential")
	public void test3() {
		System.out.println("Test 3 - " + Thread.currentThread().getId());
	}

	@Test(groups = "sequential")
	public void test4() {
		System.out.println("Test 4 - " + Thread.currentThread().getId());
	}

	// Parallel tests
	@Test(groups = "parallel")
	public void test5() {
		System.out.println("Test 5 - " + Thread.currentThread().getId());
	}

	@Test(groups = "parallel")
	public void test6() {
		System.out.println("Test 6 - " + Thread.currentThread().getId());
	}

	@Test(groups = "parallel")
	public void test7() {
		System.out.println("Test 7 - " + Thread.currentThread().getId());
	}

	@Test(groups = "parallel")
	public void test8() {
		System.out.println("Test 8 - " + Thread.currentThread().getId());
	}
}
