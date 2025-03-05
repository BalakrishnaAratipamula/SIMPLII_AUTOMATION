package WD_Examples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class EX26b_Authentification_popup {
	public static void main(String[] args) {
		// To initialize browser
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("incognito");
		WebDriver driver= new ChromeDriver(ops);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		
//		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth"); //https://the-internet.herokuapp.com/basic_auth
		driver.get("https://the-internet.herokuapp.com/basic_auth");

	}
}
