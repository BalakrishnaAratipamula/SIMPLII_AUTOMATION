package Coupling;

class Laptop{
	void compile() {
		System.out.println("compiling.....");
	}
}

class Programmer{
	void code(Laptop lap) {
		System.out.println("programming.....");
		lap.compile();
	}
}

public class Tight_Coupling {
	public static void main(String[] args) {
		Laptop laptop = new Laptop();
		Programmer programmer = new Programmer();
		
		programmer.code(laptop);	//Tight Coupling
	}
}
