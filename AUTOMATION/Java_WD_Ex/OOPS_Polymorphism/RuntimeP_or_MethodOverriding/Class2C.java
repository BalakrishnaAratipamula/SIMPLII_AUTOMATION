package RuntimeP_or_MethodOverriding;

public class Class2C extends Class1P {

	int speedlimit = 150; //data members overriding is not possible

	public void add(int a, int b) {
		int c = a + b;
		System.out.println("Child class method: " + c);
	}

	public void classCMethod() {
		System.out.println("Child class method called");
	}
}
