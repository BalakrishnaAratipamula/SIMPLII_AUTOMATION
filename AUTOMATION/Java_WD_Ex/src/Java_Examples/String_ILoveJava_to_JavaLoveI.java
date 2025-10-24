package Java_Examples;

public class String_ILoveJava_to_JavaLoveI {
	public static void main(String[] args) {
		String a = "I Love Java Rev";

		// Split the string into words
		String[] words = a.split(" ");

		// Reverse the order of words
		StringBuilder reversed = new StringBuilder();
		for (int i = words.length - 1; i >= 0; i--) {
			reversed.append(words[i]);
			if (i != 0) {
				reversed.append(" ");
			}
		}

		// Print the result
		System.out.println(reversed.toString());
	}
}
