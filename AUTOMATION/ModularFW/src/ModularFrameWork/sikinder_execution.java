package ModularFrameWork;

import org.openqa.selenium.chrome.ChromeDriver;

public class sikinder_execution extends sikinder_Login_page {
	public void setUp() {
		// to Initialize browser
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com");
		driver.manage().window().maximize();
		System.out.println("Browser initialized");
	}

	public static void main(String[] args) throws Exception {
		sikinder_execution inst = new sikinder_execution();
		inst.username(driver);
		inst.password(driver);
		inst.login(driver);
	}
}