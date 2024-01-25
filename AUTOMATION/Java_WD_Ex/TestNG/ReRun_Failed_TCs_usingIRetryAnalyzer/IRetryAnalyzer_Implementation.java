package ReRun_Failed_TCs_usingIRetryAnalyzer;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class IRetryAnalyzer_Implementation implements IRetryAnalyzer {

	int retrycount = 0;
	static final int maxRetryCount = 5;

	@Override
	public boolean retry(ITestResult id) { // id - give any String as 'VariableDeclaratorId'

		if (retrycount < maxRetryCount) {
			retrycount++;
			return true;
		}
		return false;
	}

}
