package AbstractClass;

abstract class Vehicle {
	private String brand;

	// Constructor for abstract class
	public Vehicle(String brand) {
		this.brand = brand;
		System.out.println("Vehicle constructor called: Brand is " + brand);
	}

	// Abstract method
	public abstract void drive();

	// Getter for brand
	public String getBrand() {
		return brand;
	}
}

class Car extends Vehicle {
	private int numberOfSeats;

	// Constructor for subclass
	public Car(String brand, int numberOfSeats) {
		super(brand); // Calls the constructor of the abstract class
		this.numberOfSeats = numberOfSeats;
		System.out.println("Car() constrcutor called");
	} //*/

	@Override
	public void drive() {
		System.out.println(getBrand() + " car with " + numberOfSeats + " seats is driving.");
	}
}

public class XAbstractClass_allow_Constructors2 {
	public static void main(String[] args) {
		Car car = new Car("Toyota", 5); // Instantiating the subclass
		car.drive();
	}
}
