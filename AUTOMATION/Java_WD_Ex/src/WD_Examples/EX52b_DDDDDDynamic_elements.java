package WD_Examples;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.WebElement;

public class EX52b_DDDDDDynamic_elements {
public static WebDriver driver;
	
	public static void fluentWaitForElements(WebElement eleXpath, int withTimeout,int pollingEvery) {
		Wait<WebDriver> wait=new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(withTimeout))
				.pollingEvery(Duration.ofSeconds(pollingEvery))
				.ignoring(NoSuchElementException.class, StaleElementReferenceException.class);
				wait.until(ExpectedConditions.visibilityOf(eleXpath));
		
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1600)", "");
		
		List<WebElement> listOfPageNums = driver.findElements(By.xpath("//*[@id='pagination']/li")); //common XPath for all pageNumbers
		System.out.println("listOfPageNums: "+listOfPageNums.size());
		
		for (int i =1; i <= listOfPageNums.size(); i++) {
			WebElement pageNum = driver.findElement(By.xpath("//*[@id='pagination']/li[" + i + "]")); //iteration all pageNumbers
			fluentWaitForElements(pageNum, 10, 5);
			pageNum.click(); //clicking pageNumbers
			
			List<WebElement> rowCount = driver.findElements(By.xpath("//*[@class='table-container']/table/tbody/tr")); //common XPath for all rows
			System.out.println("rowCount: "+rowCount.size());
			for (int j = 1; j <= rowCount.size() ; j++) { 
				String id = driver.findElement(By.xpath("//*[@class='table-container']/table/tbody/tr["+ j +"]/td[1]")).getText(); //iteration rows to retrive 'id'
				System.out.print(id + "  ");
				String name = driver.findElement(By.xpath("//*[@class='table-container']/table/tbody/tr["+ j +"]/td[2]")).getText(); //iteration rows to retrive 'name'
				System.out.print(name + "  ");
				String price = driver.findElement(By.xpath("//*[@class='table-container']/table/tbody/tr["+ j +"]/td[3]")).getText(); //iteration rows to retrive 'price'
				System.out.println(price);
				
				WebElement checkBox = driver.findElement(By.xpath("//*[@id='productTable']/tbody/tr["+ j +"]/td[4]/input")); //iterating checkboxes by row count
				checkBox.click(); //clicking checkboxes
				/*/ to click only 'odd' check boxes ---- for this comment above line 'checkBox.click();' 
				if(j%2!=0) { //id2
					checkBox.click();
				} //*/
				}
			}
//			Thread.sleep(2000);
		driver.quit();
	}
}
