package AA_Types_of_Constructors;

class Academy2 {
	int a = 0;
	int b = 0;

	// Parameterized Constructor
	Academy2(int a, int b) {
		System.out.println("Parameterized Constructor called");
		System.out.println("Addition of " + a + " and " + b + " = " + (a + b));
	}
}

public class ParameterizedConstructor {
	public static void main(String args[]) {

		// this invokes default constructor.
		Academy2 academy = new Academy2(10, 20);

	}
}
