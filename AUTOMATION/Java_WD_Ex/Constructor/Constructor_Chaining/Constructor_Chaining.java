package Constructor_Chaining;

class ParentEmployee {
	private String name;
	private int age;

	ParentEmployee() {
		this("John t", 32); //at this step will call the matching parameterized constructor available in same class
	}

	ParentEmployee(String n, int a) {
		this.name = n;
		this.age = a;
		System.out.println("PE: "+n);
		System.out.println("PE: "+a);
	}
}

class ChildEmployee extends ParentEmployee { // main class
	private String company;

	ChildEmployee() {
		super("john s", 42); //at this step will call the matching parameterized constructor available in Parent class
		this.company = "Google"; // Here we can use 'super()' and 'this' keywords together
		System.out.println(company);
	}

}

public class Constructor_Chaining {
	public static void main(String[] args) {
//		ChildEmployee ce = new ChildEmployee(); //Execution 1
		ParentEmployee pm = new ParentEmployee(); //Execution 2

	}
}













