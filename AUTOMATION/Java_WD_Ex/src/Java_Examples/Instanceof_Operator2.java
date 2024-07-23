package Java_Examples;

public class Instanceof_Operator2 {
	public static void main(String args[]) {

		Instanceof_Operator2 io2 = new Instanceof_Operator2();

		if (io2 instanceof Instanceof_Operator2) {
			System.out.println("'io2' is instance of 'Instanceof_Operator2'");
		} else {
			System.out.println("'io2' is not an instance of 'Instanceof_Operator2'");
		}

	}
}
