package PrivateConstructor;

class Example {
    private Example() {
        System.out.println("Private constructor called");
    }

    private static Example instance; // singleton reference

    public static Example getInstance() {
        if(instance == null) {
            instance = new Example(); // Allowed inside class
        }
        return instance;
    }
}

public class E1_PrivateConstructor_isNot_allowedTo_CallFromOutSideOfTheClass {
	public static void main(String[] args) {
//		Example obj = new Example(); // ❌ Compile-time error //Cannot create object outside class
	}
}
