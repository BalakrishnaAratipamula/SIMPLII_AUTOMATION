package Java_Examples;

import java.util.HashMap;
import java.util.Set;

public class String_Duplicate_Chars {
	public static void main(String[] args) {
		String inputString = "Selenium WebDriver";
		
		HashMap<Character, Integer> hm = new HashMap<>();
		char[] strArray = inputString.toCharArray();

		for (char c : strArray) {
			if (hm.containsKey(c)) {
				hm.put(c, hm.get(c) + 1);
			}
			else {
				hm.put(c, 1);
			}
		}
		
		// Store the key values in a set and then get the number of each duplicate character.
		Set<Character> keys = hm.keySet();
		for (char c : keys) {
			if (hm.get(c) > 1) {
				System.out.println(c + "-->" + hm.get(c));
			}
		}
	}
}
