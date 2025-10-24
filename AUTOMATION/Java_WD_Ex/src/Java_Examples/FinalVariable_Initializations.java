package Java_Examples;

public class FinalVariable_Initializations {

	// Type-1 : Initialize at the time of declaration
	private final int myVar = 100; // Instance variable

	
	// Type-2 : Initialized in non-static initializer block
	private final int myVal2; // Instance variable
	{
		myVal2 = 120;
	}

	// private int x; //Instance variable

	
	// Type-3 : Initialized from constructor
	private final int myVal3; // Instance variable

	FinalVariable_Initializations() {
		myVal3 = 120;
	}
}
