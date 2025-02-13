package RuntimeP_or_MethodOverridingE4;

public class TestClass {
	
	public static void main(String[] args) {
		Animal myAnimal = new Animal();
		Animal myDog = new Dog();
		Animal myCat = new Cat();
		
		myAnimal.makesound();	//Animal stmt
		myDog.makesound();	//Dog stmt
		myCat.makesound();	//Cat stmt
	}
}
