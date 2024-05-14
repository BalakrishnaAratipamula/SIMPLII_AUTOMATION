package Relationships_or_Associations;

import java.util.ArrayList;
import java.util.List;

class Student{
	private String name;
	
	Student(String name){
		this.name=name;
	}
	
	String getName() {
		return name;
	}
}

class School{
	private List<Student> students;
	
	School(){
		this.students=new ArrayList<>();
	}
	
	void addStudents(Student student) {
		this.students.add(student);
	}
	
	List<Student> getStudents(){	//dataType mtd()
		return students;
	}
}
/* In the above Ex School-class has an aggregational relationship with Student-class
 * the student-class can exist without the school class
 * School-class does not have a full control over the Student-class*/
public class Aggregation {

}
