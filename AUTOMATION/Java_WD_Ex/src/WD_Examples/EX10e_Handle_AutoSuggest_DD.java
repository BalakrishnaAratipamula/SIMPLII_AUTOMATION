package WD_Examples;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//How to handle auto-suggest dropdowns using selenium java
public class EX10e_Handle_AutoSuggest_DD {
	public static void main(String[] args) {
        // Setup WebDriver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");

        // Type in the search box
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("selenium");

        // Wait for suggestions to load
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        List<WebElement> suggestions = wait.until(
                ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//ul[@role='listbox']//li//div[@role='option']"))
        );

        System.out.println("Total suggestions: " + suggestions.size());

        // Iterate through suggestions and click the desired one
        for (WebElement suggestion : suggestions) {
            String text = suggestion.getText();
            System.out.println("Suggestion: " + text);
            if (text.equalsIgnoreCase("selenium webdriver")) {
                suggestion.click();
                break;
            }
        }
        
        // Optional: verify page title
        System.out.println("Page title after selection: " + driver.getTitle());

        driver.quit();
    }

}
