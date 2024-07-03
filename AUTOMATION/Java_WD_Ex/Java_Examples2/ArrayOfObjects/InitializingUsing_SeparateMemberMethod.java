package ArrayOfObjects;

public class InitializingUsing_SeparateMemberMethod {
	public static void main(String args[]) {

		// Declaring an array of student
		Student2[] arr;
		// Allocating memory for 2 objects of type student
		arr = new Student2[2];
		// Creating actual student objects
		arr[0] = new Student2();
		arr[1] = new Student2();
		// Assigning data to student objects
		arr[0].setData(1701289270, "Daniel");
		arr[1].setData(1701289219, "Simon");
		// Displaying the student data
		arr[0].display();
		arr[1].display();
	}
}

//Creating a Student class with id and name as a attributes
class Student2 {

	public int id;
	public String name;

	// initialize Array Of Objects using 'separate member method'  (Method to set the data to student objects)
	public void setData(int id, String name) {	//////not using constructor
		this.id = id;
		this.name = name;
	}
	
	// display() method to display the student data
	public void display() {
		System.out.println("Student id = " + id + "   " +"Student name = " + name);
	}
}
