package Java_Examples;

public class Array_Declarartion_or_Fixed_Array_Declarartion {
	public static void main(String[] args) {

		//String[] myCars = {"aaa","bbb","ccc","ddd"};
		//(or)
		//Array Declaration
		String[] myCars = new String[4];
		//To assign values
		myCars[0]="AAA";
		myCars[1]="BBB";
		myCars[2]="CCC";
		myCars[3]="DDD";

		System.out.println("size of array is:  "+myCars.length);

		//To read data from Array using for loop
		System.out.println("*********from for loop********");
		for(int i=0; i<myCars.length; i++){
			System.out.print(myCars[i]+" ");
		}
		System.out.println();
		
		//To read data from Array using for-each
		System.out.println("*********from for-each loop********");
		for(String myCar: myCars) {
			System.out.print(myCar+" ");
		} 
		System.out.println();

	}
}
