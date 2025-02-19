package Java_Examples;

import java.util.Arrays;
import java.util.List;

//Java int coding qns : #32 java program to find max and min with IF, you can use collection
public class Max_Min_num_with_IF {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(12, 45, 7, 89, 23, 56, 3, 98);

		if (numbers.isEmpty()) {
			System.out.println("List is empty.");
			return;
		}

		int max = numbers.get(0);
		int min = numbers.get(0);
		
		for (int num : numbers) {
			if (num > max) {
				max = num;
			}
			if (num < min) {
				min = num;
			}
		}

		System.out.println("Maximum value: " + max);
		System.out.println("Minimum value: " + min);
	}
}
