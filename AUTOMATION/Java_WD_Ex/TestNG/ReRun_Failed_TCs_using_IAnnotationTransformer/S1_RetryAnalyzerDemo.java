package ReRun_Failed_TCs_using_IAnnotationTransformer;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class S1_RetryAnalyzerDemo implements IRetryAnalyzer {
	int initialCount = 0;
	int macCount = 2;

	public boolean retry(ITestResult result) {
		if (initialCount < macCount) {
			initialCount++;
			return true;
		}
		return false;
	}
}
