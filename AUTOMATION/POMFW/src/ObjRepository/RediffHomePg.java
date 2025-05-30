package ObjRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

//WebElemnt identification code for 'Home Page'
public class RediffHomePg {

	// Assign locator value
	@FindBy(linkText = "Sign in")
	WebElement signin;

	// to return obj
	public WebElement signinObj(WebDriver driver) {// WebElement----DT
		return (signin);
	}
}
