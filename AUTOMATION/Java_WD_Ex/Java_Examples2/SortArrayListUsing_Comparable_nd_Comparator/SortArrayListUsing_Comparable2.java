package SortArrayListUsing_Comparable_nd_Comparator;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayListUsing_Comparable2 implements Comparable<SortArrayListUsing_Comparable2>{
	private int id;
    private String name;
    private int age;
    private long salary;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public long getSalary() {
        return salary;
    }

    public SortArrayListUsing_Comparable2(int id, String name, int age, int salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public int compareTo(SortArrayListUsing_Comparable2 emp) {
        //let's sort the employee based on an id in ascending order
        //returns a negative integer, zero, or a positive integer as this employee id
        //is less than, equal to, or greater than the specified object.
        return (this.id - emp.id);
    }

    @Override
    //this is required to print the user-friendly information about the Employee
    public String toString() {
        return "[id=" + this.id + ", name=" + this.name + ", age=" + this.age + ", salary=" +
                this.salary + "]";
    }
    
    public static void main(String[] args) {
		ArrayList<SortArrayListUsing_Comparable2> al = new ArrayList<SortArrayListUsing_Comparable2>();
		al.add(new SortArrayListUsing_Comparable2(4567, "Abdhul", 35, 1500000));
		al.add(new SortArrayListUsing_Comparable2(1234, "Bala", 854756, 1000000));
		al.add(new SortArrayListUsing_Comparable2(7845, "Chandu", 784125, 1200000));
		al.add(new SortArrayListUsing_Comparable2(9743, "Daniel", 984125, 1100000));

		Collections.sort(al);
		for (SortArrayListUsing_Comparable2 emp : al) {
			System.out.println(emp);
		}
	}
}
