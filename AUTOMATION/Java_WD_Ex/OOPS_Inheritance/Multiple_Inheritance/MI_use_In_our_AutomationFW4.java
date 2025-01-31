package Multiple_Inheritance;

interface KeywordDriven {
	void executeKeyword(String keyword);
}

interface DataDriven {
	void readTestData(String filePath);
}

class HybridFramework implements KeywordDriven, DataDriven {

	@Override
	public void executeKeyword(String keyword) {
		System.out.println("Executing keyword: " + keyword);
	}

	@Override
	public void readTestData(String filePath) {
		System.out.println("Reading test data from: " + filePath);
	}
}

public class MI_use_In_our_AutomationFW4 {
	// for calling have to do some research
	// just for Ex only for this program
}
