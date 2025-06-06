package OptionalClass;

import java.util.Optional;

public class E1b_WithOptionalClass {
	/*/
	public static void main(String[] args) {
		String[] words = new String[10];

		Optional<String> checkNull = Optional.ofNullable(words[5]);

		if (checkNull.isPresent()) {
			String word = words[5].toLowerCase();
			System.out.print(word);
		} else
			System.out.println("word is null");
	} //*/
	
	
	/*/
	public static void main(String[] args) {

		// creating a string array
		String[] str = new String[5];

		// Setting value for 2nd index
		str[2] = "Geeks Classes are coming soon";

		// It returns an empty instance of Optional class
		Optional<String> empty = Optional.empty();
		System.out.println(empty);

		// It returns a non-empty Optional
		Optional<String> value = Optional.of(str[2]);
		System.out.println(value);
	} //*/
	
	
	public static void main(String[] args) {

		// creating a string array
		String[] str = new String[5];

		// Setting value for 2nd index
		str[2] = "Geeks Classes are coming soon";

		// It returns a non-empty Optional
		Optional<String> value = Optional.of(str[2]);

		// It returns value of an Optional. If value is not present, it throws an NoSuchElementException
		System.out.println(value.get());

		// It returns hashCode of the value
		System.out.println(value.hashCode());

		// It returns true if value is present, otherwise false
		System.out.println(value.isPresent());
	}
	
}
