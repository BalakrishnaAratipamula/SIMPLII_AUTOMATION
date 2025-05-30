package Mutable_nd_Immutable_Objects;

public class ImmutableString2 {
	public static void main(String[] args) {
		String s1 = "WebDriver";
		String s2 = s1;
		
		System.out.println(s2);
		System.out.println(s1 == s2); //true //'==' is used for both address and content comparison 
		s1 = "Selenium";
		
		System.out.println(s1 == s2); //false //equals() is used for only content comparison
	}
}