package Interface;

public class TestCar {
	public static void main(String[] args) {
		/*/1st scenario --- DC
		BMW b = new BMW();
		b.Start();
		b.Stop();
		b.Refuel();
		b.Theftsafety(); */

		/*/2nd scenario (this concept is called Dynamic Polymorphism) --- UC
		Car c = new BMW();
		c.Start();
		c.Stop();
		c.Refuel(); 
		//c.Theftsafety(); //--not allow to access bcz 'Theftsafety' method is only part of BMW */
		
		//3rd scenario --- DC
		//Car b = new Car(); //---- bcz obj cannot be create to Interface
	}
}
