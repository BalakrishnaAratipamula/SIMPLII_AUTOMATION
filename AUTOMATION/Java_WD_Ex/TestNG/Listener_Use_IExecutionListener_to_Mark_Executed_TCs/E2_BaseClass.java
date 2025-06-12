package Listener_Use_IExecutionListener_to_Mark_Executed_TCs;

import java.lang.reflect.Method;

import org.testng.annotations.BeforeMethod;

//@.Suppose 400 test cases are running and after 150 test cases got executed the system got crashed or network was gone or application got crashed. How to run only the test cases which are not executed?
//N: If we are trying to execute remaining 150 not executed TCs through 'testng.xml' file we didn't able to see the the Passed & Skipped count see in 'console' but we can see in 'Results of running class (i.e. TestNG result)'
//N: If we are trying to execute remaining 150 not executed TCs through 'Test Class' file we can able to see the the Passed & Skipped count see in 'console' but we can see in 'Results of running class (i.e. TestNG result)'
public class E2_BaseClass {
static String className;
	
	@BeforeMethod
	public static void toGetExecutingClassName(Method method) {
		className = method.getDeclaringClass().getName();
//		System.out.println("ClassName:  "+className);
	}
}
