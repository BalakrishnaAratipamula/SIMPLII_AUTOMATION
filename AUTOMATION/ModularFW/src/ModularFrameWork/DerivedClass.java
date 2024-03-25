package ModularFrameWork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DerivedClass extends Parent2 {

	public static WebDriver driver;

	public void setUp() {
		// to Initialize browser
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com");
		driver.manage().window().maximize();
		System.out.println("Browser initialized");
	}

	public static void main(String[] args) throws Exception {
		DerivedClass dc = new DerivedClass();
		dc.setUp();
		dc.userReg(driver);// in sub method we asigned arguments so we have to add arguments while calling
		dc.userLogin(driver);
		dc.tearDown(driver);

	}
}