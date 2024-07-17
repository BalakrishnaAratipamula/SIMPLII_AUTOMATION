package SortArrayListUsing_Comparable_nd_Comparator;

import java.util.ArrayList;
import java.util.Collections;

//Using Comparable	//Another Ex: Java_Examples\Comparable_Interface

class Employee implements Comparable<Employee> {

	private String name;
	private int empId;
	private int age;

	public Employee(String name, int empId, int age) {
		this.name = name;
		this.empId = empId;
		this.age = age;
	}

	@Override
	public int compareTo(Employee employee) {
//		System.out.println(this.age);
//		System.out.println(employee.age);
		return this.age - employee.age;
	}

	@Override
	public String toString() {
		return "[ Name= " +name+ ", Employee Id = " +empId+ ", Employee age = " +age+ "]";
	}
}

public class SortArrayListUsing_Comparable {
	public static void main(String[] args) {
		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(new Employee("Abdhul", 6589586, 15));
		al.add(new Employee("Bala", 854756, 10));
		al.add(new Employee("Chandu", 784125, 12));
		al.add(new Employee("Daniel", 984125, 11));

		Collections.sort(al);
		for (Employee emp : al) {
			System.out.println(emp);
		}
	}
}
