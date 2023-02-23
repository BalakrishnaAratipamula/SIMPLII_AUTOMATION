package EncapuslationEx1;

public class Student { ///////-------https://youtu.be/DjpP4J_DWq4

	private int age;
	private String name;

	//getter and setter methods (to generate RC on any where--> Source --> Generate Getters and Setters)
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age; //this.global_var = local_var
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name  = name; //(or) name = studentname;
	}

}
