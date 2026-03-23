package Java_Examples;

public class ImmutableClass {
	public static void main(String[] args) {
		String s = "Hello";
		s.concat(" World");
		System.out.println(s); //Hello //String is immutable — it does not change, instead it creates a new object.
	}
}
