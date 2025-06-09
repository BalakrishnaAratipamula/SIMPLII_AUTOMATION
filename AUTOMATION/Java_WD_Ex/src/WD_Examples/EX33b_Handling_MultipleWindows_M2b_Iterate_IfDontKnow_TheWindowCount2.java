package WD_Examples;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//@  There are 10 pages in same window; an image is present in any page out of ten pages in same window. How will you validate this scenario?
public class EX33b_Handling_MultipleWindows_M2b_Iterate_IfDontKnow_TheWindowCount2 {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com/2017/07/multiple-window-examples.html");
		driver.manage().window().maximize();

		String parent = driver.getWindowHandle(); // parent
		System.out.println("parent window id is:  " + parent);
		System.out.println("parent window Page title is:  " + driver.getTitle());

		// to click on "Click this link to start new Tab"
		driver.findElement(By.linkText("Click this link to start new Tab")).click();
		Thread.sleep(2000);
		// It will return the parent window name as a String
		String parentWinID = driver.getWindowHandle();
		System.out.println("Parent Win ID is: " + parentWinID);
		// It returns no. of windows opened by WebDriver and will return Set of Strings
		Set<String> allWinID = driver.getWindowHandles();
		System.out.println("Total Window size:" + allWinID.size());
		System.out.println("All win IDs are:");
		for (String allIDs : allWinID) {
			System.out.println(allIDs);
		}
		// Using Iterator to iterate with in windows
		Iterator<String> itr = allWinID.iterator();
		while (itr.hasNext()) {
			String childWinID = itr.next();
			// Compare whether the main window is not equal to child window. If not equal, we will close child windows.
			if (!parentWinID.equalsIgnoreCase(childWinID)) {
				driver.switchTo().window(childWinID);

				try {
					// Verify this image present on LNT window
					WebElement hsbcImg = driver.findElement(By.xpath("/html/body/a/img[@alt='LnT']"));

					if (hsbcImg.isDisplayed()) {
						System.out.println("LnT img present: " + hsbcImg.isDisplayed());
					}
				} catch (Exception e) {
					e.printStackTrace();
				}

				System.out.println("Child URL is:" + driver.getCurrentUrl());
				System.out.println("Child Win Title is:" + driver.getTitle());
				Thread.sleep(2000);
				driver.close();

			}
		}
		// This is to switch to the main window
		driver.switchTo().window(parentWinID);
		driver.quit();

	}
}
