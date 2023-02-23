package Java_Examples;

public class Add_Array_elements {
	public static void main(String[] args) {
		int[] in = {1, 2, 3, 4, 5, 10, 20};
		int sum = 0;
		for(int add : in) {
			sum = sum+add;
		}
		System.out.println(sum);
	}
}
