package E1Private_AM;

//class
class A{
	//private variable
	private int data = 40;
	
	//private method
	private void msg() {
		System.out.println("Calling variable: "+data);
		System.out.println("Hello Java!");
	}
}

//main class
public class Test {
	public static void main(String[] args) {
		A obj = new A();
		
		//calling the variable
//		System.out.println(obj.data); //compiletime error
		
		//calling the variable
//		obj.msg(); //compiletime error
	}
}
