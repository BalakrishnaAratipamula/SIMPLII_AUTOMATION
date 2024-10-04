package WD_Examples;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EX04b_CheckBox_inside_CheckBox {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.findElement(By.id("justAnInputBox")).click();
		Thread.sleep(1000);
		List<WebElement> checkboxes = driver.findElements(By.xpath("//ul/li/span[@class='comboTreeItemTitle']"));

		int i = 0;
		for (int j = 1; j < checkboxes.size(); j++) {
			String Allcheckboxes = checkboxes.get(i).getText();
			System.out.println(Allcheckboxes);
			if (Allcheckboxes.isEmpty())
				break;
			if (j%2 != 0) {
				checkboxes.get(i).click();
				Thread.sleep(300);
			}
			i++;
		}
		System.out.println("Total checkboxes : " + i);
		Thread.sleep(2000);

		driver.quit();
	}
}
