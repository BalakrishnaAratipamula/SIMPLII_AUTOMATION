package Interface_DefaultMtd_StaticMtd_1;

interface Vehicle {
	default void print() {
		System.out.println("print() from vehicle");
	}

	public void drive();

}

class Car2 implements Vehicle {

	@Override
	public void drive() {
		System.out.println("driver() from Cars2");
	}

}

public class E2_Interface_with_Defaultmtd {
	public static void main(String[] args) {
		Vehicle v1 = new Car2();
		v1.print();
		v1.drive();
	}
}
