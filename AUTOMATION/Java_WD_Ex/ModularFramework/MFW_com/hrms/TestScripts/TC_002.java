package MFW_com.hrms.TestScripts;

import MFW_com.hrms.lib.General;

public class TC_002 {
public static void main(String[] args) throws Exception {
	General obj = new General();
	obj.openApplication();
	obj.login();
	obj.addEmp();
	Thread.sleep(1000);
	obj.delEmp();
	Thread.sleep(1000);
	obj.logout();
	Thread.sleep(2000);
	obj.closeApplication();
	
}
}
