package SubClass_nd_InnerClass;

class Main_r_Outer { // Outer Class
	class InnerClass { // Inner Class
		void print() {
			System.out.println("Inside Inner Class");
		}
	}
}

public class Main_r_Outer_Class_for_InnerClass_demo {
	public static void main(String[] args) {

		// Create Object for Outer Class
		Main_r_Outer main = new Main_r_Outer();
		// Create Object for Inner Class
		Main_r_Outer.InnerClass inner = main.new InnerClass(); // Inner class can only be accessed using outer class reference
		inner.print();
	}
}
