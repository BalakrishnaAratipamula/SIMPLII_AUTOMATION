package Java_Examples;

public class longest_consecutive_sequence_of_integers_in_array {
	public static void main(String[] args) {

		//int[] arr = { 4, 3, 25, 6, 7, 8, 9, 2, 3, 10 };
		int[] arr = { 136, 141, 156, 135, 144, 133, 134, 192, 143, 132, 142 };  

		int count = 0;
		int max = 0;

		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] + 1 == arr[i + 1]) {
				count++;
			} else {
				count = 0;
			}

			max = Math.max(max, count + 1);
		}
		System.out.println("length: "+max);
	}

}
