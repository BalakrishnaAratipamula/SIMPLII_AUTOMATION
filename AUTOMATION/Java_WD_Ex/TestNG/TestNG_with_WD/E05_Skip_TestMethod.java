package TestNG_with_WD;

import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class E05_Skip_TestMethod {
	/*/Approach 1: Using enabled=false Attribute
	@Test(priority=2)  
	public void C() {
		Reporter.log("Method-C executed", true);
	}
	
	@Test(priority=1, enabled=false) //false - entire method can skip (doesn't show in skip & test execution also)
	public void B() {
		Reporter.log("Method-B is skipped", true);
	}
	
	@Test(enabled = false)
    public void D() {
        Reporter.log("Method-D is skipped", true);
    }
    
	@Test(priority=0)
	public void A() {
		Reporter.log("Method-A executed", true);
	} //*/
	
	
	/*/Approach 2: Using throw new SkipException()
	@Test
    public void test1() {
        System.out.println("Test 1 is running");
    }

    @Test
    public void test2() {
        System.out.println("Test 2 is about to be skipped");
        throw new SkipException("Skipping this test");
    } //*/
	
	
	/*/Approach 3: Using Conditional Skip Based on a Condition
	boolean skipTest = true;

    @Test
    public void test1() {
        System.out.println("Test 1 is running");
    }

    @Test
    public void test2() {
        if (skipTest) {
            System.out.println("Skipping Test 2 due to condition");
            throw new SkipException("Condition met, skipping test");
        }
        System.out.println("Test 2 is running");
    } //*/
    
    //Approach 4: Using ITestResult 
    @Test
    public void test1() {
        System.out.println("Test 1 is running");
    }

    @Test
    public void test2() {
        System.out.println("Test 2 is running");
    }

    @AfterMethod
    public void afterMethod(ITestResult result) {
        if (result.getName().equals("test2")) {
            System.out.println("Skipping test2 using AfterMethod");
            result.setStatus(ITestResult.SKIP);
        }
    }

}
