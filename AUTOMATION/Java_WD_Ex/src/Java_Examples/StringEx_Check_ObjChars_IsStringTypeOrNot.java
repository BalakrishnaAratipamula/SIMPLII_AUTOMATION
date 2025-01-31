package Java_Examples;

import java.util.Iterator;

public class StringEx_Check_ObjChars_IsStringTypeOrNot {
	public static void main(String[] args) {
		String str = "Balas";
		boolean result = true;

		for (int i = 0; i < str.length(); i++) {
			if (Character.isAlphabetic(str.charAt(i))) {
				System.out.println(str.charAt(i) + " is an Alphabet");
			} else {
				System.out.println(str.charAt(i) + " is not a Alphabet");
				result = false;
				break;
			}
		}
		if (!result) {
			System.out.println("String content having both digits and chars");
		} else {
			System.out.println("String content having only chars");
		}
	}
}
