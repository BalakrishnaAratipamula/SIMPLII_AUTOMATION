package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.*;

public class Steps3 {

	public WebDriver driver;

	@Given("I am on Success page")
	public void i_am_on_success_page() {
		
	}

	@When("i check page title")
	public void i_check_page_title() {
		String actualTitle = driver.getTitle();
		String expectedTitle = "";
		Assert.assertEquals("Condition true", actualTitle, expectedTitle);
	}

	@Then("close the browser")
	public void close_the_browser() {
		driver.quit();
	}

}
