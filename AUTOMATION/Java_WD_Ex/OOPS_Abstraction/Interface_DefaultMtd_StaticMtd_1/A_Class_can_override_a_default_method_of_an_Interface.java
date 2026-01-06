package Interface_DefaultMtd_StaticMtd_1;

interface Demo {
	default void display() {
		System.out.println("default method in interface");
	}
}

class Exec implements Demo {
	@Override
	public void display() {
		System.out.println("Method Overridden in 'Exec Class'");
	}
}

public class A_Class_can_override_a_default_method_of_an_Interface implements Demo{
	@Override
	public void display() {
		System.out.println("Method Overridden in 'A_Class_can_override_a_default_method_of_an_Interface Class'");
	}
	
	public static void main(String[] args) {
		
	}
}
