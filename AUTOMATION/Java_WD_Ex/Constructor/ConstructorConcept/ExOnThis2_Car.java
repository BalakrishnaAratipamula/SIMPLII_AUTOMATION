package ConstructorConcept;

public class ExOnThis2_Car {
	String make;
	String model;
	int year;

	ExOnThis2_Car(String make, String model, int year) {
		this.make = make;
		this.model = model;
		this.year = year;
		System.out.println("make:"+make+"  model:"+model+"  year:"+year);
	}

	void drive() {
		System.out.println("car is driving");
	}
	
	static void stop() {
		System.out.println("car has stopped");
	}
}
