package EncapuslationEx1;

public class TestClass {
	
	public static void main(String[] args) {

		Student obj = new Student();
		//obj.name = "Amit"; //in encapsulation will not allow to create bcz of 'private' declarartion // compilation error bcz 'name' is private

		obj.setName("Amit"); //setting the value of variable
		obj.setAge(18);
		System.out.println(obj.getName()); //getting the value of variable
		System.out.println(obj.getAge());
		
	}
}
