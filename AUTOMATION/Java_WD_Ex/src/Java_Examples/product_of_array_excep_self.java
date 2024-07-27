package Java_Examples;

public class product_of_array_excep_self {
	public static void main(String[] args) {

		int[] arr = {1, 2, 3, 4}; //4*3*2*1=24
		int len = arr.length;

		int[] left_products = new int[len];
		int[] right_products = new int[len];
		int[] output_array = new int[len];
		
		left_products[0] = 1;
		right_products[len - 1] = 1;

		for (int i=1; i<len; i++) {
			left_products[i] = arr[i - 1] * left_products[i - 1];
		}

		for (int i=len-2; i>=0; i--) {
			right_products[i] = arr[i + 1] * right_products[i + 1];
		}

		for (int i=0; i<len; i++) {
			output_array[i] = left_products[i] * right_products[i];
		}

		for (int i=0; i<len; i++) {
			System.out.print(output_array[i] + " ");
		}

	}

}
