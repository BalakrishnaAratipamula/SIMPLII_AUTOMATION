package Java_Examples;

public class CraeteStringObject_WithNew_nd_WithoutNew_kw {
	/*/1️. String s = "Hello";
	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "Hello";

		System.out.println(s1 == s2); // true (same reference) 
	} //*/
	
	//String s = new String("Hello");
	public static void main(String[] args) {
		String s1 = new String("Hello");
		String s2 = new String("Hello");
		
		System.out.println(s1 == s2); // false (different objects)
	}
}
