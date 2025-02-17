package Interface;

interface A1{
	void show(int i); //If we declare Interface KW it will consider all the methods by default abstract
}

public class Z1E3_FunctionalInteface {
	public static void main(String[] args) {
		/*/main use of Lambda Expression is to reduce the lines of code
		A1 obj = i -> System.out.println("value: "+i);
		
		obj.show(5); //*/
		
		
		//----------------or--------------or---------------//
		A1 obj = (int i) -> System.out.println("value: "+i);
		
		obj.show(5);
		
	}
}
