package Java_Examples;

public class VariableHiding {
	
	/*/EX-1
	static int x = 10;
	public static void main(String[] args) {
		int x = 20;
		System.out.println(x);
		System.out.println(VariableHiding.x);
	} //*/
	
	
	
	/*/EX-2
	int y = 40;
	void demo() {
		int y = 50;
		System.out.println(y);
		System.out.println(this.y);
	}
	public static void main(String[] args) {
		VariableHiding vh = new VariableHiding();
		vh.demo();
	} //*/
	
	
	
	/*/EX-3
	private String message = "this is instance variable";

	VariableHiding() {
        String message = "constructor local variable";
        System.out.println(message);
    }

    public void printLocalVariable() {
        String message = "method local variable";
        System.out.println(message);
    }

    public void printInstanceVariable() {
        String message = "method local variable";
        System.out.println(this.message);
    }
    
    public static void main(String[] args) {
        VariableHiding variable = new VariableHiding();
        variable.printLocalVariable();
        variable.printInstanceVariable();
	} //*/
}
