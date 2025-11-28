package Java_Examples;

import java.util.HashMap;
import java.util.Map;

//Java int coding qns : #36 java program to check givrn characters can form a palindrome
public class Check_GivenCharacters_can_form_a_Palindrome {
	public static boolean canFormPalindrome(String str) {
		// Remove spaces and convert to lowercase for uniformity
		str = str.replaceAll("\\s+", "").toLowerCase();

		// Count character frequencies
		Map<Character, Integer> freqMap = new HashMap<>();
		for (char c : str.toCharArray()) {
			freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
		}

		// Count odd occurrences
		int oddCount = 0;
		for (int count : freqMap.values()) {
			if (count % 2 != 0) {
				oddCount++;
			}
		}

		// Palindrome possible if oddCount <= 1
		return oddCount <= 1;
	}

	public static void main(String[] args) {
		String input1 = "civic"; // already a palindrome
		String input2 = "ivicc"; // can be rearranged to "civic"
		String input3 = "hello"; // cannot form palindrome

		System.out.println(input1 + " → " + canFormPalindrome(input1));
		System.out.println(input2 + " → " + canFormPalindrome(input2));
		System.out.println(input3 + " → " + canFormPalindrome(input3));
	}
}
