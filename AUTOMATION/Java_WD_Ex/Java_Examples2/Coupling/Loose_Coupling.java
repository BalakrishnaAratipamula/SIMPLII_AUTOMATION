package Coupling;

interface Computer{
	void compile();
}

class Laptop2 implements Computer{
	@Override
	public void compile() {
		System.out.println("compiling in Laptop.....");
	}
}

class Desktop implements Computer{
	@Override
	public void compile() {
		System.out.println("compiling in Desktop.....");
	}
}

class Programmer2{
	void code(Computer comp) {
		System.out.println("coding......");
		comp.compile();
	}
}
public class Loose_Coupling {
	public static void main(String[] args) {
		Computer laptop = new Laptop2();
		Computer desktop = new Desktop();
		Programmer2 programmer = new Programmer2();
		
		programmer.code(laptop);	//Loose Coupling
		programmer.code(desktop);	//Loose Coupling
	}
	
}
