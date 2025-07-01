package Java_Examples;

import java.util.HashMap;
import java.util.Map;

//Java int coding qns : #35 java program to find and print the most frequently occurring prefix in a given array of strings
public class MostFrequentlyOccuringPrefix_inArray {
	public static String findMostFrequentPrefix(String[] words) {
		Map<String, Integer> prefixCount = new HashMap<>();

		for (String word : words) {
			for (int i = 1; i <= word.length(); i++) {
				String prefix = word.substring(0, i);
				prefixCount.put(prefix, prefixCount.getOrDefault(prefix, 0) + 1);
			}
		}

		String mostFrequentPrefix = "";
		int maxCount = 0;

		for (Map.Entry<String, Integer> entry : prefixCount.entrySet()) {
			if (entry.getValue() > maxCount) {
				mostFrequentPrefix = entry.getKey();
				maxCount = entry.getValue();
			} else if (entry.getValue() == maxCount) {
				// If tie, choose the shorter prefix or lexicographically smaller one
				if (entry.getKey().length() < mostFrequentPrefix.length()
						|| (entry.getKey().length() == mostFrequentPrefix.length()
								&& entry.getKey().compareTo(mostFrequentPrefix) < 0)) {
					mostFrequentPrefix = entry.getKey();
				}
			}
		}

		return mostFrequentPrefix;
	}

	public static void main(String[] args) {
		String[] words = { "apple", "app", "apex", "apply", "apricot" };
		String result = findMostFrequentPrefix(words);
		System.out.println("Most Frequently Occurring Prefix: " + result);
	}
}
