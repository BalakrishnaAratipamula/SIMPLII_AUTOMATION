package Java_Examples;

public class Jump_Statements2 {
	public static void main(String[] args) {
		// break
		for (int i = 1; i <= 5; i++) {
			if (i == 3)
				break;
			System.out.println(i);
		}
		// Output: 1 2

		// continue
		for (int i = 1; i <= 5; i++) {
			if (i == 3)
				continue;
			System.out.println(i);
		}
		// Output: 1 2 4 5
	}

	// return
	public static int add(int a, int b) {
		return a + b;
	}
}
