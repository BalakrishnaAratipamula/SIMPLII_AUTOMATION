package ConstructorConcept;

public class ExOnThis5 {
	int x, y;
	
	//method
	void setData(int x, int y) {
		this.x=x;
		this.y=y;
	} 
	
	// constructor
	ExOnThis5(int x, int y) {
		this.x = x;
		this.y = y;
	} //*/
	
	void display() {
		System.out.println(x+" "+y);
	}
	
	public static void main(String[] args) {
		/*/Exec 1 --- put constructor in comments
		ExOnThis5 obj = new ExOnThis5();
		obj.setData(10, 20);
		obj.display();
		//*/
		
		//Exec 2
		ExOnThis5 obj = new ExOnThis5(10, 20);
		obj.display();
		//*/
	} 
}
