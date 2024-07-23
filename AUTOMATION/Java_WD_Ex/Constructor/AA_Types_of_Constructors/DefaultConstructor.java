package AA_Types_of_Constructors;

class Academy {
	// Constructor
	Academy() {
		System.out.println("Default Constructor called");
	}
}

public class DefaultConstructor {
	public static void main(String args[]) {
		// this invokes default constructor.
		Academy academy = new Academy();
	}
}
