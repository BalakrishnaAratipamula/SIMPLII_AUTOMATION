package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage{

	public AccountRegistrationPage(WebDriver driver) {
		super(driver);
	}

	//FirstName
	@FindBy(name = "firstname")
	WebElement txtFirstName;
	
	//LastName
	@FindBy(name = "lastname")
	WebElement txtLastName;
	
	//email
	@FindBy(name = "email")
	WebElement txtEmail;
		
	//telephone
	@FindBy(id = "input-telephone")
	WebElement txtTelephone;
	
	//password
	@FindBy(id = "input-password")
	WebElement txtPasswordRegPage;
		
	//confirm password
	@FindBy(id = "input-confirm")
	WebElement txtConfirmPassword;
	
	//'privacy policy' check box
	@FindBy(name = "agree")
	WebElement chkdPolicy;
	
	//[continue]
	@FindBy(xpath = "//input[@value='Continue']")
	WebElement btnContinue;
	
	//'Your Account Has Been Created!' after Logged in
	@FindBy(xpath = "//div[@id='content']/h1[text()='Your Account Has Been Created!']")
	WebElement msgConfirmationAfterLoggedin;
	
	public void setFirstName(String fname) {
		txtFirstName.sendKeys(fname);
	}
	
	public void setLastName(String lname) {
		txtLastName.sendKeys(lname);
	}
	
	public void setEmailRegPage(String emailReg) {
		txtEmail.sendKeys(emailReg);
	}
	
	public void setTelephone(String teleph) {
		txtTelephone.sendKeys(teleph);
	}
	
	public void setPasswordRegPage(String pwdReg) {
		txtPasswordRegPage.sendKeys(pwdReg);
	}
	
	public void setConfirmPassword(String cnfPwd) {
		txtConfirmPassword.sendKeys(cnfPwd);
	}
	
	public void clkPolicyCheckBox() {
		chkdPolicy.click();
	}
	
	public void clickContinueBtn() {
		btnContinue.click();
	}
	
	public String getConfirmationMsg() {
		try {
			return (msgConfirmationAfterLoggedin.getText());
		} catch(Exception e) {
			return (e.getMessage());
		}
	}
}





















