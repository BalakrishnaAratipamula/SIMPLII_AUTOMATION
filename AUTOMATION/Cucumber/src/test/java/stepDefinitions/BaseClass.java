package stepDefinitions;

import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import PageObjects.AddCustomerPage;
import PageObjects.LoginPage;
import PageObjects.SearchCustomerPage;

public class BaseClass {
	
	public WebDriver driver;
	public LoginPage lp;
	public AddCustomerPage addCust;
	public SearchCustomerPage searchCust;
	public static Logger logger; //static bcz this assigned variable i'm referring to every step method
	public Properties configprop;
	
	//to generate random string for unique Email Id
	public static String StringrandomString() { //(or) non-static
		String generatedString1 = RandomStringUtils.randomAlphabetic(5); //create 5 character string
		return (generatedString1);
	}
}
