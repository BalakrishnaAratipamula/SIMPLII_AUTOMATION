package Java_Examples;

public class Swap_two_Strings {
	public static void main(String[] args) {
		// Take two string s1 and s2 which we need to swap.
		String s1 = "Selenium";
		String s2 = "WebDriver";
		String str;
		
		// Combine both the strings s1 and s2 using the concatenation(+) operator
		str = s1 + s2;

		// Use the substring method to get the subset of the combined string
		System.out.println(str.length());
		System.out.println(s2.length());
		
		s2 = str.substring(0, str.length() - s2.length()); 
		s1 = str.substring(s2.length());
		
		System.out.println("s1 = " + s1);
		System.out.println("s2 = " + s2);

	}
}
