package DemoTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScript {
	public static void main(String[] args) throws InterruptedException {
		//to Initialize browser
		System.setProperty("webdriver.chrome.driver","E:\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://google.co.in");
		driver.manage().window().maximize();


		System.out.println("----DONE TestScript----");

		Thread.sleep(1000);
		driver.quit();

	}
}
