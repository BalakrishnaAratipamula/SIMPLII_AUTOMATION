package stepDefinitions;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/*import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
*/
public class StepDefintions {

	WebDriver driver;

	@Given("^User is already on Open HRMS application$")
	public void open_HRMS_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		// System.setProperty("webdriver.edge.driver", "E:\\Drivers\\msedgedriver.exe");
		driver = new ChromeDriver();
		// driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(5000);
	}

	@When("^Enter Registered user name and Password$")
	public void enter_Registered_user_name_and_Password() throws Throwable {
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);
	}

	@When("^Enter Registered userName as \"([^\"]*)\" and passWord as \"([^\"]*)\"$")
	public void enter_Registered_userName_as_and_passWord_as(String username, String password) throws Throwable {
		System.out.println(username + "   " + password);
		driver.findElement(By.name("username")).clear();
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);
	}

	@When("^Enter Registered userName and passWord")
	public void Enter_Registered_userName_and_passWord(DataTable dataTable) throws Throwable {
		List<List<String>> data = dataTable.cells();
		// System.out.println(username + " " + password);
		driver.findElement(By.name("username")).clear();
		driver.findElement(By.name("username")).sendKeys(data.get(1).get(0));
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys(data.get(1).get(1));
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("username")).clear();
		driver.findElement(By.name("username")).sendKeys(data.get(2).get(0));
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys(data.get(2).get(1));
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("username")).clear();
		driver.findElement(By.name("username")).sendKeys(data.get(3).get(0));
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys(data.get(3).get(1));
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);
	}

	/*
	 * System.out.println(username + "   " + password);
	 * driver.findElement(By.name("username")).clear();
	 * driver.findElement(By.name("username")).sendKeys(username);
	 * driver.findElement(By.name("password")).clear();
	 * driver.findElement(By.name("password")).sendKeys(password);
	 * driver.findElement(By.xpath("//button[@type='submit']")).click();
	 * Thread.sleep(5000);
	 */

	@Then("Home page should be shown$")
	public void login_page_should_be_shown() throws Throwable {

		String actual_Homepage_URL = driver.getCurrentUrl();
		String expected_Homepage_URL = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";

		if (actual_Homepage_URL.equalsIgnoreCase(expected_Homepage_URL)) {
			System.out.println("test is passed");
		} else {
			System.out.println("test is failed");
		}

	}

	@When("^Browser is close$")
	public void Browser_is_close() throws Throwable {
		driver.quit();
	}

}
