package Java_Examples;

import java.util.Arrays;
/*
Original array:
[1, 2, 3, 4, 5]

Right Rotation by 1 → [5, 1, 2, 3, 4]
Right Rotation by 2 → [4, 5, 1, 2, 3]
Right Rotation by 3 → [3, 4, 5, 1, 2]

 */
public class ArrayRotate_Right_by_3_positions {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		int k = 3; // rotate by 3
		int n = arr.length;

		// To handle k > n
		k = k % n;

		int[] rotated = new int[n];

		// Place elements in new positions
		for (int i = 0; i < n; i++) {
			rotated[(i + k) % n] = arr[i];
		}

		// Print rotated array
		System.out.println("Rotated Array: " + Arrays.toString(rotated));
	}
}
