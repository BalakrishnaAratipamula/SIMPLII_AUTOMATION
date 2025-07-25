package Java_Examples;

public class BinarySearchImplementation2_SearchTargetValue_inGivenSortedArray {
	// Binary Search Method (Iterative)
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

		return -1; // target not found
	}

	public static void main(String[] args) {
		int[] sortedArray = { 2, 4, 6, 8, 10, 12, 14, 16 };
		int target = 10;

		int result = binarySearch(sortedArray, target);

		if (result != -1) {
			System.out.println("Target " + target + " found at index: " + result);
		} else {
			System.out.println("Target " + target + " not found in the array.");
		}
	}
}
