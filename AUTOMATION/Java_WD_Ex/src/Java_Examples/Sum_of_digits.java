package Java_Examples;

import java.util.stream.IntStream;

public class Sum_of_digits {
	//
	public static void main(String[] args) {
		int num = 121;
		int sum = 0;

		while (num != 0) {
			int n = num % 10; 
			sum = sum + n;
			num = num / 10;
		}
		System.out.println(sum);
	} // */

	/*/
	public static void main(String[] args) {
		int num = 1346;
		IntStream stream = String.valueOf(num).chars();
		
		int sum = stream.map(Character::getNumericValue).sum();
		
		System.out.println(sum);
	} //*/
}
