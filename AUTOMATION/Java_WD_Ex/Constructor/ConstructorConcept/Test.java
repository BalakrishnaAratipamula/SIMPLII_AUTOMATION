package ConstructorConcept;

public class Test {
	public int rollNo = 101;
	
	public Test() {
		this.rollNo = 102;
		System.out.println("Printing from 'constructor':  "+rollNo);
	}
	
	public void printRollNo() {
		System.out.println("Printing from 'printRollNo()':  "+rollNo);
	}
	
	public static void main(String[] args) {
		Test obj = new Test();
		System.out.println("Printing from 'main method':  "+obj.rollNo);
		obj.printRollNo();
	}
}
