package ReRunFailedTCs_immediatlyAfterExecution;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class E1_RetryAnalyzer implements IRetryAnalyzer {
	    int retryCount = 0;
	    int maxRetryCount = 3;  // Retry only once

	    @Override
	    public boolean retry(ITestResult result) {
	        if (retryCount < maxRetryCount) {
	            retryCount++;
	            return true; // Retry the test
	        }
	        return false;
	    }
}
