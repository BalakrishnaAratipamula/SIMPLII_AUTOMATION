package stepDefinition;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.WebDriver;

import pageObjects.AddCutomersPage;
import pageObjects.LoginPage;

public class Base {
	public WebDriver driver;
	public LoginPage lp;
	public AddCutomersPage addcus;
	
	public static String randomString() {
		String random=RandomStringUtils.random(5);
		return random;
	}
}
