package WD_Examples;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EX23b_ImplementReusableWaits_inFW {
	WebDriver driver;
	
	public EX23b_ImplementReusableWaits_inFW(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement waitForElement(By locator, int timeoutInSeconds) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
}
