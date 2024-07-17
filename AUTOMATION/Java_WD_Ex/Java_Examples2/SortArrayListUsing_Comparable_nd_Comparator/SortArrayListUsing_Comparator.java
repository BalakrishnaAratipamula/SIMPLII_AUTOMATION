package SortArrayListUsing_Comparable_nd_Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//Using Comparator

class Employee2 {
	
	private String name;
	private int empId;
	private int age;

	public Employee2(String name, int empId, int age) {
		this.name = name;
		this.empId = empId;
		this.age = age;
	}

	public String getName() {
		return this.name;
	}

	public int getEmpId() {
		return this.empId;
	}

	public int getAge() {
		return this.age;
	}

	public static Comparator<Employee2> EmployeeNameComparator = new Comparator<Employee2>() {
		public int compare(Employee2 e1, Employee2 e2) {
			String empName1 = e1.getName().toLowerCase();
			String empName2 = e2.getName().toLowerCase();
			return empName1.compareTo(empName2);
		}
	};

	public static Comparator<Employee2> EmployeeAgeComparator = new Comparator<Employee2>() {
		public int compare(Employee2 e1, Employee2 e2) {
			int empAge1 = e1.getAge();
			int empAge2 = e2.getAge();
			return empAge1 - empAge2;
		}
	};

	@Override
	public String toString() {
		return "[ Name= " + name + ", Employee Id = " + empId + ", Employee age = " + age + "]";
	}
}

public class SortArrayListUsing_Comparator {
	public static void main(String[] args) {

        ArrayList<Employee2> al = new ArrayList<Employee2>();
        al.add(new Employee2("Rahul", 6589586, 35));
        al.add(new Employee2("John", 854756, 32));
        al.add(new Employee2("Lukas", 784125, 30));

        System.out.println("Sort Employee List by Name");
        Collections.sort(al, Employee2.EmployeeNameComparator);
        for (Employee2 emp : al) {
              System.out.println(emp);
        }

        System.out.println("\nSort Employee List by Age");
        Collections.sort(al, Employee2.EmployeeAgeComparator);
        for (Employee2 emp : al) {
              System.out.println(emp);
        }
  }
}
