package com.inetbanking.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.AddCustomerPage;
import com.inetbanking.pageObjects.LoginPage;

public class TC_AddCustomerTest_003 extends BaseClass {

	@Test
	public void addNewCustomer() throws InterruptedException, IOException {

		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		logger.info("User name is provided");
		lp.setPassword(password);
		logger.info("Passsword is provided");
		lp.clickSubmit();

		Thread.sleep(3000);


		AddCustomerPage addcust = new AddCustomerPage(driver);
		addcust.clickAddNewCustomer(); //to click on Add New Customer link
		Thread.sleep(1000);
		logger.info("providing customer details....");
		addcust.custName("Balakrishna");
		addcust.custgender("male");
		Thread.sleep(2000);
		addcust.custdob("03","03","1992");
		Thread.sleep(4000);
		addcust.custaddress("INDIA");
		addcust.custcity("HYD");
		addcust.custstate("AP");
		addcust.custpinno("5000074");
		addcust.custtelephoneno("987890091");

		String email = randomestring()+"@gmail.com";
		addcust.custemailid(email);
		addcust.custpassword("abcdefg");
		Thread.sleep(1000);
		addcust.custsubmit();

		Thread.sleep(5000);

		logger.info("validation started....");

		boolean result = driver.getPageSource().contains("Customer Registered Successfully!!!");

		if(result==true) {
			Assert.assertTrue(true);
			logger.info("test case passed....");
		}
		else {
			logger.info("test case failed....");
			captureScreen(driver,"addNewCustomer");
			Assert.assertTrue(false);
		}

	}

}
