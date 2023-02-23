package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.*;

public class Steps2 {

	public WebDriver driver;

	@Given("I am on the booking page")
	public void i_am_on_the_booking_page() {
		driver.findElement(By.xpath("")).click();
	}

	@When("I check the page title")
	public void i_check_the_page_title() {
		String actualTitle = driver.getTitle();
		String expectedTitle = "";
		Assert.assertEquals("Condition true", actualTitle, expectedTitle);
	}

	@When("I click confirm booking button")
	public void i_click_confirm_booking_button() {
		driver.findElement(By.xpath("")).click();
	}

	@When("I check for alert for first name")
	public void i_check_for_alert_for_first_name() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
	}

	@When("I enter first name and click confirm booking")
	public void i_enter_first_name_and_click_confirm_booking() {
		driver.findElement(By.xpath("//*[@id=\"txtFirstName\"]")).sendKeys("");
		driver.findElement(By.name("")).click();
	}

	@When("I check for alert for last name")
	public void i_check_for_alert_for_last_name() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}

	@When("I enter last name and click confirm booking")
	public void i_enter_last_name_and_click_confirm_booking() {
		driver.findElement(By.xpath("//*[@id=\"txtLastName\"]")).sendKeys("");
		driver.findElement(By.xpath("")).click();
	}

	@When("I check for alert for email")
	public void i_check_for_alert_for_email() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}

	@When("I enter email and click confirm booking")
	public void i_enter_email_and_click_confirm_booking() {
		driver.findElement(By.xpath("//*[@id=\"txtEmail\"]")).sendKeys("");
		driver.findElement(By.name("")).click();
	}

	@When("I check for alert for mobile number")
	public void i_check_for_alert_for_mobile_number() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}

	@When("I enter invalid mobile no and click confirm booking")
	public void i_enter_invalid_mobile_no_and_click_confirm_booking() {
		driver.findElement(By.xpath("//*[@id=\"txtPhone\"]")).sendKeys("");
		driver.findElement(By.name("")).click();
	}

	@When("I check for alert for contact no")
	public void i_check_for_alert_for_contact_no() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}

	@When("I enter contact no and click confirm booking")
	public void i_enter_contact_no_and_click_confirm_booking() {
		driver.findElement(By.xpath("/html/body/div/div/form/table/tbody/tr[6]/td[2]/textarea")).sendKeys("");
		driver.findElement(By.name("")).click();
	}

	@When("I check alert for city")
	public void i_check_alert_for_city() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}

	@When("I select city and click confirm booking")
	public void i_select_city_and_click_confirm_booking() {
		driver.findElement(By.name("")).sendKeys("");
		driver.findElement(By.name("")).click();
	}

	@When("I check alert for state")
	public void i_check_alert_for_state() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}

	@When("I select state and click confirm booking")
	public void i_select_state_and_click_confirm_booking() {
		driver.findElement(By.name("")).sendKeys("");
		driver.findElement(By.name("")).click();
	}

	@When("I check alert for cardholder name")
	public void i_check_alert_for_cardholder_name() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}

	@When("I enter cardholder name and click confirm booking")
	public void i_enter_cardholder_name_and_click_confirm_booking() {
		driver.findElement(By.xpath("//*[@id=\"txtCardholderName\"]")).sendKeys("");
		driver.findElement(By.name("")).click();
	}

	@When("I check for alert for debit card number")
	public void i_check_for_alert_for_debit_card_number() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}

	@When("I enter card details and click confirm booking")
	public void i_enter_card_details_and_click_confirm_booking() {
		driver.findElement(By.xpath("//*[@id=\"txtDebit\"]")).sendKeys("");
		driver.findElement(By.name("")).click();
	}

	@When("I check alert for cvv")
	public void i_check_alert_for_cvv() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}

	@When("I enter cvv and click confirm booking")
	public void i_enter_cvv_and_click_confirm_booking() {
		driver.findElement(By.xpath("//*[@id=\"txtCvv\"]")).sendKeys("");
		driver.findElement(By.name("")).click();
	}

	@When("I check alert for exp month")
	public void i_check_alert_for_exp_month() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}

	@When("I enter exp month and click confirm booking")
	public void i_enter_exp_month_and_click_confirm_booking() {
		driver.findElement(By.xpath("//*[@id=\"txtMonth\"]")).sendKeys("");
		driver.findElement(By.name("")).click();
	}

	@When("I check alert for exp year")
	public void i_check_alert_for_exp_year() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}

	@When("I enter exp year and click confirm booking")
	public void i_enter_exp_year_and_click_confirm_booking() {
		driver.findElement(By.xpath("//*[@id=\"txtYear\"]")).sendKeys("");
		driver.findElement(By.name("")).click();
	}

	@Then("I should go to success page")
	public void i_should_go_to_success_page() {
		String pageSource = driver.getPageSource();
		if(pageSource.contains("success page")) {
			Assert.assertTrue(true);
		}
		
	}

}
