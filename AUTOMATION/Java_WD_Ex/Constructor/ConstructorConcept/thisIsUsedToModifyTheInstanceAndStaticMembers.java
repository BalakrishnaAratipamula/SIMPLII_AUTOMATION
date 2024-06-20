package ConstructorConcept;

class Illustration { //https://www.scaler.com/topics/java/this-and-super-keyword-in-java/

	int instanceVar = 5; // instance variable
	static int staticVar = 10; // static variable

	void Scaler() {

		//modify the instance and static variables
		// referring to the current class instance and static variables
		this.instanceVar = 50;
		this.staticVar = 100;

		// printing the current class instance and static variable.
		System.out.println("Value of instance variable : " + this.instanceVar);
		System.out.println("Value of static variable : " + this.staticVar);

	}
}

public class thisIsUsedToModifyTheInstanceAndStaticMembers {

	public static void main(String[] args) {
		// creating an instance of Illustration class
		Illustration obj = new Illustration();
		obj.Scaler();
	}
}
