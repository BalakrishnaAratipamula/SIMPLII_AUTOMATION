package Types_Of_Inheritance;

interface Flyable{
	void fly();
}

class Bird implements Flyable{
	@Override
	public void fly() {
		System.out.println("Bird is flying");
	}
}

class Airplane implements Flyable{
	@Override
	public void fly() {
		System.out.println("Airplane is fling");
	}
}

class Airbus extends Airplane{
	@Override
	public void fly() {
		System.out.println("Airbus is flying");
	}
}

public class E5_Hybrid_Inheritance {
	public static void main(String[] args) {
		Flyable f1 = new Bird();
		Flyable f2 = new Airplane();
		Flyable f3 = new Airbus();
		f1.fly();
		f2.fly();
		f3.fly();
	}
}
