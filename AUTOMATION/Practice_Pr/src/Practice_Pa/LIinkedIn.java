package Practice_Pa;

	import java.util.List;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class LIinkedIn {
	public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver", "F:\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	String baseurl="https://www.linkedin.com/login?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin";
	driver.get(baseurl);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
	driver.findElement(By.id("username")).sendKeys("natasha@frugaltesting.com");
	driver.findElement(By.id("password")).sendKeys("Frugal@123");
	WebElement login=driver.findElement(By.xpath("//*[@type='submit']"));
	login.click();
	WebElement network=driver.findElement(By.xpath("//*[@data-link-to='mynetwork']"));
	network.click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("/html[1]/body[1]/div[6]/div[4]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/div[1]/button[1]/span[1]")).click();
	Thread.sleep(4000);
	WebElement refobj = driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[1]/div[2]/ul[1]/li[5]/div[1]/section[1]/div[2]/footer[1]/button[1]/span[1]"));
	refobj.click();
	/*List <WebElement> cnct = driver.findElements(By.xpath("//span[contains(text(),'Connect')]"));
	System.out.println("Total links are:  "+cnct.size());
	for(WebElement type:cnct) {
		System.out.println(type.getText());
	}
	//driver.findElement(By.xpath("//*[@class='artdeco-button__text']")).click();*/

	}
	

}
