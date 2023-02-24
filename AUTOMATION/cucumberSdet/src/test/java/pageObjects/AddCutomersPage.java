package pageObjects;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AddCutomersPage {

	public WebDriver ldriver;
	
	public AddCutomersPage(WebDriver rdrver) {
		this.ldriver=rdrver;
		PageFactory.initElements(rdrver, this);
	}
	
	By link_customerMenu=By.xpath("/html/body/div[3]/aside/div/div[4]/div/div/nav/ul/li[4]/a/p");
	By link_customers=By.xpath("/html/body/div[3]/aside/div/div[4]/div/div/nav/ul/li[4]/ul/li[1]/a/p");
	
	By btnAddnew=By.xpath("/html/body/div[3]/div[1]/form[1]/div/div/a");
	
	By email=By.id("Email");
	By password=By.id("Password");
	By cfname=By.id("FirstName");
	By clname=By.id("LastName");
	By gmale=By.id("Gender_Male");
	By gfemale=By.id("Gender_Female");
	By dob=By.id("DateOfBirth");
	By companyname=By.id("Company");
	
	By taxclixk=By.id("IsTaxExempt");

	By newsletter=By.xpath("/html/body/div[3]/div[1]/form/section/div/div/nop-cards/nop-card/div/div[2]/div[9]/div[2]/div/div[1]/div/div");
	By role=By.xpath("/html/body/div[3]/div[1]/form/section/div/div/nop-cards/nop-card/div/div[2]/div[10]/div[2]/div/div[1]/div/div");
	By vendor=By.id("VendorId");
	By active=By.id("Active");
	By comment=By.id("AdminComment");
	By btnsave=By.className("btn btn-primary");

	
	public String getPagetitle() {
		return ldriver.getTitle();
	}
	
	public void clickOnCustomersMenu() {
		ldriver.findElement(link_customerMenu).click();
	}
	
	public void clickOnCustomersMenuItem() {
		ldriver.findElement(link_customers).click();
	}
	
	public void clickOnAddNew() {
		ldriver.findElement(btnAddnew).click();
	}
	

	
	
	
}
