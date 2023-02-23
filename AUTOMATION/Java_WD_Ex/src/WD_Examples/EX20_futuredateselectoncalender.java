//Create ATS to select October 15th
package WD_Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EX20_futuredateselectoncalender {
	public static void main(String[] args) throws Exception {
		//To initialize browser
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.justdial.com/Travel/Train-Booking");
		driver.manage().window().maximize();

		//to click on Date field
		driver.findElement(By.id("departDate")).click();
		Thread.sleep(4000);

		//to read first month (confirm if first month is 'December')
		String firstMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		System.out.println(firstMonth);
		//to confirm if first month is 'November'
		if(firstMonth.equalsIgnoreCase("November")) {
			//to select 'October 15th date'
			driver.findElement(By.linkText("10")).click();
		}
		else {
			do {//we don't know how many times need to click [Next]  
				//to read second month name
				String secondMonth = driver.findElement(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-last']/div/div/span[1]")).getText();
				System.out.println(secondMonth);
				//to confirm if second month is 'November'
				if(secondMonth.equalsIgnoreCase("November")) {
					driver.findElement(By.xpath("//body[1]/div[2]/div[2]/table[1]/tbody[1]/tr[2]/td[4]/a[1]")).click(); //by inspecting 'Nov' 10th date
					break;						 
				}
				else {
					//to click on [Next]
					driver.findElement(By.xpath("//span[text()='Next']")).click();
					Thread.sleep(4000);
				}
			} while(true); //up to get 'December' 
		}
		Thread.sleep(2500);
		driver.quit();
	}
}