package Java_Examples;

import java.util.Arrays;

public class AnegramRnot_Strings {
//An Anagram is if two strings are having exactly the same chars and however the order of chars are different
	
	/*/pre-req program
	public static void main(String[] args) {
		String str1 = "ab";
		String str2 = "abf";
		
		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();
		
		Arrays.sort(ch1);
		System.out.println(Arrays.toString(ch1));
		Arrays.sort(ch2);
		System.out.println(Arrays.toString(ch2));
		
		if(Arrays.equals(ch1, ch2)==true) {
			System.out.println("strings are equal");
		}else
		System.out.println("strings are not equal");
	} //*/
	
	
	
	//Java int coding qns : #14 Check Anegram
	//AnegramRnot_Strings
	public static void main(String[] args) {
		String str1 = "Army", str2 = "Mary"; //Brag, Grab

		// Converting both the string to lower case.
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();

		// Checking for the length of strings
		if (str1.length() != str2.length()) {
			System.out.println("Both the strings are not anagram");
		} else {
			// Converting both the arrays to character array
			char[] ch1 = str1.toCharArray();
			char[] ch2 = str2.toCharArray();

			// Sorting the arrays using in-built function sort()
			Arrays.sort(ch1); ////// Sorting is the process of putting the list or group of items in a specific order.
			Arrays.sort(ch2);

			// Comparing both the arrays using in-built function equals ()
			if (Arrays.equals(ch1, ch2) == true) {
				System.out.println("Both the strings are anagram");
			} else {
				System.out.println("Both the strings are not anagram");
			}
		}
	} // */

	
	/*/AnegramRnot_Strings
	public static void main(String[] args) {
		String string1 = "race";
		String string2 = "care";
		boolean isAnagram = false;

		if (string1.length() != string2.length()) {
			isAnagram = false;
		}
		else {
			char[] char1 = string1.toCharArray();
			char[] char2 = string2.toCharArray();

			Arrays.sort(char1);
			Arrays.sort(char2);

			for (int i=0; i<char1.length; i++) {
				if (char1[i] != char2[i]) {
					isAnagram = false;
					break;
				}
				isAnagram = true;
			}
		}

		if (isAnagram)
			System.out.println(string1 + " and " + string2 + " are Anagram");
		else
			System.out.println(string1 + " and " + string2 + " are Not Anagram");
	} // */
}
