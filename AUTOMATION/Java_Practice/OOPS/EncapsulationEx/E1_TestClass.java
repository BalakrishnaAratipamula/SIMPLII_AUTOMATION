package EncapsulationEx;

public class E1_TestClass {
	public static void main(String[] args) {
		E1_Student obj = new E1_Student();
		
		obj.setAge(32);
		System.out.println(obj.getAge());
		
		obj.setName("Ramesh");
		String name = obj.getName();
		System.out.println(name);
	}
}
