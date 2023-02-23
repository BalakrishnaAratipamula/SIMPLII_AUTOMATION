package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPage {

	public WebDriver gdriver; 

	public AddCustomerPage(WebDriver ldriver) { //constructor doesn't come void
		this.gdriver = ldriver; //(or) ldriver = rdriver;
		PageFactory.initElements(ldriver, this);

	}

	By linkCustomers_menu = By.xpath("/html/body/div[3]/aside/div/div[4]/div/div/nav/ul/li[4]/a/p");
	By linkCustomers_mentItem = By.xpath("//body/div[3]/aside[1]/div[1]/div[4]/div[1]/div[1]/nav[1]/ul[1]/li[4]/ul[1]/li[1]/a[1]");

	By btnAddnew = By.xpath("//a[@class='btn btn-primary']");

	By txtEmail = By.xpath("//input[@id='Email']");
	By txtPassword = By.xpath("//input[@id='Password']");

	By txtFirstName = By.xpath("//input[@id='FirstName']");
	By txtLastName = By.xpath("//input[@id='LastName']");

	By txtcustomerRoles = By.xpath("//div[@class='k-multiselect-wrap k-floatwrap']");
	By ddAdministators = By.xpath("//li[contains(text(),'Administrators')]");
	By ddGuest = By.xpath("//li[contains(text(),'Guest')]");
	By ddVendors = By.xpath("//li[contains(text(),'Vendors')]");

	By btnSave = By.xpath("//button[@name='save']");

	
	
	////Action methods
	//to return title of page
	public String getPageTitle() {
		return gdriver.getTitle();
	}

	public void clickOnCustomersmenu() {
		gdriver.findElement(linkCustomers_menu).click();
	}

	public void clickOnCustomersmenuItem() {
		gdriver.findElement(linkCustomers_mentItem).click();
	}

	public void clickOnAddnew() {
		gdriver.findElement(btnAddnew).click();
	}

	public void setEmail(String email) {
		gdriver.findElement(txtEmail).sendKeys(email);
	}

	public void setPassword(String password) {
		gdriver.findElement(txtPassword).sendKeys(password);
	}

	public void setFirstName(String fname) {
		gdriver.findElement(txtFirstName).sendKeys(fname);
	}

	public void setLastName(String lname) {
		gdriver.findElement(txtLastName).sendKeys(lname);
	} 

	public void setCustomerRoles(String role) throws InterruptedException {
		WebElement listitem = null;
		Thread.sleep(3000);
		if(role.equals("Administrators")) {
			listitem = gdriver.findElement(ddAdministators);
		}
		else if(role.equals("Guest")) {
			listitem = gdriver.findElement(ddGuest);
		}
		else if(role.equals("Vendors")) {
			listitem = gdriver.findElement(ddVendors);
		}

		//listitem.click(); //only one condition will get selected
		//(or)
		JavascriptExecutor js = (JavascriptExecutor)gdriver;
		js.executeScript("arguments[0].click();", listitem);

	}

	public void clickOnSave() {
		gdriver.findElement(btnSave).click();
	}




}
