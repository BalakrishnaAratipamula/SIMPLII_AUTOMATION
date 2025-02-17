package Interface;

public interface E1_Car {
	//declare static or final variables only 
	final int finalWheels = 4; //(or) int wheels = 4; by default it will treated as 'final' and 'static'
	static int staticWheels = 6;
	int nonStaticWheels = 8; //by Default it will consider as public
	public int nonStaticWheels2 = 20;	//Default public	
	
	public void Start();
	public void Stop();
	public void Refuel();

}
