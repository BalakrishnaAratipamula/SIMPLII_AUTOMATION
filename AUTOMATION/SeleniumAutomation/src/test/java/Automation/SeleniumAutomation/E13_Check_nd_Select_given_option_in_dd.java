package Automation.SeleniumAutomation;

import java.time.Duration;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

public class E13_Check_nd_Select_given_option_in_dd {
	public static void main(String[] args) throws InterruptedException {
		//Scanner class is used to get the input from console at the time of exdecution
		Boolean myStatus = false;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter which country u want to chect and select");
		String scnr = scanner.nextLine();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://practice.expandtesting.com/dropdown");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); 
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)");
		
		By countryDD = By.name("country");
		
		//Fluent Wait
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(5))
				.ignoring(NoSuchElementException.class, StaleElementReferenceException.class);
		wait.until(ExpectedConditions.presenceOfElementLocated(countryDD));
		
		driver.findElement(countryDD).click();
		Thread.sleep(3000);
		
		Select sc = new Select(driver.findElement(By.name("country")));
		List<WebElement> options = sc.getOptions();
		System.out.println(options.size());
		
		//to print all options
		for(WebElement option : options) {
			String optionText = option.getText(); 				//equalsIgnoreCase() it will ignore the care-sensitive while comparing the string content
			if(optionText.trim().equalsIgnoreCase(scnr.trim())) { //trim() is to trim the trailing and preceding spaces
				System.out.println("Expected contry "+scnr+" is exist");
				sc.selectByVisibleText(optionText);
				myStatus = true; //If option is avalable and selected from dd list i want to change myStatus to 'true'
				break;
			}
			if(myStatus==false) {
				System.out.println("Expected country name doesn't exist");
			}
		}
		
		Thread.sleep(3000);
		driver.quit();
	}
}
