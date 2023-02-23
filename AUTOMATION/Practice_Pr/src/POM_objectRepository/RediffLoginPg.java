package POM_objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RediffLoginPg {
	WebDriver driver;
	//Assign locator value
	@FindBy(name="login")
	WebElement emailId;
			
	//Assign locator value
	@FindBy(name="passwd")
	WebElement pwd;
			
	//Assign locator value
	@FindBy(name="proceed")
	WebElement go;
			
	//to return obj
	public WebElement emailObj(){
	return(emailId);
	}
	public WebElement pwdObj(){
	return pwd;
	}
	
	public WebElement goObj(){
	return(go);
	}
}
