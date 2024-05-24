package Java_Examples;

import java.util.Arrays;

public class sort_mtd {
	public static void main(String args[]) {
		int[] arr = { 5, -2, 23, 7, 87, -42, 509 };
		System.out.print("The original array is: ");
		for (int num : arr) {
			System.out.print(num + " ");
		}

		Arrays.sort(arr);

		System.out.print("\nThe sorted array is: ");
		for (int num : arr) {
			System.out.print(num + " ");
		}
	}

}
