package PrivateConstructor;

//E1b Private constructor used in Utility Class

class MathUtils {
	private MathUtils() { // private constructor
        // Prevent object creation
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }
}

public class E1b_PrivateConstructor_usedIn_UtilityClasses {
	public static void main(String[] args) {
        int sum = MathUtils.add(5, 10);
        int product = MathUtils.multiply(5, 10);
        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);

        // MathUtils obj = new MathUtils(); // ❌ Compile-time error
    }
}

