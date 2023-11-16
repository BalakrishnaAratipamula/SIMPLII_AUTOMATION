package com.hrms.TS;

import org.testng.annotations.Test;

import com.hrms.lib.General;

public class TC_001 {

	@Test
	public void LogInTest() {
		General g = new General();
		g.setUp();
		g.Login();
		g.verifyLogin();
		g.tearDown();
	}
}