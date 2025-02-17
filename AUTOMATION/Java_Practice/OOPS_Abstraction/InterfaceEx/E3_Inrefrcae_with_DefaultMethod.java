package InterfaceEx;

interface Vehicle{
	//Abstract method
	void drive();
	
	//Default method //NAM
	default void print() { //in case default keyword is not present for default method inside interface it will consider as public
		System.out.println("print() from Vehicle Interfcae is calling");
	}
}

class Car implements Vehicle{

	@Override
	public void drive() {
		System.out.println("drive() from Car class is calling");
	}
}


public class E3_Inrefrcae_with_DefaultMethod {
	public static void main(String[] args) {
		Vehicle obj = new Car();
		obj.print();
		obj.drive();
	}
}
