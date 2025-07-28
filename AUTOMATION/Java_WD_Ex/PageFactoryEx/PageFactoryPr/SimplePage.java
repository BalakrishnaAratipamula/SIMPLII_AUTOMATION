package PageFactoryPr;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SimplePage {
	WebDriver driver;
	@FindBy(id="search")
	WebElement searchTextBox;
	@FindBy(id="searchBtn")
	WebElement searchButton;
	
	//Constructor 
	public SimplePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//Sample method
	public void search(String searchTerm) {
		searchTextBox.sendKeys(searchTerm);
		searchButton.click();
	}
}
