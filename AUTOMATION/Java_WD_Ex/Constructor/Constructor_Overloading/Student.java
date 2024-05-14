package Constructor_Overloading;

public class Student {

	int id;
	String name;
	
	Student(){
		
	}
	
	Student(int i, String n){
		this.id=i;
		this.name=n;
	}
	
	public static void main(String[] args) {
		Student st1 = new Student();
		Student st2 = new Student(101, "John");
		
		System.out.println(st1.id);
		System.out.println(st1.name);
		System.out.println("\n"+st2.id);
		System.out.println(st2.name);
		
	}
}
