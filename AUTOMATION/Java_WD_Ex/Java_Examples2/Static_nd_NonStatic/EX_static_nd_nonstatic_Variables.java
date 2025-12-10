package Static_nd_NonStatic;

public class EX_static_nd_nonstatic_Variables {
	static int staticVar = 10; // Static variable (shared across all instances)
	int nonStaticVar = 20; // Non-static variable (unique for each instance)

	// Method to display values
	void display() {
		System.out.println("Static Variable: " + staticVar);
		System.out.println("Non-Static Variable: " + nonStaticVar);
	}

	public static void main(String[] args) {
		// Creating first instance
		EX_static_nd_nonstatic_Variables obj1 = new EX_static_nd_nonstatic_Variables();
		obj1.staticVar = 50; // Modifying static variable (affects all instances)
		obj1.nonStaticVar = 30; // Modifying non-static variable for obj1
		
		// Creating second instance
		EX_static_nd_nonstatic_Variables obj2 = new EX_static_nd_nonstatic_Variables();
		obj2.nonStaticVar = 40; // Modifying non-static variable for obj2

		// Displaying values
		System.out.println("Values for obj1:");
		obj1.display();

		System.out.println("\nValues for obj2:");
		obj2.display();
	}
}
