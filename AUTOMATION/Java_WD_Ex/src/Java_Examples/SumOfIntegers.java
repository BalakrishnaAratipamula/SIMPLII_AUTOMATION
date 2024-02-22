package Java_Examples;

import java.util.stream.IntStream;

public class SumOfIntegers {
	public static void main(String[] args) {
		int num = 1346;
		IntStream stream = String.valueOf(num).chars();
		
		int sum = stream.map(Character::getNumericValue).sum();
		
		System.out.println(sum);
	}
}
