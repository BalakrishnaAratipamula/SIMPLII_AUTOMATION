package Pass_by_value_nd_pass_by_reference;

class Test2 {	//Effects original value
	int x;

	Test2(int i) {
		x = i;
	}

	Test2() {
		x = 0;
	}

}

public class pass_by_reference {

	public static void main(String[] args) {
		// t is a reference
		Test test = new Test(5);
		// Reference is passed and a copy of reference is created in change()
		change(test);
		System.out.println(test.x);
	}

	public static void change(Test t) {
		t.x = 100; // Changes reflects since we are not assigning 't' (refer 'Pass_by_value' example)
	}
}