package com.hrms.TS;
import org.testng.annotations.Test;

import com.OHRM.lib.General;

public class TC_101 {

	@Test
	public void LogInTest()
	{
      General g=new General();
      g.setUp();
      g.Login();
      g.verifyLogin();
      g.tearDown();
	}
}