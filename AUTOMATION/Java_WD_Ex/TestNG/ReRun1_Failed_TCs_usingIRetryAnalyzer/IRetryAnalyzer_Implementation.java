package ReRun1_Failed_TCs_usingIRetryAnalyzer;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class IRetryAnalyzer_Implementation implements IRetryAnalyzer {

	int retrycount = 0;
	static final int maxRetryCount = 5; //if variable is marked as a final we can't change it's variable value

	@Override
	public boolean retry(ITestResult id) { //id - give any String as 'VariableDeclaratorId' - Used to complete FormalParameterList
		if (retrycount < maxRetryCount) {
			retrycount++;
			return true;
		}
		return false;
	}
}
