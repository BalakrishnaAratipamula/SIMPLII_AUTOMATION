package Interface;

public interface Car {
	//declare static or final variables only 
	final int wheels = 4; //(or) int wheels = 4; by default it will treated as 'final' and 'static'
	
	public void Start();
	public void Stop();
	public void Refuel();
	
}
