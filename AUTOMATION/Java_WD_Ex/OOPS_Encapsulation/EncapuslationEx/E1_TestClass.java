package EncapuslationEx;

public class E1_TestClass {
	
	public static void main(String[] args) {

		E1_Student obj = new E1_Student();
		//obj.name = "Amit"; // compilation error bcz 'name' is private

		obj.setName("Amit"); //setting the value of variable
		obj.setAge(18);
		System.out.println(obj.getName()); //getting the value of variable
		System.out.println(obj.getAge());
		
	}
}
