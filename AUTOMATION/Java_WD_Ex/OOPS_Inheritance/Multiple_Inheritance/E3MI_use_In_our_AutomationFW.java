package Multiple_Inheritance;

//3. Implementing TestNG Listeners with Multiple Inheritance
import org.testng.ITestListener;
import org.testng.ITestResult;

interface RetryLogic {
	boolean retryFailedTest(ITestResult result);
}

interface Logging {
	void logTestDetails(ITestResult result);
}

// Implementing both interfaces in TestNG Listener
class CustomListener implements ITestListener, RetryLogic, Logging {
    
    @Override
    public boolean retryFailedTest(ITestResult result) {
        System.out.println("Retrying failed test: " + result.getName());
        return true;
    }

    @Override
    public void logTestDetails(ITestResult result) {
        System.out.println("Logging test details: " + result.getName());
    }
}


public class E3MI_use_In_our_AutomationFW {
	//for calling have to do some research
	//just for Ex only for this program
}
