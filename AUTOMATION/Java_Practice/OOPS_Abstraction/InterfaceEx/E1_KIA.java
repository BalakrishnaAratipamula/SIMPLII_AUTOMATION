package InterfaceEx;

public class E1_KIA implements E1_Car {

	@Override
	public void start() {
		System.out.println("start() from E1_KIA class is calling");
	}

	@Override
	public void stop() {
		System.out.println("stop() from E1_KIA class is calling");
		System.out.println("finalWheels: " + finalWheels);
		System.out.println("staticWheels: " + staticWheels);
		System.out.println("nonStaticWheels: " + nonStaticWheels);
		System.out.println("nonStaticWheels2: " + nonStaticWheels2);
	}

	@Override
	public void refuel() {
		System.out.println("refuel() from E1_KIA class is calling");
	}

	void threadSafety() {
		System.out.println("threadSafety() from E1_KIA class is calling");
	}

}
