package Java_Examples;

public class SecondLargestNumber_Array {
	public static void main(String[] args) {

		/*/ #1
		int[] arr = {2, 3, 1, 6, 9, 9};
		int temp;
		for (int i=0; i<arr.length; i++) {
			for (int j=i+1; j<arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		for (int i=arr.length-2; i>=0; i--) {
			if (arr[i] != arr[arr.length-1]) {
				System.out.println("The second largest element " + arr[i]);
				break;
			}
		} */
		
		
		// #2
		//Java int coding qns : #17 Second Largest Element in an Array
		int[] arr = {12, 35, 1, 10, 34,1};
		int first = Integer.MIN_VALUE, second = Integer.MAX_VALUE;
		for(int num: arr) {
			if(num>first) {
				second = first;
				first = num;
			}
			else if(num>second && num != first){
				second = num;
			}
		}
		System.out.println(second);
	}

}
