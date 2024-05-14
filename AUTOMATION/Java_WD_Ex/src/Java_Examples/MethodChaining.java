package Java_Examples;

class Employee{
	String name;
	int id;
	double salary;
	
	Employee(){
		
	}
	
	Employee(String n, int i, double s){
		this.name=n;
		this.id=i;
		this.salary=s;
	}
	
	public Employee getName() {
		System.out.println("Name: "+name);
		return this;
	}
	
	public Employee getId() {
		System.out.println("Name: "+id);
		return this;
	}
	
	public Employee getSalary() {
		System.out.println("Name: "+salary);
		return this;
	}
}

public class MethodChaining {
	public static void main(String[] args) {
		Employee mc1 = new Employee("John", 121, 2345.45);
		Employee mc2 = new Employee("Mohan", 234, 1456.78);
		
		mc1.getName().getId();
		System.out.println("=====================");
		mc2.getName().getId().getSalary();
	}
}
