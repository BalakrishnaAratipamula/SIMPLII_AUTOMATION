package WD_Examples;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EX78_DDT_or_UseOf_ListAndMap_Together {
	public static void main(String[] args) {
		// Sample test data using List<Map<String, String>>
		List<Map<String, String>> loginData = new ArrayList<>();

		// First set of credentials
		Map<String, String> user1 = new HashMap<>();
		user1.put("username", "admin");
		user1.put("password", "admin123");
		loginData.add(user1);

		// Second set of credentials
		Map<String, String> user2 = new HashMap<>();
		user2.put("username", "user");
		user2.put("password", "user123");
		loginData.add(user2);

		// Launch browser
		WebDriver driver = new ChromeDriver();
		driver.get("https://example.com/login");

		for (Map<String, String> credentials : loginData) {
			// Clear fields before entering new data
			driver.findElement(By.id("username")).clear();
			driver.findElement(By.id("password")).clear();

			// Use values from map
			driver.findElement(By.id("username")).sendKeys(credentials.get("username"));
			driver.findElement(By.id("password")).sendKeys(credentials.get("password"));
			driver.findElement(By.id("loginButton")).click();

			// Add your assertion or verification here
			System.out.println("Tested with: " + credentials);

			// Navigate back to login page if needed
			driver.get("https://example.com/login");
		}

		driver.quit();
	}
}
