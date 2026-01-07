package Pass_by_value_nd_pass_by_reference;

class Student {
    String name;
}

public class PassByValue_for_Objects {
	static void change(Student s) {
        s.name = "Rahul";
    }

    public static void main(String[] args) {
        Student st = new Student();
        st.name = "Amit";

        change(st);
        System.out.println(st.name);
    }
}
