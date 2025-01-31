package Java_Examples;

public class String_to_Int_conv_nd_checkResultIsIntOrNot {
	public static void main(String args[]) {
		String str = "200";
		int i = Integer.parseInt(str);

		System.out.println(i);

		// Checking whether 'i' is integer or not
		String input = String.valueOf(i);
		boolean result = true;
		for (int a = 0; a < input.length(); a++) {
			if (a == 0 && input.charAt(a) == '-')
				continue;
			if (!Character.isDigit(input.charAt(a)))
				result = false;
		}
		if (result) {
			System.out.println("i value " + i + " is valid integer");
		}
	}
}
