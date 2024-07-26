package Java_Examples;

import java.util.HashMap;
import java.util.Map;

public class String_characters_count {
	public static void main(String[] args) {
		String inputString = "Selenium";

		Map<Character, Integer> hm = new HashMap<>();
		char[] strArray = inputString.toCharArray();

		for (char c : strArray) {
			if (hm.containsKey(c)) {
				hm.put(c, hm.get(c) + 1);
			}
			else {
				hm.put(c, 1);
			}
		}

		System.out.println(hm);
	}
}
