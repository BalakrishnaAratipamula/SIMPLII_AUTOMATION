package Java_Examples;

import java.util.Arrays;

public class Check_two_arrays_have_same_num_of_values {
	/*/pre-req program
	public static void main(String[] args) {
		boolean result = true;
		if(result) {
			System.out.println("if - block"); //result = true then it will print
		}else {
			System.out.println("else - block"); //result = false then it will print
		}
	} */
	
	
	//Check_two_arrays_have_same_num_of_values		//https://rahulshettyacademy.com/blog/index.php/2021/11/04/sdet-interview-questions-part-5/
	public static void main(String args[]) {
		int[] array1 = { 1, 2, 3, 4 };
		int[] array2 = { 2, 1, 4, 3 };

		boolean result = false;

		if (array1.length != array2.length) {
			result = false;
		} else {
			Arrays.sort(array1);
			System.out.println(Arrays.toString(array1));
			Arrays.sort(array2);
			System.out.println(Arrays.toString(array2));

			for (int i=0; i<array1.length; i++) {
				if (array1[i] != array2[i]) {
					result = false;
					break;
				}
				result = true;
			}
		}
		if (result)
			System.out.println("Arrays are having - same values");
		else
			System.out.println("Arrays are having - not same values");
	} //*/
}
