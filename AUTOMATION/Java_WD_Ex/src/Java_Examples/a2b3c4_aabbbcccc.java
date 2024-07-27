package Java_Examples;

public class a2b3c4_aabbbcccc {
	public static void main(String[] args) {
		String str = "a2b3c4d2";
		for (int i=0; i<str.length(); i++) {
			if (Character.isAlphabetic(str.charAt(i))) {
				System.out.print(str.charAt(i));
			} else {
				int a = Character.getNumericValue(str.charAt(i));
				for (int j=1; j<a; j++) {
					System.out.print(str.charAt(i-1));
				}
			}
		}
	}
}