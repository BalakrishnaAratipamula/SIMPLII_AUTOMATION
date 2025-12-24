package MethodReference_vs_Lambda;

import java.util.function.Supplier;

class Student {
	Student() {
		System.out.println("Student object created");
	}
}

public class MethodReference_to_a_Constructor {
	public static void main(String[] args) {
		// Using Lambda Expression
		Supplier<Student> supplier1 = () -> new Student();
		supplier1.get();

		// Using Method Reference to Constructor
		Supplier<Student> supplier2 = Student::new;
		supplier2.get();
	} // */
}
