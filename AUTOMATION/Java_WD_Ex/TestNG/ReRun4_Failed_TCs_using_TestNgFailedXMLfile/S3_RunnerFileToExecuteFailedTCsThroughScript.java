package ReRun4_Failed_TCs_using_TestNgFailedXMLfile;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;
import org.testng.annotations.Test;

public class S3_RunnerFileToExecuteFailedTCsThroughScript {
	
	@Test //if we use '@AfterTest' annotation place this block of code inside S1_ClassA and S2_ClassB
	public void runFailTestCases() {
		TestNG obj = new TestNG();
		List<String> list = new ArrayList<String>();
		list.add("F:\\SIMPLII\\SIMPLII_AUTOMATION\\AUTOMATION\\Java_WD_Ex\\test-output\\testng-failed.xml");
		obj.setTestSuites(list);
		obj.run();
	}
}
