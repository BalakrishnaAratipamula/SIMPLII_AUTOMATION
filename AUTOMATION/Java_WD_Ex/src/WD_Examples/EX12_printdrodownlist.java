//write script to find number of options in "Year" dropdown and print those values in Console from FB-home page
package WD_Examples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class EX12_printdrodownlist {
	public static void main(String[] args) throws Exception {
		//to initialize browser
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://en-gb.facebook.com/");
		driver.manage().window().maximize();

		//to create reference object for "Sign Up" button
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[5]/a[1]")).click();
		Thread.sleep(1000);

		//to read selected value from "year" Dropdown (or) to configure Select class for "Year" Dropdown
		Select sc = new Select(driver.findElement(By.name("birthday_year"))); //name("birthday_year")----available on parent tag

		//to collection all the values from year Dropdown
		List<WebElement> options = sc.getOptions();

		//to print in console
		System.out.println("Number of options are: " +options.size());

		//To read each value from
		for(WebElement option: options) {
			System.out.println(option.getText());
		} 
		
		driver.quit();
	}
}