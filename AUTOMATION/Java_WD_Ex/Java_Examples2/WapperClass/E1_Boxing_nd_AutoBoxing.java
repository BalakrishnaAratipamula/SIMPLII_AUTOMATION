package WapperClass;

public class E1_Boxing_nd_AutoBoxing {
	public static void main(String[] args) {
		// Explicit Boxing
		Integer intObj1 = Integer.valueOf(10); // Using valueOf() method
		Double doubleObj1 = Double.valueOf(15.5);

		// Auto-Boxing (Automatically done by Java)
		Integer intObj2 = 20; // int -> Integer
		Boolean boolObj = true; // boolean -> Boolean

		// Printing boxed values
		System.out.println("Explicit Boxing: " + intObj1 + ", " + doubleObj1);
		System.out.println("Auto-Boxing: " + intObj2 + ", " + boolObj);
	}
}
