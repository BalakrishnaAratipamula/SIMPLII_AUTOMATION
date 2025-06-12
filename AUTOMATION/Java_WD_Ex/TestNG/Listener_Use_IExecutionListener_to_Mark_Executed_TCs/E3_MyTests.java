package Listener_Use_IExecutionListener_to_Mark_Executed_TCs;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@.Suppose 400 test cases are running and after 150 test cases got executed the system got crashed or network was gone or application got crashed. How to run only the test cases which are not executed?
//N: If we are trying to execute remaining 150 not executed TCs through 'testng.xml' file we didn't able to see the the Passed & Skipped count see in 'console' but we can see in 'Results of running class (i.e. TestNG result)'
//N: If we are trying to execute remaining 150 not executed TCs through 'Test Class' file we can able to see the the Passed & Skipped count see in 'console' but we can see in 'Results of running class (i.e. TestNG result)'
@Listeners(E1_SkipTestByNameUsingListener.class)
public class E3_MyTests extends E2_BaseClass{
	@Test
    public void m1() {
        System.out.println("m1 Executed");
    }

    @Test
    public void m2() {
        System.out.println("m2 Executed");
    }
    
    @Test
    public void m3() {
        System.out.println("m3 Executed");
    }
    
    @Test
    public void m4() {
        System.out.println("m4 Executed");
    }
}
