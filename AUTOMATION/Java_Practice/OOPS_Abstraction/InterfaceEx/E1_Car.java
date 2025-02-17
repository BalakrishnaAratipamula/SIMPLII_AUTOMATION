package InterfaceEx;

public interface E1_Car {
	
	//inside interface we can declare public, static, final var's 
	final int finalWheels = 4;
	static int staticWheels =6;
	int nonStaticWheels = 8; //if we take non-static variable inside the interfcae. interface will consider that NSV as public
	public int nonStaticWheels2 = 20;
	
	//Abstract Methods
	public void start();
	public void stop();
	public void refuel();
}
