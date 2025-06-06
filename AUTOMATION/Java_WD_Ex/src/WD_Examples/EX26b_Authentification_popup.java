package WD_Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class EX26b_Authentification_popup {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		String userName = "admin";
		String password = "admin";
		driver.manage().window().maximize();
//			driver.get("https://the-internet.herokuapp.com/basic_auth");
		driver.get("https://" + userName + ":" + password + "@" + "the-internet.herokuapp.com/basic_auth");

		String actualText = driver.findElement(By.xpath("//div[@class='example']/p")).getText();
		System.out.println(actualText);

		if (actualText.trim().contains("Congratulations! You must have the proper credentials.")) {
			System.out.println("Authentication popup get handled");
		}

		Thread.sleep(8000);
		driver.quit();
	}
}
