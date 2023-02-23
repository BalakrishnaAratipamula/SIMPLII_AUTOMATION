package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefintions {
	
	WebDriver driver;
	
	@Given("^User is already on Open HRMS application$")
	public void open_HRMS_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}


	@When("^Enter Registered user name and Password$")
	public void enter_Registered_user_name_and_Password() throws Throwable {
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
	    Thread.sleep(5000);
	}
	
//	@Given("^Enter Registered <\"([^\"]*)\"> and <\"([^\"]*)\">$")
//	public void enter_Registered_and(String username, String password) throws Throwable {
//		System.out.println(username+"   "+password);
//		driver.findElement(By.id("txtUsername")).clear();
//		driver.findElement(By.id("txtUsername")).sendKeys(username);
//		driver.findElement(By.id("txtPassword")).clear();
//		driver.findElement(By.id("txtPassword")).sendKeys(password);
//		driver.findElement(By.id("btnLogin")).click();
//	    Thread.sleep(5000);
//	}
	

@Given("^Enter Registered \"([^\"]*)\" and \"([^\"]*)\"$")
public void enter_Registered_and(String username, String password) throws Throwable {
	System.out.println(username+"   "+password);
	driver.findElement(By.id("txtUsername")).clear();
	driver.findElement(By.id("txtUsername")).sendKeys(username);
	driver.findElement(By.id("txtPassword")).clear();
	driver.findElement(By.id("txtPassword")).sendKeys(password);
	driver.findElement(By.id("btnLogin")).click();
    Thread.sleep(5000);
}

	@Then("Home page should be shown$")
	public void login_page_should_be_shown() throws Throwable {
	   
		String actual_Homepage_URL=driver.getCurrentUrl();
		String expected_Homepage_URL="https://opensource-demo.orangehrmlive.com/index.php/dashboard";
		
		if(actual_Homepage_URL.equalsIgnoreCase(expected_Homepage_URL)){
			System.out.println("test is passed");
		}else {
			System.out.println("test is failed");
		}
		
	}

}
