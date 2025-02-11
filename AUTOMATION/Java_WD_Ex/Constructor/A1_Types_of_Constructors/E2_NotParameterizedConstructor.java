package A1_Types_of_Constructors;

class Academy {
	// NotParameterizedConstructor
	Academy() {
		System.out.println("Default Constructor called");
	}
}

public class E2_NotParameterizedConstructor {
	public static void main(String args[]) {
		// this invokes default constructor.
		Academy academy = new Academy();
	}
}
