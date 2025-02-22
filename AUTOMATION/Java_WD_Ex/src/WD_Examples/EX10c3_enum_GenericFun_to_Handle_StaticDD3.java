package WD_Examples;
//read enum 'EX10c3_enum_GenericFun_to_Handle_StaticDD3'
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

enum Handle_StaticDD3 {
	Index{
		public String toString() {
			return "index";
		}
	},
	Value{
		public String toString() {
			return "value";
		}
	},
	VisibleText{
		public String toString() {
			return "visibletext";
		}
	}
}

public class EX10c3_enum_GenericFun_to_Handle_StaticDD3 {
	public static WebDriver driver;

	public static void main(String[] args) throws Exception {
		driver = new ChromeDriver();
		driver.navigate().to("http://demo.guru99.com/test/newtours/");
		driver.manage().window().maximize();

		driver.findElement(By.linkText("REGISTER")).click();
		Thread.sleep(800);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 250)"); // horizantal, vertical
		Thread.sleep(800);

		driver.findElement(By.name("country")).click();
		Thread.sleep(800);
		
		//////Generic function to handle Static Drop down
//		dropdownValue(By.name("country"), Handle_StaticDD3.Index.toString(), "4");
//		dropdownValue(By.name("country"), Handle_StaticDD3.Value.toString(), "ANTIGUA AND BARBUDA");
		dropdownValue(By.name("country"), Handle_StaticDD3.VisibleText.toString(), "CAYMAN ISLANDS");

		Thread.sleep(5000);

		driver.quit();
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static void dropdownValue(By locator, String type, String value) {
		Select select = new Select(getElement(locator));

		switch (type) {
		case "index":
			select.selectByIndex(Integer.parseInt(value));
			break;
		case "value":
			select.selectByValue(value);
			break;
		case "visibletext":
			select.selectByVisibleText(value);
			break;
		default:
			System.out.println("please pass the selection criteria...");
			break;
		}
	}

}
