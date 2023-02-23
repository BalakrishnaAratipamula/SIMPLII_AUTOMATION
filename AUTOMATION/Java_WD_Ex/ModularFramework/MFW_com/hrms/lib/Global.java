package MFW_com.hrms.lib;

import org.openqa.selenium.WebDriver;

public class Global {
	//var
	public WebDriver driver;
	public String url = "https://opensource-demo.orangehrmlive.com/index.php/auth/login";
	public String un = "bhanu";
	public String pw = "bhanu";
	//obj
	public String txt_loginname = "txtUserName";
	public String txt_password = "//input[@name='txtPassword']";
	public String btn_login = "Submit";
	public String link_logout = "Logout";
}
//////////////////////////////////////////// need to implement the script