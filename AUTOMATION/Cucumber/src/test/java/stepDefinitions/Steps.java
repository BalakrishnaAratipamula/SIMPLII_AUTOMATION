package stepDefinitions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import PageObjects.AddCustomerPage;
import PageObjects.LoginPage;
import PageObjects.SearchCustomerPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class Steps extends BaseClass {

	//public WebDriver driver; ///put in BaseClass bcz it is common thing
	//public LoginPage lp; ///put in BaseClass bcz it is common thing

	////////////F1(Login):Login feature step definition
	@Before //huk concept in cucumber //bcz this pert method will started one time before its execution //this annotation cant able to extend from other classes so i created here
	public void setUp() throws IOException{//every required configuration i will put inside this method

		logger = Logger.getLogger("Cucumber"); //added logger //name of project
		PropertyConfigurator.configure("log4j.properties"); 

		configprop = new Properties(); //to read properties file
		FileInputStream configPropFile = new FileInputStream("config.properties"); //if properties file is in another dir need to specify entire path
		configprop.load(configPropFile);

		String br = configprop.getProperty("browser"); //from properties file
		if(br.equals("chrome")) { //from properties file
			System.setProperty("webdriver.chrome.driver", configprop.getProperty("chromepath"));
			//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers/chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(br.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", configprop.getProperty("firefoxpath"));
			//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers/chromedriver.exe");
			driver = new FirefoxDriver();
		}
		
		logger.info("*****Launched browser*****");
		driver.manage().window().maximize();

	}

	@Given("user launch chrome browser")
	public void user_launch_chrome_browser() {

		lp = new LoginPage(driver);

	}

	@When("user opens URL {string}")
	public void user_opens_url(String url) {
		logger.info("*****Entered URL*****");
		driver.get(url);
	}

	@When("user enters Email as {string} and password as {string}")
	public void user_enters_email_as_and_password_as(String email, String password) {
		lp.setUserName(email);
		lp.setUserPassword(password);
	}

	@When("click on login")
	public void click_on_login() throws InterruptedException {
		lp.clickLogin();
	}

	@Then("page title should be {string}")
	public void page_title_should_be(String title) throws InterruptedException {
		Thread.sleep(3500);
		if(driver.getPageSource().contains("Login was unsuccessful.")) {
			logger.info("*****Login failed*****");
			driver.close();
			Assert.assertTrue(false); //this will make test method get fail
		}else {
			Assert.assertEquals(title, driver.getTitle());
			logger.info("*****Login passed*****");
		}
	}

	@When("user click on LogOut link")
	public void user_click_on_log_out_link() throws InterruptedException {
		lp.clickLogout();
		Thread.sleep(3000);
	}

	//as per feature file "Then page title should be "Your store. Login" so no need to create again this method it will call automatically (it avoid duplicate)

	@Then("close browser")
	public void close_browser() {
		logger.info("*****Browser closed*****");
		driver.quit();
	}


	///////////F2S1(Customers):Customer feature step definition
	@Then("user can view Dashboad")
	public void user_can_view_dashboad() { 
		addCust = new AddCustomerPage(driver);
		Assert.assertEquals("Dashboard / nopCommerce administration", addCust.getPageTitle());
	} 

	@When("User click on customer menu")
	public void user_click_on_austomer_menu() throws InterruptedException {
		Thread.sleep(3000);
		addCust.clickOnCustomersmenu();
	}

	@When("click click on customer menu items")
	public void click_click_on_customer_menu_items() throws InterruptedException {
		Thread.sleep(2000);
		addCust.clickOnCustomersmenuItem();
	}

	@When("click on add new button")
	public void click_on_add_new_button() throws InterruptedException {
		addCust.clickOnAddnew();
		Thread.sleep(3000);
	}

	@Then("user view add new customer page")
	public void user_view_add_new_customer_page() {
		Assert.assertEquals("Add a new customer / nopCommerce administration", addCust.getPageTitle());
	}

	@When("user enter customer info") //inside this multiple methods are there in PageObject class
	public void user_enter_customer_info() throws InterruptedException {
		String email = StringrandomString()+"@gmmail.com";
		addCust.setEmail(email);
		addCust.setPassword("test1234");
		addCust.setFirstName("Bala");
		addCust.setLastName("Krishna");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,250)");
		Thread.sleep(1000);
		addCust.setCustomerRoles("Administrators");
		Thread.sleep(3000);
	}

	@When("click on save button")
	public void click_on_save_button() throws InterruptedException {
		addCust.clickOnSave();
		Thread.sleep(2000);
	}

	@Then("user can view confirmation message {string}")
	public void user_can_view_confirmation_message(String msg) {
		Assert.assertTrue(driver.findElement(By.tagName("body")).getText() //tagName("body")-- gives complete html code from body
				.contains("The new customer has been added successfully."));
	}

	/////////F2S2(Customers): Search customer by EmailId 
	@When("enter customer Email")
	public void enter_customer_email() {
		searchCust = new SearchCustomerPage(driver);
		searchCust.setEmail("brenda_lindgren@nopCommerce.com");
	}

	@When("click on search button")
	public void click_on_search_button() throws InterruptedException {
		searchCust.clickSearch();
		Thread.sleep(4000);
	}

	@Then("user should found Email in search table")
	public void user_should_found_email_in_search_table() {
		boolean status = searchCust.searchCustomerByEmail("brenda_lindgren@nopCommerce.com");
		Assert.assertEquals(true,status);
	}


	///////////F2S3(Customers): Search customer by FirstName and LastName 
	@When("enter customer FirstName")
	public void enter_customer_first_name() {
		searchCust = new SearchCustomerPage(driver);
		searchCust.setFirstName("brenda");
	}

	@When("enter customer LastName")
	public void enter_customer_last_name() {
		searchCust.setLastName("lindgren");
	}

	@Then("user should found Name in the search table")
	public void user_should_found_name_in_the_search_table() {
		boolean status = searchCust.searchCustomerByFandLnames("Brenda Lindgren");
		Assert.assertEquals(true, status);
	}

}
