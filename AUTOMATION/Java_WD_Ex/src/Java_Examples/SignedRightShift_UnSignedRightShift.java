package Java_Examples;

public class SignedRightShift_UnSignedRightShift {
	public static void main(String[] args) {
		int signedNum = -8; // Binary: 11111111 11111111 11111111 11111000

		System.out.println(">> Result: " + (signedNum >> 2)); // Output: -2
		System.out.println(">>> Result: " + (signedNum >>> 2)); // Output: 1073741822
	}
}
