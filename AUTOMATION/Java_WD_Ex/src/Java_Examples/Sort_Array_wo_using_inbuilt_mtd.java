package Java_Examples;

import java.util.Arrays;

public class Sort_Array_wo_using_inbuilt_mtd {
	//Java int coding qns : #7 Sort An Array
	public static void main(String[] args) {
		int[] arr = {5, 2, 8, 1, 3};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	
	
	/*/#2
	public static void main(String[] args) {
		int[] arr = {5, 2, 9, 1, 6};
		
		selectionSort(arr);
		
		System.out.print("Sorted Array:  ");
		for(int num : arr) {
			System.out.print(num+" ");
		}
	}
	
	static void selectionSort(int[] arr) {
		int n = arr.length;
		for(int i=0; i<n-1; i++) {
			int minIndex = i;
			for(int j=i+1; j<n; j++) {
				if(arr[j]<arr[minIndex]) {
					minIndex = j;
				}
			}
			//swap arr[i] and arr[minIndex]
			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
		}
	} //*/
}
