package Listener_Use_IExecutionListener_to_Mark_Executed_TCs;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;
import org.testng.SkipException;

//@.Suppose 400 test cases are running and after 150 test cases got executed the system got crashed or network was gone or application got crashed. How to run only the test cases which are not executed?
//N: If we are trying to execute remaining 150 not executed TCs through 'testng.xml' file we didn't able to see the the Passed & Skipped count see in 'console' but we can see in 'Results of running class (i.e. TestNG result)'
//N: If we are trying to execute remaining 150 not executed TCs through 'Test Class' file we can able to see the the Passed & Skipped count see in 'console' but we can see in 'Results of running class (i.e. TestNG result)'
public class E1_SkipTestByNameUsingListener implements IInvokedMethodListener {
	static List<String> executedTests;
	
    @Override
    public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
        String methodName = E2_BaseClass.className+"."+method.getTestMethod().getMethodName();
        System.out.println(methodName);

		executedTests = new ArrayList<>();
		executedTests.add("Listener_Use_IExecutionListener_to_Mark_Executed_TCs.E3_MyTests.m2");
//		executedTests.add("Listener_Use_IExecutionListener_to_Mark_Executed_TCs.E3_MyTests.m3");
		
        // Skip specific method
        if (executedTests.contains(methodName)) {
            throw new SkipException("Skipping test method: " + methodName);
        }
    }

    @Override
    public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
        // no-op
    }
}
