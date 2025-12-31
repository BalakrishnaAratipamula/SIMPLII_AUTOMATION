package WD_Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class EX10f_HandlingDynamicDropDowns {
	/*/M1- Using Click and List<WebElement> 
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://examples.com");
		
		// Click the dropdown to display options
		WebElement dropdown = driver.findElement(By.id("dynamicDropdown"));
		dropdown.click();

		// Wait for options to be visible
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@id='dropdownOptions']/li")));

		// Get all options
		List<WebElement> options = driver.findElements(By.xpath("//ul[@id='dropdownOptions']/li"));

		// Iterate and select
		for (WebElement option : options) {
		    if (option.getText().equals("Option 3")) {
		        option.click();
		        break;
		    }
		}
	} //*/
	
	/*/M2- Using sendKeys (for searchable dropdowns)
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://examples.com");
		
		WebElement dropdownInput = driver.findElement(By.id("dynamicDropdownInput"));
		dropdownInput.sendKeys("Option 3");

		// Wait for filtered option to appear
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement option = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[text()='Option 3']")));
		option.click();
	} //*/
	
	// M3- Using Actions class
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://examples.com");

		Actions actions = new Actions(driver);
		WebElement dropdown = driver.findElement(By.id("dynamicDropdown"));
		actions.moveToElement(dropdown).click().perform();

		WebElement option = driver.findElement(By.xpath("//li[text()='Option 3']"));
		actions.moveToElement(option).click().perform();
	}
}
