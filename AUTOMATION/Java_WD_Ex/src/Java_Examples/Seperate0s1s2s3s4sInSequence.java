package Java_Examples;

public class Seperate0s1s2s3s4sInSequence {
	public static void main(String[] args) {
		int arr[] = {0, 1, 1, 1, 0, 0, 1, 0, 2, 4, 3, 3, 2, 4, 3, 3, 4}; //{ 0, 1, 2, 1, 0, 2};
		
		int arr2[] = new int[arr.length];
		
		int j = 0;
		for(int i=0; i<=arr.length-1; i++) { //for(initialization, condition, iteration)
			if(arr[i] == 0) {
				arr2[j++] = arr[i];
//				System.out.println(arr[i]);
			}
		}
		for(int i=0; i<=arr.length-1; i++) { //for(initialization, condition, iteration)
			if(arr[i] == 1) {
				arr2[j++] = arr[i];
//				System.out.println(arr[i]);
			}
		}
		for(int i=0; i<=arr.length-1; i++) { //for(initialization, condition, iteration)
			if(arr[i] == 2) {
				arr2[j++] = arr[i];
//				System.out.println(arr[i]);
			}
		}
		for(int i=0; i<=arr.length-1; i++) { //for(initialization, condition, iteration)
			if(arr[i] == 3) {
				arr2[j++] = arr[i];
//				System.out.println(arr[i]);
			}
		}
//		while(j < arr.length) {
//			arr2[j++] = 4;
//		}
		for(int i=0; i<=arr.length-1; i++) { //for(initialization, condition, iteration)
			if(arr[i] == 4) {
				arr2[j++] = arr[i];
//				System.out.println(arr[i]);
			}
		}
		for(int k=0; k<=arr.length-1; k++) {
			System.out.print(arr2[k] + " ");
		}
	}
}
