package Program_to_cover_all_OOPS_Concepts;

//Abstraction
interface Car {
	void printName();
}

//Inheritance
class Ford {
	private String name; // Encapsulation
	
	public String getName() {
		return name;
	}

	public void setName(String newName) {
		name = newName;
	}
}

class OneMore extends Ford implements Car {
	@Override
	public void printName() {
		System.out.println("Overridding Method Print " + super.getName());
	}

	// Overloading
	public void printName(String str) {
		System.out.println("Overloading Method Print " + str);
	}
}

public class Oops {
	public static void main(String[] args) {
        OneMore obj = new OneMore();
        
        obj.setName("Daniels");
        obj.printName(); //Overriding method
        obj.printName("Lussi"); // Overloading method
  }
}
