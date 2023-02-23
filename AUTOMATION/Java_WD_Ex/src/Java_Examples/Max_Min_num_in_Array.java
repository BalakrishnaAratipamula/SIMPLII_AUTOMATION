package Java_Examples;

public class Max_Min_num_in_Array {
	public static void main(String[] args) {
		/*/find maximum number
		int[] arr = {5, 6, 2, 4, 9, 18};
		for(int i=0; i<arr.length; i++) {
			if(arr[0]<arr[i]) {
				arr[0]=arr[i];
			}
		}
		System.out.println("maximum number in array is: "+arr[0]); */
		
		
		//find minimum number
		int[] arr = {5, 6, 7, 4, 6, 8, 10};
		for(int i=0; i<arr.length; i++) {
			if(arr[0]>arr[i]) {
				arr[0]=arr[i];
			}
		}
		System.out.println("minimum number in array is: "+arr[0]);
	}
}