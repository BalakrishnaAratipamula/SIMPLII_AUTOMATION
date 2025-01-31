package Multiple_Inheritance;

//1. To use Reusable Utility Interfaces (so that provide different reusable methods across the framework)

interface WebDriverUtility {
    void takeScreenshot();
    void handleAlert();
}

interface JavaUtility {
    void generateRandomNumber();
    void getCurrentDate();
}

// Implementing multiple interfaces in the Base class
class BaseTest implements WebDriverUtility, JavaUtility {
    
    @Override
    public void takeScreenshot() {
        System.out.println("Screenshot taken");
    }

    @Override
    public void handleAlert() {
        System.out.println("Handling alert");
    }

    @Override
    public void generateRandomNumber() {
        System.out.println("Generated random number");
    }

    @Override
    public void getCurrentDate() {
        System.out.println("Current date fetched");
    }
}

public class MI_use_In_our_AutomationFW1 {
	public static void main(String[] args) {
		BaseTest test = new BaseTest();
        test.takeScreenshot();
        test.generateRandomNumber();
    }
}
