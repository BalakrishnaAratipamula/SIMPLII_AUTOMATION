package Java_Examples;

import java.util.Arrays;

public class Array_Sorthing_with_nd_wo_using_inbuilt_mtd {
	/*/Java int coding qns : #7 Sort An Array using inbuilt method
	public static void main(String[] args) {
		int[] arr = {5, 2, 8, 1, 3};
		Arrays.sort(arr);
		
		System.out.println(Arrays.toString(arr));
	} //*/
	
	
	//Java int coding qns : #7b Sort An Array Without using inbuilt method
	//#2
	public static void main(String[] args) {
		int[] arr = {5, 2, 9, 1, 6, 0};
		
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
			
		System.out.println("Sorted Array:  "+Arrays.toString(arr));
	
	} //*/
}
