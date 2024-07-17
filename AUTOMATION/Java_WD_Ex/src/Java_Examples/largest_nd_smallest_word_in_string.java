package Java_Examples;

import java.util.Arrays;

public class largest_nd_smallest_word_in_string {
	/*/pre-req program
	public static void main(String[] args) {
		String s1="Java is Robust";
		
		String word = s1.replaceAll("\\s", ""); //\\s - single white space
		
		System.out.println(word);
	} //*/
	
	/*/pre-req program
	public static void main(String[] args) {
		String string = " Selenium is a suite  of tools ";

		String words = string.trim(); //trim() - to trim trailing and preceding spaces
		System.out.println(words);
		String words2 = words.replaceAll("\\s", " "); //\\s - single white space
							//replaceAll("\\s", " ") - nothing is doing replacing single white space to single space
		System.out.println(words2);
		String[] words3 = words2.split(" ");
		System.out.println(Arrays.toString(words3));
	} //*/
	
	
	//largest_nd_smallest_word_in_string
	public static void main(String[] args) {

		String string = "Selenium is a suite of tools";

		String[] words = string.trim().replaceAll("\\s+", " ").split(" ");
		System.out.println(Arrays.toString(words));
		String shortest = words[0];
		System.out.println(shortest);
		String longest = words[0];
		System.out.println(longest);

		for (String word : words) {
			if (word.length() < shortest.length()) {
				shortest = word;
			}
			if (word.length() > longest.length()) {
				longest = word;
			}
		}

		System.out.println("The Shortest Word = " +shortest);
		System.out.println("The Longest Word = " +longest);
	} //*/
}
