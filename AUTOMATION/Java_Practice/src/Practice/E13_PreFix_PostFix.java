package Practice;

public class E13_PreFix_PostFix {
	//Pre-Increment and Post Increment
	/*/ Ex1
	public static void main(String[] args) {
		int i=10;
		
		// post increment
		System.out.println(i++); //10
		System.out.println(i++); //11
		System.out.println(i++); //12
		System.out.println(i++); //13 
		
		//pre-increment
		System.out.println(++i); //11
		System.out.println(++i); //12
		System.out.println(++i); //13
		System.out.println(++i); //14
		
	} //*/

	
	//Ex2
	public static void main(String[] args) {
		int i=20, j=10;
		
		/*/
		System.out.println(i);  //20
		System.out.println(--i);//19
		System.out.println(i--);//19
		System.out.println(i);  //18
		//*/
		
		//
		System.out.println(j);   //10
		System.out.println(1+j); //11
		System.out.println(j+1); //11
		System.out.println(j+3); //13
		System.out.println(j);   //10
		
	}
}






