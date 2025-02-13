package EncapsulationEx;

public class E1_Student {
	// to implement Encapsulation make class level variables as private (because of private no one can access from out side of the classes or from other classes)
	private int age;
	private String name;

	public void setAge(int age) { //to set the value
		this.age = age; //initializing local variable with class level variable
	}

	public int getAge() { //to get the value
		return age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
