package WapperClass;

public class E2_UnBoxing_nd_AutoUnBoxing {
	public static void main(String[] args) {
		// Creating Wrapper objects
		Integer intObj = Integer.valueOf(50); //(or) Integer intObj = 50;
		Double doubleObj = Double.valueOf(15.5); //(or) Double doubleObj = 15.5;
		Boolean boolObj = Boolean.valueOf(true); //(or) Boolean boolObj = true;

		// Auto-Unboxing: Converting Wrapper Objects to Primitive types
		int intVal2 = intObj.intValue(); //Explicit-Unboxing 
		int intVal = intObj; // Auto-unboxing
		double doubleVal = doubleObj; // Auto-unboxing
		boolean boolVal = boolObj; // Auto-unboxing

		// Printing primitive values
		System.out.println("int value: " + intVal);
		System.out.println("int value: " + intVal2);
		System.out.println("double value: " + doubleVal);
		System.out.println("boolean value: " + boolVal);
	}
}
