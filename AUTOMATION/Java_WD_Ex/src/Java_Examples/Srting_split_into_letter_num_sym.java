package Java_Examples;

import java.util.Scanner;

public class Srting_split_into_letter_num_sym {

	public static void Separate(String str) {
		String number = "";
		String letter = "";
		String symbol = "";
		for(int i=0; i<str.length(); i++) {
			char a = str.charAt(i);
			if (Character.isDigit(a)) {
				number = number + a;
			} 
			else if(Character.isLetter(a)) {
				letter = letter + a;
			} 
			else {
				symbol = symbol + a;
			}
		}
		System.out.println("Alphabets in string: "+letter);
		System.out.println("Numbers in String: "+number);
		System.out.println("Symbols in String: "+symbol);   
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Variable:");
		String variable = sc.next();
		Separate(variable);
	}
}
