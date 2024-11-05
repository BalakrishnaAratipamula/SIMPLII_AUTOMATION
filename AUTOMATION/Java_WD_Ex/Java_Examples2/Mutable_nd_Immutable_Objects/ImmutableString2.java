package Mutable_nd_Immutable_Objects;

public class ImmutableString2 {
	public static void main(String[] args) {
		String s1 = "WebDriver";
		String s2 = s1;
		
		System.out.println(s1 == s2); //true
		
		s1 = "Selenium";
		
		System.out.println(s1 == s2); //false
	}
}