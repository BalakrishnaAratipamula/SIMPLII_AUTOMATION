package Pass_by_value_nd_pass_by_reference;

class Student2 {
    String name;
}

public class Proof_JavaIsNot_CallByReference {

	static void change(Student2 s) {
//	    s = new Student2(); //s is reassigned to a new object
	    s.name = "Rohit";
	}
	
	public static void main(String[] args) {
        Student2 st = new Student2();
        st.name = "Amit";

        change(st); //Original st is unchanged
        System.out.println(st.name); //If Java were call by reference, this would change st
    }
}
