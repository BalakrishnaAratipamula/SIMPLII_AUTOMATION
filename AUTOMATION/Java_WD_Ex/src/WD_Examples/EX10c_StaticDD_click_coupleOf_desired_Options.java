package WD_Examples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EX10c_StaticDD_click_coupleOf_desired_Options {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://demo.guru99.com/test/newtours/");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("REGISTER")).click();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, 250)");    //horizantal, vertical
		
		Select select = new Select(driver.findElement(By.name("country")));

		List<WebElement> options = select.getOptions();
		
		for(WebElement option : options) {
			String optionText = option.getText();
			if (optionText.equals("AMERICAN SAMOA")||optionText.equals("BAHRAIN")||optionText.equals("CANADA")) {
				option.click();
				Thread.sleep(4000);
			}
		}
		
		driver.quit();
	}
}
