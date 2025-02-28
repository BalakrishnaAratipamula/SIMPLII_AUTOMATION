package Automation.SeleniumAutomation;

import java.io.IOException;
import java.util.List;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AAA {
	static Select sc;

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/"); // https://accounts.google.com/
		driver.manage().window().maximize();
		Thread.sleep(2000);

		WebElement ele = driver.findElement(By.tagName("select"));
		ele.click();
		Thread.sleep(3000);

		sc = new Select(ele);

		String selectedOptionText = getFirstSelectedOption();
		System.out.println(selectedOptionText);
		List<WebElement> options = sc.getOptions();
		for (WebElement option : options) {
			String optionIWantToSelect = "Virgin Islands, British";	///////////
			String optionText = option.getText();
			
			if(optionText.equals(optionIWantToSelect)) {
				sc.selectByVisibleText(optionIWantToSelect);
				System.out.println("Final option selected:  "+sc.getFirstSelectedOption().getText());
				break;
			}
			if (optionText.equals(selectedOptionText)) {
				ele.sendKeys(Keys.PAGE_DOWN);
				ele.click(); //click to select the option bcz we have to get the option
				selectedOptionText = getFirstSelectedOption();
				System.out.println(selectedOptionText);
				ele.click(); //after perform above click options get minimize to up options we have to perform one more click
			}
		}

		Thread.sleep(5000);
		driver.quit();
	}

	static String getFirstSelectedOption() {
		String selectedOptionText = sc.getFirstSelectedOption().getText();
		return selectedOptionText;
	}
}
