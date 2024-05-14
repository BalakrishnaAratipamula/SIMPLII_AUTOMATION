package Relationships_or_Associations;

class Engine {
	private int horsepower;

	Engine(int horsepower) {
		this.horsepower = horsepower;
	}

	int getHarsepower() {
		return horsepower;
	}
}

class Car {
	private Engine engine;

	Car(Engine engine) {
		this.engine = engine;
	}

	Engine getHarsepower() {
		return engine;
	}
}

/*In this Ex Car-class has a compositional relationship with Engine-class. 
Engine-class cannot exist without the Car-class 
and Car-class have a full control over the Engine-class */

public class Composition {

}



