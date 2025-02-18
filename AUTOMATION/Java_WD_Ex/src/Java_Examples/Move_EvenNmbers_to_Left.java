package Java_Examples;

import java.util.Arrays;

public class Move_EvenNmbers_to_Left {
	//Java int coding qns : #31 Java program to Move Even to Left
	public static void moveEvenToLeft(int[] arr) {
		int[] temp = new int[arr.length];
		int evenIndex = 0;
		int oddIndex = arr.length - 1;

		for (int num : arr) {
			if (num % 2 == 0) {
				temp[evenIndex++] = num; //i++ : use the current value of i and then increase that value of variable i by 1.
			} else {
				temp[oddIndex--] = num; //i-- : use the current value of i and then decrement that value of variable i by 1.
			}
		}

		System.arraycopy(temp, 0, arr, 0, temp.length); //System.arraycopy(source, 0, destination, 0, source.length);
	}

	public static void main(String[] args) {
		int[] arr = { 3, 1, 2, 4, 7, 6, 9, 8 };
		moveEvenToLeft(arr);
		System.out.println(Arrays.toString(arr));
	} //*/
	
	
	/*/
	public static void main(String[] args) {
		int[] source = {1, 2, 3, 4, 5};
		int[] destination = new int[5];

		System.arraycopy(source, 0, destination, 0, source.length);

		System.out.println(Arrays.toString(destination)); // Output: [1, 2, 3, 4, 5]
	} //*/
	

}
