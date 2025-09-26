package WD_Examples;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EX82_Submit_A_Form {
	public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("your-webpage-url"); // Replace with your actual webpage URL

        // Find the input fields using ID
        WebElement firstName = driver.findElement(By.id("FirstName"));
        WebElement dob = driver.findElement(By.id("DOB"));
        WebElement email = driver.findElement(By.id("Email"));
        WebElement inputNumber = driver.findElement(By.id("inputNumber"));
        WebElement maleRadioButton = driver.findElement(By.id("Male"));

        // Fill out the form
        firstName.sendKeys("Ram");
        dob.sendKeys("19-01-2001");
        email.sendKeys("ram@example.com");
        inputNumber.sendKeys("1234567890");
        maleRadioButton.click();

        // Click the submit button using CSS Selector
        driver.findElement(By.cssSelector("button[type='submit']")).click();

        // Switch to alert and get alert text
        Alert alert = driver.switchTo().alert();
        String alertText = alert.getText();

        // Check if the alert is open
        if (alertText != null) {
            System.out.println("Alert is open, and the content is: " + alertText);
            // Optionally accept the alert if needed
            // alert.accept();
        } else {
            System.out.println("No alert found.");
        }

        driver.quit();
    }
}
