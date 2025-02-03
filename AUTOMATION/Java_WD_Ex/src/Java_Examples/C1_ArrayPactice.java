package Java_Examples;

import java.util.Arrays;
import java.util.Scanner;

public class C1_ArrayPactice {
	/*/Ex1
	public static void main(String[] args) {

		int[] arr = new int[3]; // length = 3

		arr[0] = 10; //index will start from 'zero'
		arr[1] = 30;
		arr[2] = 40;
		
		for(int i=0; i<3; i++) {
			System.out.print(arr[i]+", ");
		}
	} //*/
	
	
	/*/Ex2
	public static void main(String[] args) {
		int[] numbers = {5, 2, 7, 9, 6};
		System.out.println("Original Array: "+Arrays.toString(numbers));
	} //*/
	
	
	/*/Ex3
	public static void main(String[] args) {
		int[] arr = {10, 30, 20, 60, 40};
		int length = arr.length;
		
		// printing array elements using for loop
		System.out.println("Array Elements: ");
		for(int k=0; k<length; k++) {
			System.out.println("Element at index "+k+ " : "+ arr[k]);
		} 

		//sum of all elements
		int sum = 0;
		for(int num : arr) { //for-each loop / Enhanced for loop
			sum +=num; //sum = sum+num; 
		}
		System.out.println(sum);
	} //*/
	
	
	//Ex4
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Get the array size
		System.out.println("Enter the size of the array: ");
		int size = sc.nextInt();
//		System.out.println("User Given size is: "+size);
		
		//Create an array of the given size
		int[] arr = new int[size];
		
		//Get the elements to add to the Array
		System.out.println("Enter the Array Elements: ");
		for(int i=0; i<size; i++) {
			arr[i] = sc.nextInt();
//			System.out.println("User Given array elemnts are: "+arr[i]);
		}
		
		//resultant Array
		for(int i=0; i<size; i++) {
			System.out.print(arr[i]+", ");
		}
		
		System.out.println("\n"+Arrays.toString(arr));
		
		sc.close();
	}
	
}











