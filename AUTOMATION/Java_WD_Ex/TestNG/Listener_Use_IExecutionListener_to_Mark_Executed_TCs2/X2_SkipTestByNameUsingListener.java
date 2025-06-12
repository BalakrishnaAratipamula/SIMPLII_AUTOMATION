package Listener_Use_IExecutionListener_to_Mark_Executed_TCs2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;
import org.testng.SkipException;

//@.Suppose 400 test cases are running and after 150 test cases got executed the system got crashed or network was gone or application got crashed. How to run only the test cases which are not executed?
//N: If we are trying to execute remaining 150 not executed TCs through 'testng.xml' file we didn't able to see the the Passed & Skipped count see in 'console' but we can see in 'Results of running class (i.e. TestNG result)'
//N: If we are trying to execute remaining 150 not executed TCs through 'Test Class' file we can able to see the the Passed & Skipped count see in 'console' but we can see in 'Results of running class (i.e. TestNG result)'
public class X2_SkipTestByNameUsingListener implements IInvokedMethodListener {
	static List<String> executedTests;
	
    @Override
    public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
        String testName =  X3_BaseClass.className +"."+ method.getTestMethod().getMethodName();
        System.out.println("testName: "+testName);
        
		try {
			executedTests = Files.readAllLines(Paths.get("executed_tests.txt"));
			System.out.println(executedTests);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
//        boolean result = executedTests.contains(testName);
        // Skip specific method
        if (executedTests.contains(testName)) {
            throw new SkipException("Skipping test method: " + testName);
        }
    }

    @Override
    public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
        // no-op
    }
}
