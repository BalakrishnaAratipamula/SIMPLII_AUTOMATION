package Types_Of_Inheritance;

//Interface
interface Flyable{
	void fly();
}

//class
class Bird implements Flyable{
	@Override
	public void fly() {
		System.out.println("The Bird is flying");
	}

}

//class
class Airoplane implements Flyable{
	@Override
	public void fly() {
		System.out.println("The Airoplane is flying");
	}

}

//class
class Airbus implements Flyable{
	@Override
	public void fly() {
		System.out.println("The Airbus is flying");
	}

}

//main class
public class E5_Hybrid_Inheritance {
	public static void main(String[] args) {
		Flyable hi1 = new Bird();
		Flyable hi2 = new Airoplane();
		Flyable hi3 = new Airbus();
		
		hi1.fly();
		hi2.fly();
		hi3.fly();
	}
}
