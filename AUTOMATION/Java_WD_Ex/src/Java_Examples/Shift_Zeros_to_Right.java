package Java_Examples;

import java.util.Arrays;

public class Shift_Zeros_to_Right {
	public static int[] shiftAllZerosRight(int[] arr) {
		if (arr.length == 1) {
			return arr;
		}

		int[] newArray = new int[arr.length];

		int count = 0;
		for (int number : arr) {
			if (number != 0) {
				newArray[count] = number;
				count++;
			}
		}
		return newArray;
	}

	public static void main(String[] args) {

		int[] inputArray = { 1, 0, 2, 0, 3, 0, 0, 0 };

		System.out.println(Arrays.toString(shiftAllZerosRight(inputArray)));

	}
}
