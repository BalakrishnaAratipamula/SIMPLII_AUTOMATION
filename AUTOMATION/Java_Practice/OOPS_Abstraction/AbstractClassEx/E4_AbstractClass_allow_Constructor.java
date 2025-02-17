package AbstractClassEx;

//Abstract class
abstract class Vehicle{
	private String brand;
	
	public Vehicle(String brand) { //parameterized constructor for Abstract class
		this.brand=brand; //to initialize method level var's with class level var's
		System.out.println("Vehicle Constructor is called: Brand is "+brand); //1
	}
	
	//Abstract method
	public abstract void drive();
	
	//Encapsulated get class
	public String getBrand() {
		return brand;
	}
	
}

//concrete class
class Car extends Vehicle{
	private int numberOfSeats; //declaration value=null-->
	
	public Car(String brand, int numberOfSeats) {
		super(brand);
		
		this.numberOfSeats=numberOfSeats;
		System.out.println("Car Constructor is called: numberOfSeats is "+numberOfSeats);
		
	}

	@Override
	public void drive() {
		System.out.println("Implemented Abstract Method is calling");
		System.out.println("I'm driving "+getBrand()+"car with "+numberOfSeats+" seats...!"); //i'm driving Toyota car with 5 seats...!
	}
}

//main class
public class E4_AbstractClass_allow_Constructor {
	public static void main(String[] args) {
		Car car = new Car("Toyota", 5);
		car.drive();
	}
}
