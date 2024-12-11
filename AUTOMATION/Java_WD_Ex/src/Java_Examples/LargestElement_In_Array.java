package Java_Examples;

//Java int coding qns : #10 Largest Element In Array
public class LargestElement_In_Array {
	public static void main(String[] args) {
		int[] arr1 = {1, 3, 7, 4, 9};
		
		int largest = arr1[0];
		
		for(int num: arr1) {
			if(num>largest) {
				largest = num;
			}
		}
		System.out.println(largest);
	}
}
