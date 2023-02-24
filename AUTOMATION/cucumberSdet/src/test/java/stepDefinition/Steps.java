package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginPage;

public class Steps extends Base{
	
	
	

	@Given("user launch mozilla firefox browser")
	public void user_launch_mozilla_firefox_browser() {
	   System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\Drivers\\geckodriver.exe");
	   driver=new FirefoxDriver();
	   driver.manage().window().maximize();
	   lp=new LoginPage(driver);
	}

	@When("user opens url {string}")
	public void user_opens_url(String url) {
	   driver.get(url);
	}

	@When("users enter email {string} and password as {string}")
	public void users_enter_email_and_password_as(String email, String passward) {
	   lp.setUsername(email);
	   lp.setPassword(passward);
	}

	@When("click login")
	public void click_login() {
	  lp.clickLogin();
	}

	@Then("page title should be {string}")
	public void page_title_should_be(String title) throws InterruptedException {
		Thread.sleep(2000);
	  if(driver.getPageSource().contains("Login was unsuccessful.")) {
		  driver.close();
		  Assert.assertTrue(false);
		
	  }else {
			Thread.sleep(10000);
		  Assert.assertEquals(title, driver.getTitle());
	  }
		
		
	}

	@When("user click on logout link")
	public void user_click_on_logout_link() throws InterruptedException {
	  lp.clickLogout();

	}

	@Then("close the browser")
	public void close_the_browser() {
	 driver.close();
	}
	
//	customer fature file definition
	

@Then("user can view Dashboard")
public void user_can_view_dashboard() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@When("user click on customers menu")
public void user_click_on_customers_menu() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@When("click on customers menu item")
public void click_on_customers_menu_item() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@When("click on add new button")
public void click_on_add_new_button() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("user can view add new customer page")
public void user_can_view_add_new_customer_page() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@When("user enter customer info")
public void user_enter_customer_info() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@When("click on save button")
public void click_on_save_button() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("user can see confirmation message {string}")
public void user_can_see_confirmation_message(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("close browser")
public void close_browser() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

}
