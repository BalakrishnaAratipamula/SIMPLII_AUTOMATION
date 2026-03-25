package PrivateConstructor;

class Singleton { //below 3 points are the properties of Singleton Pattern
    
	private static Singleton instance; //2. private static instance variable

    private Singleton() { // 1. private constructor
        System.out.println("Singleton instance created!");
    }

    public static Singleton getInstance() { //3. public static method
        if (instance == null) {
            instance = new Singleton(); // Allowed inside the class
        }
        return instance;
    }
}

public class E1b_PrivateConstructor_usedIn_SingletonPattern {
	public static void main(String[] args) {
		// Get two references
		Singleton s1 = Singleton.getInstance(); // Creates instance
        Singleton s2 = Singleton.getInstance(); // Returns same instance

        System.out.println(s1);
        System.out.println(s2);
        
		// Check if both references are same
		if (s1 == s2) {
			System.out.println("Both references point to the same instance (Singleton works!)");
		} else {
			System.out.println("Different instances (Singleton failed!)");
		}
	}
}
