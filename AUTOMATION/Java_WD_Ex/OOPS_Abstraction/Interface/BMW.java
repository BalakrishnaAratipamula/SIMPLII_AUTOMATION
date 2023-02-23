package Interface;

public class BMW implements Car{

	@Override //@Override - represents below method coming from car interface reference variable
	public void Start() {
		System.out.println("BMW---start");
	}

	@Override
	public void Stop() {
		System.out.println("BMW---stop");
	}

	@Override
	public void Refuel() {
		System.out.println("BMW---refuel");
	}
	
	public void Theftsafety() { ////non-Overridden method
		System.out.println("BMW---Theftsafety");
	}

}
