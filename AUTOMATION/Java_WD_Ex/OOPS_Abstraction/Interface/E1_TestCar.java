package Interface;

public class E1_TestCar {
	public static void main(String[] args) {
		/*/1st scenario --- DC
		E1_KIA b = new E1_KIA();
		b.Start(); 
		b.Stop();
		b.Refuel();
		b.Theftsafety(); //*/

		/*/2nd scenario (this concept is called Dynamic Polymorphism) --- UC
		E1_Car c = new E1_KIA(); //-- UC
		c.Start();
		c.Stop();
		c.Refuel(); 
		//c.Theftsafety(); //--not allow to access bcz 'Theftsafety' method is only part of KIA //*/
		
		/*/3rd scenario --- DC
		E1_Car b = new E1_Car(); //---- bcz obj cannot be create to Interface //*/
	}
}
