package Automation.SeleniumAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class E11_getFirstSelectedOption_ {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/r.php?entry_point=login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		Select sc = new Select(driver.findElement(By.xpath("//select[@name='birthday_month']")));
		String defaultOptionShowing = sc.getFirstSelectedOption().getText(); //to get the default option
		System.out.println("Default option:  "+defaultOptionShowing);
		
		//to verify 'Aug' is select or not
		String optionToSelect = "Aug";
		if(defaultOptionShowing.equals(optionToSelect)) {
			System.out.println(optionToSelect+" month is already selected");
		} else {
			sc.selectByValue("8"); //optionToSelect value
			System.out.println(optionToSelect+" month get selected");
			Thread.sleep(2000);
		}
		
		Thread.sleep(3000);
		driver.quit();
	}
}
