package Java_Examples;

// Java program to merge two sorted arrays
public class Merge_two_SortedArrays {
	public static void main(String[] args) {
		int[] arr1 = { 1, 3, 5, 7 };
		int[] arr2 = { 2, 4, 6, 8, 10 };

		// Merge arrays
		int[] merged = mergeTwoSortedArrays(arr1, arr2);

		// Print merged array
		System.out.print("Merged Sorted Array: ");
		for (int num : merged) {
			System.out.print(num + " ");
		}
	}
	
	public static int[] mergeTwoSortedArrays(int[] arr1, int[] arr2) {
		int n1 = arr1.length;
		int n2 = arr2.length;
		int[] result = new int[n1 + n2];

		int i = 0, j = 0, k = 0;

		// Merge both arrays
		while (i < n1 && j < n2) {
			if (arr1[i] <= arr2[j]) {
				result[k++] = arr1[i++];
			} else {
				result[k++] = arr2[j++];
			}
		}

		// Copy remaining elements from arr1
		while (i < n1) {
			result[k++] = arr1[i++];
		}

		// Copy remaining elements from arr2
		while (j < n2) {
			result[k++] = arr2[j++];
		}

		return result;
	}

}
