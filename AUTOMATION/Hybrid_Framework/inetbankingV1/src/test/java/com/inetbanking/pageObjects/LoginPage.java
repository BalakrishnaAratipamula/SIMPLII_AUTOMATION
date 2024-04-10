package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver ldriver;
	
	//Initialization--------------
	public LoginPage(WebDriver rdriver)
	{
		this.ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	//Identification------------
	@FindBy(name="uid")
	@CacheLookup
	WebElement txtUserName;

	@FindBy(name="password")
	@CacheLookup
	WebElement txtPassword;

	@FindBy(name="btnLogin")
	@CacheLookup
	WebElement btnLogin;

	@FindBy(xpath="/html/body/div[3]/div/ul/li[15]/a")
	@CacheLookup
	WebElement lnkLogout;


	//Declaration----------Creating Action Methods to WebElements 
	public void setUserName(String uname) {
		txtUserName.sendKeys(uname);
	}

	public void setPassword(String pwd) {
		txtPassword.sendKeys(pwd);
	}


	public void clickSubmit() {
		btnLogin.click();
	}	

	public void clickLogout() {
		lnkLogout.click();
	}



}









