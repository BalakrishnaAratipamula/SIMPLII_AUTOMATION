package ConstructorConcept;

public class SimpleConstructor {

	SimpleConstructor() {	//can be public, private, default, protected
		System.out.println("Simple Text");
	}
	
	public static void main(String[] args) {
		new SimpleConstructor();
	}
}
