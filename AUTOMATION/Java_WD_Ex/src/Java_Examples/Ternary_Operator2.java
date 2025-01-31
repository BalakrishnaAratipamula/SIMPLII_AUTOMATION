package Java_Examples;

public class Ternary_Operator2 {
	//Java Program to Check Alphabet using ternary operator
	public static void main(String[] args) {
		char c = '1';

		String output = (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') 
				? c + " is an alphabet."
				: c + " is not an alphabet.";

		System.out.println(output);
	}
}
