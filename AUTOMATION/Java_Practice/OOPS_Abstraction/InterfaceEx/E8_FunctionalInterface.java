package InterfaceEx;

@FunctionalInterface
interface A9{
	//Abstract method with returning value
	int add(int a, int b);
}

//main class
public class E8_FunctionalInterface {
	public static void main(String[] args) {
		A9 adder = (a, b) -> (a+b); System.out.println("Sum is:  "+adder.add(5, 8));
		
	}
}

