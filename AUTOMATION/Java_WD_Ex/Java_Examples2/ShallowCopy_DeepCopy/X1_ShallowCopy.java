package ShallowCopy_DeepCopy;

import java.util.ArrayList;
import java.util.List;

class Student implements Cloneable {
	String name;
	List<String> subjects;

	Student(String name, List<String> subjects) {
		this.name = name;
		this.subjects = subjects;
	}

	// Shallow copy
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

public class X1_ShallowCopy {
	public static void main(String[] args) throws CloneNotSupportedException {
		List<String> subjects = new ArrayList<>();
		subjects.add("Math");
		subjects.add("Science");

		Student s1 = new Student("John", subjects);
		Student s2 = (Student) s1.clone(); // shallow copy

		s2.name = "Mike";
		s2.subjects.add("English"); // affects both s1 and s2

		System.out.println(s1.subjects); // [Math, Science, English]
		System.out.println(s2.subjects); // [Math, Science, English]
	}
}
