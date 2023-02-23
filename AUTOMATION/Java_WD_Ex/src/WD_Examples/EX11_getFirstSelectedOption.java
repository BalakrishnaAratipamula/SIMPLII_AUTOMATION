//create script to Select "Sept" in Month static dropdown in FB homepage, if already selected month is not the "Sept"
package WD_Examples;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class EX11_getFirstSelectedOption {
	public static void main(String[] args) throws Exception {
		//to initialize browser
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://en-gb.facebook.com/");
		driver.manage().window().maximize();

		//to create reference object for "Sign Up" button
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[5]/a[1]")).click();
		Thread.sleep(1000);

		//to read selected value from "Month" dropdown
		Select sc = new Select(driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[5]/div[2]/span[1]/span[1]/select[2]")));

		String option = sc.getFirstSelectedOption().getText();//one value only so use String
		System.out.println("Exixting value in month textbox is:  " +option);

		//to is verify "Jul" select or not
		if(option.equals("Aug")) {
			System.out.println("Aug month is alredy selected");
		}
		else {
			Thread.sleep(1000);
			//to select "Aug"
			sc.selectByValue("8");
			System.out.println("WD selected require month");
			Thread.sleep(2000);
		} 
		
		driver.quit();
	}	
}
