package Java_Examples;

public class length_of_string_without_using_length_mtd {
	static int i, c, res;

	static void length(String str) {
		try {
			for (i=0, c=0; 0<=i; i++, c++)
				str.charAt(i);
		}
		catch (StringIndexOutOfBoundsException e) {
			System.out.print("The length of the string \"" + str + "\" is " + c);
		}
	}

	public static void main(String args[]) {
		String string = "Selenium WebDriver";
		length(string);
	}
}
