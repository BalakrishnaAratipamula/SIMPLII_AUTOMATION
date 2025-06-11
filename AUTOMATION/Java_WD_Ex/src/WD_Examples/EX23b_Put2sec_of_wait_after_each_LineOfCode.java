package WD_Examples;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

//@ How to put 2 sec of wait after each line of code without thread.sleep 
public class EX23b_Put2sec_of_wait_after_each_LineOfCode {
	public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        
        // Custom method to wait for 2 seconds
        waitForSeconds(driver, 2);

        driver.get("https://google.com");
        waitForSeconds(driver, 2);

        // Do other actions
        driver.quit();
    }
	
	//Custom wait method: Use WebDriverWait with a Dummy Condition
	public static void waitForSeconds(WebDriver driver, int sec) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(sec));
        wait.until(
        		webDriverDummyText -> true // Dummy condition
        );
        System.out.println("2sec wait");
    }
}
