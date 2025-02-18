package Java_Examples;

//Java int coding qns : #20 Find the missing Number in An Array
public class Array_Print_missing_number {

	static void printMissingElements(int arr[], int n) {

		int diff = arr[0] - 0; // arr[i]-i

		for (int i = 0; i < n; i++) {
			if (arr[i] - i != diff) {
				while (diff < arr[i] - i) {
					System.out.print((i + diff) + " ");
					diff++;
				}
			}
		}
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 4, 6, 7, 10, 11, 13 };
		int n = arr.length;

		printMissingElements(arr, n);
	} // */

}
