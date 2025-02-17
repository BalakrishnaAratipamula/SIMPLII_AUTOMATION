package InterfaceEx;

//interface
interface Animal {
	int weight = 40;

	// AMs
	void eat();

	void sleep();

	// Default Method
	default void dog() {
		System.out.println("dog() is calling from Animal Interface");
	}

	// Static Method
	static String cat(String str) {
		System.out.println("cat() calling from Animal interface:  "+str);
		return "returning text from static cat() method";
	}
}

//main class
public class E5_Interface_with_DefaultMtd_ParameterizedStaticMtd implements Animal {

	@Override
	public void eat() {
		System.out.println("eat() is calling from E5_Interface_with_DefaultMtd_ParameterizedStaticMtd class");
	}

	@Override
	public void sleep() {
		System.out.println("sleep() is calling from E5_Interface_with_DefaultMtd_ParameterizedStaticMtd class");
	}
	
	public static void main(String[] args) {
		Animal an = new E5_Interface_with_DefaultMtd_ParameterizedStaticMtd();
		an.eat();
		an.sleep();
		an.dog();
		System.out.println(Animal.cat("XYZ"));
		System.out.println("Variable weight:  "+an.weight);
		
	}
}
