package Listener_Use_IExecutionListener_to_Mark_Executed_TCs;

import java.io.IOException;
import java.lang.reflect.Method;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import org.testng.SkipException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestScripts {
	@BeforeMethod
	public void skipIfAlreadyExecuted(Method method) {
	    String testName = method.getDeclaringClass().getName() + "." + method.getName();
	    List<String> executedTests;
	    try {
	        executedTests = Files.readAllLines(Paths.get("executed_tests.txt"));
	        if (executedTests.contains(testName)) {
	            throw new SkipException("Test already executed: " + testName);
	        }
	    } catch (IOException e) {
	        // handle
	    }
	}
	
	@Test
	void m1() {
		System.out.println("m1");
	}
	
	@Test
	void m2() {
		System.out.println("m2");
	}
	
	@Test
	void m3() {
		System.out.println("m3");
	}
	
	@Test
	void m4() {
		System.out.println("m4");
	}
	
	@Test
	void m5() {
		System.out.println("m5");
	}
	
	@Test
	void m7() {
		System.out.println("m6");
	}
}
