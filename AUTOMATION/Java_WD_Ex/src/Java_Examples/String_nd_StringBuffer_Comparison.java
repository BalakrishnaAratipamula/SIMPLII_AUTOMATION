package Java_Examples;

public class String_nd_StringBuffer_Comparison {
	public static void main(String[] args) {
		String str = "Hello";
		StringBuffer sb = new StringBuffer("Hello");

		//Improper comparison
		System.out.println(str.equals(sb)); // false
		System.out.println(sb.equals(str)); // false
		
		//Proper comparison
		System.out.println(str.equals(sb.toString())); // true
	}
}
