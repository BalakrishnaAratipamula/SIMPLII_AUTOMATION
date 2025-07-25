package Java_Examples;

import java.util.Scanner;

public class BinarySearchImplementation {
	// Method to perform binary search
	public static int binarySearch(int[] arr, int target) {
		int left = 0;
		int right = arr.length - 1;

		while (left <= right) {
			int mid = left + (right - left) / 2; // avoid overflow

			if (arr[mid] == target) {
				return mid; // target found
			} else if (arr[mid] < target) {
				left = mid + 1; // search in right half
			} else {
				right = mid - 1; // search in left half
			}
		}
		return -1; // not found
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Sorted array
		int[] arr = { 2, 4, 6, 8, 10, 12, 14 };

		System.out.print("Enter the number to search: ");
		int target = sc.nextInt();

		int result = binarySearch(arr, target);

		if (result == -1) {
			System.out.println("Element not found in array.");
		} else {
			System.out.println("Element found at index: " + result);
		}

		sc.close();
	}

}
