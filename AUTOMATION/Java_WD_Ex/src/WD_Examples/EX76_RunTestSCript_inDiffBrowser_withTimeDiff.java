package WD_Examples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

// @If you want to run the test script in diff browser with time differences How to do that?
//M1: Sequentially (One After Another with Time Gap)(below Ex) Ref: Java_WD_Ex\src\WD_Examples\EX76_RunTestSCript_inDiffBrowser_withTimeDiff
//M2: ref: Java_WD_Ex\TestNG\TestNG_ParallelExecutionWithDelays
//M3: ref: Java_WD_Ex\TestNG\TestNG_ParallelExecutionWithDelays_usingXML
public class EX76_RunTestSCript_inDiffBrowser_withTimeDiff {
	public static void main(String[] args) throws InterruptedException {
        runTest(new ChromeDriver());
        Thread.sleep(5000); // Wait for 5 seconds before next browser

        runTest(new FirefoxDriver());
        Thread.sleep(10000); // Wait for 10 seconds before next browser
    }

    public static void runTest(WebDriver driver) {
        driver.get("https://google.com");
        // Add more test steps here
        driver.quit();
    }
}
