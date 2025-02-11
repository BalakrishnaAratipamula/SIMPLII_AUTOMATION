package Types_Of_Inheritance;

//interface
interface WebDriverUtility{
	void takeScreenshot();
	void handleAlert();
}

//interface 
interface JavaUtility{
	void generateRandomNumber();
	void getCurrentDate();
}

//class
class BaseTest implements WebDriverUtility, JavaUtility{

	@Override
	public void generateRandomNumber() {
		System.out.println("generateRandomNumber() method is calling");
	}

	@Override
	public void getCurrentDate() {
		System.out.println("getCurrentDate() method is calling");
	}

	@Override
	public void takeScreenshot() {
		System.out.println("takeScreenshot() method is calling");
	}

	@Override
	public void handleAlert() {
		System.out.println("handleAlert() method is calling");
	}
	
}

//main
public class E8_Multiple_Inheritance {
	public static void main(String[] args) {
		BaseTest test = new BaseTest();
		test.generateRandomNumber();
		test.handleAlert();
	}
}
