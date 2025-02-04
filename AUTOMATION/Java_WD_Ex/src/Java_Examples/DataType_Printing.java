package Java_Examples;

public class DataType_Printing {
	public static void main(String[] args) {
		Object[] variables = { 42, 3.14, "Hello", true, 'A', 100L, 2.5f };

		for (Object var : variables) {
			System.out.println("Value: " + var + " | Data Type: " + var.getClass().getSimpleName());
		}
	}
}
