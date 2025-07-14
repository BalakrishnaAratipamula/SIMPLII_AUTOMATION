package Singleton_Class;

public class SingletonDemo1 {
	// Step 1: Private static instance
    private static SingletonDemo1 instance;
    
    // Step 2: Private constructor
    private SingletonDemo1() {
        System.out.println("Singleton instance created.");
    }
    
    // Step 3: Public method to get the instance
    public static SingletonDemo1 getInstance() {
        if (instance == null) {
            instance = new SingletonDemo1(); // create only once
        }
        return instance;
    }
    
    public static void main(String[] args) {
    	SingletonDemo1 obj1 = SingletonDemo1.getInstance();
    	SingletonDemo1 obj2 = SingletonDemo1.getInstance();

//    	System.out.println(obj1);
//    	System.out.println(obj2);
    	System.out.println(obj1 == obj2); // true – both point to the same object
    	
    }
}
