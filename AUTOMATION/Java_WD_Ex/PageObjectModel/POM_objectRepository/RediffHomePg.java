package POM_objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

//WebElemnt identification code for 'Home Page'
public class RediffHomePg {
	/*/Assign locator value to obj
	@FindBy(how=How.LINK_TEXT , using="Sign in")
	WebElement signin; */
		 	//////(or)
	//Assign locator value to obj
	@FindBy(linkText="Sign in")
	WebElement signin; 

	//to return obj
	public WebElement signinObj(WebDriver driver){ //WebElement----acts as DataType  ////return value by submethod
		return(signin);
	}
}
