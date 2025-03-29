package TakingScreenshotOnlyForFailedTestCases_UsingTestNG;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class S1_ScreenshotUtility {
	public static void captureScreenshot(WebDriver driver, String testName) {
        File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File destFile = new File("./Screenshots/" + testName + ".png");
        try {
            FileHandler.copy(srcFile, destFile);
            System.out.println("Screenshot taken: " + destFile.getAbsolutePath()); //getAbsolutePath() will get the path from root
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
