package MFW_com.hrms.TestScripts;

import MFW_com.hrms.lib.General;

public class TC_001 {
public static void main(String[] args) throws Exception {
	//Test case steps
	General obj = new General();
	obj.openApplication();
	Thread.sleep(1000);
	obj.login();
	Thread.sleep(1000);
	obj.logout();
	Thread.sleep(1000);
	obj.closeApplication();
}
}
