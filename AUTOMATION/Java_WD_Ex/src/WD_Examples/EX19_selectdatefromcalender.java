//write script to select Sept 26th
package WD_Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EX19_selectdatefromcalender {
	public static void main(String[] args) throws Exception {
		// To initialize browser
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search"); // https://www.justdial.com/Travel/Train-Booking
		driver.manage().window().maximize();

		// to clickon Date field
		driver.findElement(By.xpath("//*[@id='jDate']/span/input")).click(); // id("departDate")
		Thread.sleep(3500);
		// to click on 28th
		driver.findElement(By.xpath("//td/a[text()='29']")).click(); //// body[1]/div[2]/div[2]/table[1]/tbody[1]/tr[4]/td[7]/a[1]

		Thread.sleep(3500);
		driver.quit();
	}
}