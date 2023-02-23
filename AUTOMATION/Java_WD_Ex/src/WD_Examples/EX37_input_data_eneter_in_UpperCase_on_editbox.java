//write script to enter "selenium" in upper case at search edit box 
package WD_Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class EX37_input_data_eneter_in_UpperCase_on_editbox {
	public static void main(String[] args) {
		// To initialize browser
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();

		//to enter value in Edit box
		WebElement searchBox = driver.findElement(By.name("field-keywords"));

		Actions act= new Actions(driver);
		////click() to focus on edit box  ////toUpperCase() can applicable only for comparison and not for enter text data
		act.moveToElement(searchBox).click().keyDown(Keys.SHIFT).sendKeys("selenium").keyUp(Keys.SHIFT).build().perform();

	}
}
