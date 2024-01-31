package Interface;

public class KIA implements Car{

	@Override //@Override - represents below method coming from car interface reference variable
	public void Start() {
		System.out.println("KIA---start()");
	}
	
	@Override
	public void Stop() {
		System.out.println("KIA---stop()");
		System.out.println(finalWheels);
		System.out.println(staticWheels);
		System.out.println(nonStaticWheels);
	}
	
	@Override
	public void Refuel() {
		System.out.println("KIA---refuel()");
	}
	
	public void Theftsafety() { //non-Overridden method
		System.out.println("KIA---Theftsafety()");
	}

}
