package InterfaceEx;

@FunctionalInterface
interface A7{
	//Abstract method
	void display(int i);
}

//main class
public class E7_FunctionalInterface {
	public static void main(String[] args) {
		A7 obj = (int i) -> System.out.println("value of 'i' is:  "+i);
		
		obj.display(9);
	}
}
