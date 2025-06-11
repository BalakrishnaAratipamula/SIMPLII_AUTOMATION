package TestNG_ParallelExecutionWithDelays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//@If you want to run the test script in diff browser with time differences How to do that?
//M1: Sequentially (One After Another with Time Gap)(below Ex) Ref: Java_WD_Ex\src\WD_Examples\EX76_RunTestSCript_inDiffBrowser_withTimeDiff
//M2: ref: Java_WD_Ex\TestNG\TestNG_ParallelExecutionWithDelays (below Ex)
//M3: ref: Java_WD_Ex\TestNG\TestNG_ParallelExecutionWithDelays_usingXML
public class ParallelBrowserRunner {
	public static void main(String[] args) {
		new Thread(() -> {
			try {
				Thread.sleep(0);
			} 
			catch (InterruptedException ignored) {}
			runTest(new ChromeDriver());
		}).start();

		new Thread(() -> {
			try {
				Thread.sleep(5000);
			} 
			catch (InterruptedException ignored) {}
			runTest(new FirefoxDriver());
		}).start();
	}

	public static void runTest(WebDriver driver) {
		driver.get("https://google.com");
		// Add more test steps here
		driver.quit();
	}
}
