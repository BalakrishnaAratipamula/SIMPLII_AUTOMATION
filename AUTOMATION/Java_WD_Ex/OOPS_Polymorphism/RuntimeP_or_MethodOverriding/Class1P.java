package RuntimeP_or_MethodOverriding;

public class Class1P {

	int speedlimit = 90; //data members overriding is not possible

	public void add(int a, int b) {
		int c = a + b;
		System.out.println("Parent class method: " + c);
	}

	public void classPMethod() {
		System.out.println("Parent class method called");
	}
}
