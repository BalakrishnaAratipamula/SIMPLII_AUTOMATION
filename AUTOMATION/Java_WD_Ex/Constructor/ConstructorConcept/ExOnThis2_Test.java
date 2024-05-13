package ConstructorConcept;

public class ExOnThis2_Test {
	public static void main(String[] args) {
		ExOnThis2_Car car = new ExOnThis2_Car("BMW", "Porto", 2024);	//invoking constructor
		
		car.drive();	//non-static method
		ExOnThis2_Car.stop();	//static method
	}
}
