package Interface;

public class E1_KIA implements E1_Car{

	@Override //@Override - represents below method coming from car interface reference variable
	public void Start() {
		System.out.println("KIA---start()");
	}
	
	@Override
	public void Stop() {
		System.out.println("KIA---stop()");
		System.out.println("finalWheels: "+finalWheels);
		System.out.println("staticWheels: "+staticWheels);
		System.out.println("nonStaticWheels: "+nonStaticWheels);
		System.out.println("nonStaticWheels2: "+nonStaticWheels2);
	}
	
	@Override
	public void Refuel() {
		System.out.println("KIA---refuel()");
	}
	
	public void Theftsafety() { //non-Overridden method
		System.out.println("KIA---Theftsafety()");
	}

}
