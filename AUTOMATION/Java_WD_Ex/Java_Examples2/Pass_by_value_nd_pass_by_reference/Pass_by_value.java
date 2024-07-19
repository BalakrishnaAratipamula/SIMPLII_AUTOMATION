package Pass_by_value_nd_pass_by_reference;

/* If we consider primitive types in a method, it is always pass by value.
 * For non-primitive types, it is always references (Object, Class)Consider Non-Primitive Types we can explain how value changes. Pass by Value like behavior can be achieved by assigning reference
 * */
class Test { //Does't effects original value
	int x;

	Test(int i) {
		x = i;
	}

	Test() {
		x = 0;
	}
}

public class Pass_by_value {

	public static void main(String[] args) {
		// t is a reference
		Test test = new Test(6); //parameterized constructor will call
		// Reference is passed and a copy of reference is created in change()
		change(test);
		System.out.println(test.x);
	}

	public static void change(Test t) {
		t = new Test(); //non-parameterized constructor will call 
		t.x = 10; 	//Changes doesn't reflect, since assigning reference
	}
}
