package Interface;

interface A2{
	int add(int i, int j); //If we declare Interface KW it will consider all the methods by default abstract
}

public class Z1Ex3_FunctionalInteface { //this class is called Anonymous inner class
	public static void main(String[] args) {
		/*/
		A2 obj = (int i, int j) -> 
		{
			return i+j;
		};
		
		int result = obj.add(5, 8);
		System.out.println(result); //*/
		
		
		//----------------or--------------or---------------//
		A2 obj = (i, j) -> i+j;	//return kw is not required bcz only one statement is there
		
		int result = obj.add(5, 8);
		System.out.println(result); //*/
	}
}
