package PrimitiveDataTypes;

public class PrimitiveDataTypesEx {
	public static void main(String[] args) {
		//Hierarchy - boolean, char, byte, short, int, long, float, double
		
		// Integer Types
		byte myByte = 100; // stores 8-bit integer/signed integer (-128 to 127)
		short myShort = 32000; // 16-bit integer/signed integer (-32,768 to 32,767)
		int myInt = 2147483647; //10dig //32-bit integer/signed integer (-2^31 to 2^31-1)
		long myLong = 9223372036854775807L; //19L //64-bit integer/signed integer (-2^63 to 2^63-1)

		// Floating Point Types
		float myFloat = 3.14f; // 32-bit floating point number
		double myDouble = 3.141592653589793; //15dig // 64-bit floating point number //double d = double(f);

		// Character Type
		char myChar = 'A'; // 16-bit Unicode character

		// Boolean Type
		boolean myBoolean = true; // Can be true or false

		// Printing the values
		System.out.println("byte: " + myByte);
		System.out.println("short: " + myShort);
		System.out.println("int: " + myInt);
		System.out.println("long: " + myLong);
		System.out.println("float: " + myFloat);
		System.out.println("double: " + myDouble);
		System.out.println("char: " + myChar);
		System.out.println("boolean: " + myBoolean);
	}
}
