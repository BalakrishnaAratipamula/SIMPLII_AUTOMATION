package Java_Examples;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//Java int coding qns : #34 java program to find duplicate characters from a word without using loop
public class RemoveDuplicates_from_word_WO_using_forLoop {
	public static void main(String[] args) {
		String word = "programming";

		Map<Character, Long> duplicates = word.chars() // stream of int
				.mapToObj(c -> (char) c) // convert int to Character
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		duplicates.entrySet().stream().filter(entry -> entry.getValue() > 1)
				.forEach(entry -> System.out.println(entry.getKey() + " : " + entry.getValue()));
	}
}
