package Practice;

public class E5_PrimitiveDatatypes {
	public static void main(String[] args) {
		// Hierarchy - boolean, char, byte, short, int long, float, double

		// Integer Types
		byte myByte = 100; //it will store 8-bit signed integer (-128 to 128)
		short myShort = 32000; //it will store 16-bit signed integer (-32768 to 32768)
		int myInt = 2147483647; //it will store 32-bit signed integer (-2^31 to 2^31-1)
		long myLong = 9223372567546518L; //it will store 64-bit signed integer (-2^63 to 2^63-1)
		
		// Floating Types
		float myFloat = 3.14f;    //32-bit floating point number
		double myDouble = 3.123456781234567; //64-bit floating numbers
		
		// Character Types
		char myChar = 'A'; //we can represents only single character
		// Boolean Type
		boolean myBoolean = false; //we can represents only 'true' or 'false' values 
		
		System.out.println(myByte);
		System.out.println(myShort);
		System.out.println(myInt);
		System.out.println(myLong);
		System.out.println(myFloat);
		System.out.println(myDouble);
		System.out.println(myChar);
		System.out.println(myBoolean);

	}
}
