package WapperClass;

public class E7_WrapperClass {
	public static void main(String[] args) {
		int num = 100;

		// Convert primitive to wrapper object
		Integer obj = Integer.valueOf(num);

		// Auto-boxing (automatic conversion)
		Integer obj2 = num;

		// Unboxing (object → primitive)
		int n = obj.intValue();
		int n2 = obj2; // automatic unboxing
		
		System.out.println("n value:  "+n+"\t"+"n2 value:  "+n2);
	}
}
