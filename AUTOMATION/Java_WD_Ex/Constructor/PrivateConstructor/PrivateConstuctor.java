package PrivateConstructor;

public class PrivateConstuctor {
	int x;

    // private constructor
    private PrivateConstuctor() {
        x = 10;
        System.out.println("Private constructor called");
    }
    
	public static void main(String[] args) {
		PrivateConstuctor t = new PrivateConstuctor(); // allowed because main method is inside the same class
    }
}
