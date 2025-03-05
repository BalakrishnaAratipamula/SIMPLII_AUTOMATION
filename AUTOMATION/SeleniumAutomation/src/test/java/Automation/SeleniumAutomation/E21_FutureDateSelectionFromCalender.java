package Automation.SeleniumAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class E21_FutureDateSelectionFromCalender {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://book.spicejet.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); 
		
		//click on 'Depart Date'
		driver.findElement(By.cssSelector("#custom_date_picker_id_1")).click();
		driver.findElement(By.cssSelector("#custom_date_picker_id_1")).click(); //clicking 2 time bcz 1st clicking is disappearing 
		Thread.sleep(3000);
		
		String desiredMonthWantToSelect = "April";
		
		String firstMonth = driver.findElement(By.cssSelector(".ui-datepicker-month")).getText();
		
		//to confirm if first month is 'October' or not
		if(firstMonth.equalsIgnoreCase(desiredMonthWantToSelect)) {
			driver.findElement(By.linkText("22")).click();	
		}
		else {
			do {//actually we don't know how many times we need to click on 'Next'
				//to read the second month name
				String secondMonth = driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[2]/div/div/span[1]")).getText();
				if(secondMonth.equalsIgnoreCase(desiredMonthWantToSelect)) {
					driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[2]/table/tbody/tr[3]/td[6]/a")).click();		
					break;
				} else {
					//to click on [Next] button
					driver.findElement(By.xpath("//*[text()='Next']")).click();
					Thread.sleep(4000);
				}
			}while(true);
		}
		
		System.out.println("----Done----");
		Thread.sleep(5000);
		driver.quit();
	}
}














