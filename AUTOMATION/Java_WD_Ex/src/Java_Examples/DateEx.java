package Java_Examples;

import java.util.Date;

public class DateEx {
	public static void main(String[] args) {

		// Create a Date object
		Date date = new Date();

		// Create Employee4 object
		Employee4 emp = new Employee4("Balakrishna", 101, date);

		// Access values using getters
		System.out.println("Name: " + emp.getName());
		System.out.println("ID: " + emp.getId());
		System.out.println("Joining Date: " + emp.getJoiningDate());

		// Try to modifying original Date object
		date.setTime(0);

		System.out.println("\nAfter modifying original date:");
		System.out.println("Joining Date: " + emp.getJoiningDate()); //Result: Even if you try to modify the original Date, it won’t affect the object:
	}
}
