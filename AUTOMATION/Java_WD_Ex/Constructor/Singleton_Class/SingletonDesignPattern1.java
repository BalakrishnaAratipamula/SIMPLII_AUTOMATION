package Singleton_Class;

class Singleton {
    private static Singleton instance;

    // Private constructor prevents object creation
    private Singleton() {}

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}

public class SingletonDesignPattern1 {
    public static void main(String[] args) {
    	Singleton obj1 = Singleton.getInstance();
    	Singleton obj2 = Singleton.getInstance();
    	
    	// obj1 and obj2 refer to the same object ****
	}
}
