package PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilies.WaitHelper;

public class SearchCustomerPage {

	public WebDriver ldriver;
	WaitHelper waithelper;

	public SearchCustomerPage(WebDriver rdriver) {
		this.ldriver=rdriver;
		PageFactory.initElements(ldriver, this); //rdriver / ldriver
		waithelper = new WaitHelper(ldriver);
	}


	@FindBy(id="SearchEmail")
	WebElement txtEmail;

	@FindBy(id="SearchFirstName")
	WebElement txtFirstName;

	@FindBy(id="SearchLastName")
	WebElement txtLastName;

	@FindBy(id="search-customers")
	WebElement btnSearch;

	@FindBy(xpath="//table[@id='customers-grid']")
	WebElement table;

	@FindBy(xpath="//table[@id='customers-grid']//tbody/tr")
	List<WebElement> tableRows;

	@FindBy(xpath="//table[@id='customers-grid']//tbody/tr/td")
	List<WebElement> tableColumns;



	public void setEmail(String email) {
		waithelper.WaitForElement(txtEmail, 30);
		txtEmail.clear();
		txtEmail.sendKeys(email);
	}

	public void setFirstName(String fname) {
		waithelper.WaitForElement(txtFirstName, 30);
		txtFirstName.clear();
		txtFirstName.sendKeys(fname);
	}

	public void setLastName(String lname) {
		waithelper.WaitForElement(txtLastName, 30);
		txtLastName.clear();
		txtLastName.sendKeys(lname);
	}

	public void clickSearch() {
		waithelper.WaitForElement(btnSearch, 30);
		btnSearch.click();

	}

	public int getNumOfRows() {
		return tableRows.size();
	}

	public int getNumOfColumns() {
		return tableColumns.size();
	}

	//to check Email id is present in table or not
	public boolean searchCustomerByEmail(String email) {
		boolean flag = false;
		for(int i=1; i<=getNumOfRows(); i++) {
			String emailid = table.findElement(By.xpath("//table[@id='customers-grid']/tbody/tr["+i+"]/td[2]")).getText();
			System.out.println(emailid);
			if(emailid.equals("brenda_lindgren@nopCommerce.com")) {
				flag=true;
			}
		}
		return flag;
	}

	//to check FirstName and LastName is present in table or not
	public boolean searchCustomerByFandLnames(String Name) {
		boolean flag = false;
		for(int i=1; i<=getNumOfRows(); i++) {
			String name = table.findElement(By.xpath("//table[@id='customers-grid']/tbody/tr["+i+"]/td[3]")).getText();
			System.out.println(name);
			String[] names = name.split(" "); //separate FirstName and LastName by space
			if(names[0].equals("Brenda") && names[1].equals("Lindgren")) {
				flag=true;
			}
		}
		return flag;
	}










}

