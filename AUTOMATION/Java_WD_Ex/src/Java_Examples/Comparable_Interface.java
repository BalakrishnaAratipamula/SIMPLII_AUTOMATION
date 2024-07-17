package Java_Examples;

import java.util.ArrayList;
import java.util.Collections;
////// Before coming this refer programs on sort Ref: Java_WD_Ex\src\Java_Examples\sort_mtd2 
class Students implements Comparable<Students> {
	int rollno;
	String name;
	int age;

	Students(int rollno, String name, int age) { //<---- check this order
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}

	public int compareTo(Students st) {
		if (age == st.age)
			return 0;
		else if (age > st.age)
			return 1;
		else
			return -1;
	}
}

public class Comparable_Interface {
	public static void main(String[] args) {
		// for Sorting
		ArrayList<Students> al = new ArrayList<Students>();
		al.add(new Students(101, "Mohanty", 30));
		al.add(new Students(106, "Siyaa", 27));
		al.add(new Students(105, "Jayansh", 21));

		Collections.sort(al);

		for (Students st : al) {
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}
		
		// for Comparing
		Students st = new Students(205, "Daniel", 31);
		Students st2 = new Students(102, "John", 32);
		System.out.println("\n"+st.compareTo(st2));
	}
}
