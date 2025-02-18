package Java_Examples;

import java.util.Arrays;

//Java int coding qns : #29 Java program to move all zeros to left
public class MoveAllZerosToLeft {
	//
	public static void moveZerosToLeft(int[] arr) {
		if (arr == null || arr.length == 0) {
			return; 
		}

		System.out.println("Array length:  "+arr.length);
		int nonZeroIndex = arr.length - 1;
		System.out.println(nonZeroIndex);
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.println("arr[i]"+arr[i]);
			if (arr[i] != 0) {
				arr[nonZeroIndex] = arr[i];
				nonZeroIndex--; //nonZeroIndex=nonZeroIndex-1; //i--
			}
		}

		while (nonZeroIndex >= 0) {
			arr[nonZeroIndex] = 0;
			nonZeroIndex--;
		}
	}

	public static void main(String[] args) {
		int[] arr = { 0, 1, 2, 0, 3, 0 };
		moveZerosToLeft(arr);
		System.out.println(Arrays.toString(arr));
	} //*/
	

	/*/
	public static void main(String[] args) {
		int i = 5;
		for(int j=5; j>=0; j--) {
			System.out.println(j);
			i--;
		}
	} //*/
}
