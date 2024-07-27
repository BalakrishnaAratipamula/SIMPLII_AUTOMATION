package Java_Examples;

import java.util.HashMap;

public class String_FirstNonRepeatingCharacter {
	public static char firstNonRepeat(String str) {

		HashMap<Character, Integer> char_count = new HashMap<>();

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (char_count.containsKey(c)) {
				char_count.put(c, char_count.get(c) + 1);
			} else {
				char_count.put(c, 1);
			}
		}

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (char_count.get(c) == 1)
				return c;

		}
		return '_';
	}

	public static void main(String[] args) {
		System.out.println(firstNonRepeat("GeeksForGeeks"));

	}
}
