package ConstructorConcept;

public class ExOnThis4 {

	private int x;
	private int y;
	
	public ExOnThis4() {
		this(6,8);
	}
	
	public ExOnThis4(int X, int Y) {
		this.x=X;
		this.y=Y;
	}
	
	public static void main(String[] args) {
		ExOnThis4 obj = new ExOnThis4();
		
		System.out.println(obj.x);
		System.out.println(obj.y);
	}
	
}
//N: in above Ex No Argument constructor call the Parameterized constructor