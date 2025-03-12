package Interface_DefaultMtd;

interface Vehicle {
	void start(); // Abstract method

	// Default method with implementation
	default void stop() {
		System.out.println("Vehicle is stopping...");
	}
}

class Car implements Vehicle {
	public void start() {
		System.out.println("Car is starting...");
	}
}

public class E1_Default_Methods_in_Interfaces {
	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.start(); // Calls implemented method
		myCar.stop(); // Calls default method from interface
	}
}
