package Java_Examples;

import java.util.Arrays;
import java.util.Scanner;

public class Remove_ele_from_Array_by_value_by_index {
	//Remove elements from Array by its VALUE (User choice)
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = {1,2,3,4,5,6,7,8};
		System.out.print("Enter Element to be deleted from list  "+Arrays.toString(arr)+" : ");
		int ele = sc.nextInt();
		int[] arr_new = new int[arr.length-1];
		//int k=0;
		for(int i=0, k=0; i<arr.length; i++){
			if(arr[i]!=ele){
				arr_new[k]=arr[i];
				k++;
			}
		}
		System.out.println("Before deletion :" + Arrays.toString(arr));
		System.out.println("After deletion :" + Arrays.toString(arr_new));
		sc.close(); 




		/*/Remove elements from Array by its INDEX
		int[] arr = new int[]{1,2,3,4,5};
        int[] arr_new = new int[arr.length-1];
        int index = 4;
        for(int i=0,k=0; i<arr.length; i++){
            if(i!=index){
                arr_new[k]=arr[i];
                k++;
            }
        }
        System.out.println("Before deletion :" + Arrays.toString(arr));
        System.out.println("After deletion :" + Arrays.toString(arr_new)); */





	}
}