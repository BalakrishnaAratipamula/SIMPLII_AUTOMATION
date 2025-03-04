//Create ATS to select October 15th
package WD_Examples;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EX20_futuredateselectoncalender {
	public static void main(String[] args) throws Exception {
		//To initialize browser
		WebDriver driver=new ChromeDriver();
		driver.get("https://book.spicejet.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//to click on Date field
		driver.findElement(By.xpath("//*[@id='custom_date_picker_id_1']")).click(); //id("departDate")
		//disappearing by one time clicking so clicking one more time
		driver.findElement(By.cssSelector("#custom_date_picker_id_1")).click(); 
		Thread.sleep(4000);
		 
		//to read first month (confirm if first month is 'December')
		String firstMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		System.out.println(firstMonth);
		//to confirm if first month is 'November'
		if(firstMonth.equalsIgnoreCase("October")) { //November
			//to select 'October 15th date'
			driver.findElement(By.linkText("20")).click();
		} 
		else {
			do {//we don't know how many times need to click [Next]  
				//to read second month name
				String secondMonth = driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[2]/div/div/span[1]")).getText();
				System.out.println(secondMonth);
				//to confirm if second month is 'November'
				if(secondMonth.equalsIgnoreCase("October")) {
					driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[2]/table/tbody/tr[3]/td[6]/a")).click(); //by inspecting 'Nov' 18th date
					break; 
				}
				else {
					//to click on [Next]
					driver.findElement(By.xpath("//span[text()='Next']")).click();
					Thread.sleep(4000);
				}
			} while(true); //iterate loop till condition is true.
		} 
		Thread.sleep(2500);
		driver.quit();
	}
}