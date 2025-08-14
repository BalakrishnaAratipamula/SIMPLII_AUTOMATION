package WD_Examples;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EX80_RegExpression_or_regex {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		WebElement priceElement = driver.findElement(By.id("price"));
		String priceText = priceElement.getText(); // e.g. "$123.45"

		// Regex to check price format: $ followed by digits, optional decimal
		Pattern pattern = Pattern.compile("^\\$\\d+(\\.\\d{2})?$");
		Matcher matcher = pattern.matcher(priceText);

		if (matcher.matches()) {
		    System.out.println("Price format is correct");
		} else {
		    System.out.println("Invalid price format");
		}
	}
}
