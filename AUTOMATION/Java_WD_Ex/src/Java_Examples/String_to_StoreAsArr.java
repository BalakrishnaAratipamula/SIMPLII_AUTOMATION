package Java_Examples;

public class String_to_StoreAsArr {
	public static void main(String[] args) {
		String a = "abc-2019";

		// Split the string by '-'
		String[] parts = a.split("-");

		// Print the output in the desired format
		for (String part : parts) {
			System.out.print("[" + part + "] ");
		}
	}
}
