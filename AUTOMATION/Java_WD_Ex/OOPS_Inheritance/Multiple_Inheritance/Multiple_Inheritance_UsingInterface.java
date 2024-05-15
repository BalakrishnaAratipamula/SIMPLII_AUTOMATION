package Multiple_Inheritance;

interface A1{
	void print();
}

interface B1{
	void print();
}

class C1 implements A1, B1{

	public void print(){
		System.out.println("print() from class C1");
	}
	
}
public class Multiple_Inheritance_UsingInterface {
	public static void main(String[] args) {
		A1 a = new C1();
		B1 b = new C1();
		
		a.print();
		b.print();
	}
}
