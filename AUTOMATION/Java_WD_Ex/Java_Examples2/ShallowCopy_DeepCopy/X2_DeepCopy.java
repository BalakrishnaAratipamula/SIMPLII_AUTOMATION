package ShallowCopy_DeepCopy;

import java.util.ArrayList;
import java.util.List;

class Student2 implements Cloneable {
	String name;
	List<String> subjects;

	Student2(String name, List<String> subjects) {
		this.name = name;
		this.subjects = subjects;
	}

	// Deep copy
	protected Object clone() throws CloneNotSupportedException {
		List<String> copiedSubjects = new ArrayList<>(this.subjects);
		return new Student(this.name, copiedSubjects);
	}
}

public class X2_DeepCopy {
	public static void main(String[] args) throws CloneNotSupportedException {
		List<String> subjects = new ArrayList<>();
		subjects.add("Math");
		subjects.add("Science");

		Student2 s1 = new Student2("John", subjects);
		Student2 s2 = (Student2) s1.clone(); // deep copy

		s2.name = "Mike";
		s2.subjects.add("English"); // only affects s2

		System.out.println(s1.subjects); // [Math, Science]
		System.out.println(s2.subjects); // [Math, Science, English]
	}
}
