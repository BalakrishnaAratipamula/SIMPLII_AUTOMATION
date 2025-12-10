package Default_nd_ParameterizedConstructor;

public class DefaultConstructor {
	int x,y;
	
	DefaultConstructor(){
		x=10;
		y=20;
	}
	
	void sum() {
		System.out.println("Sum: "+ (x+y));
	}
	
	public static void main(String[] args) {
		DefaultConstructor dc = new DefaultConstructor();
		dc.sum();
	}
}
