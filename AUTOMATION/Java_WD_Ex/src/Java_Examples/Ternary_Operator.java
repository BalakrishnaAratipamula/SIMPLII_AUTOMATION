package Java_Examples;

public class Ternary_Operator {
	/*/
	public static void main(String args[]) {
		int a = 10;
		int b = 5;				  //cond ? val1:val2
		int min = (a<b) ? a:b;    //(10<5) ? 10:5	//if cond 'false' print 'min' value    //Syntax:: variable=Expression1 ? Expression2:Expression3
		System.out.println(min);					//if cond 'true' print 'max' value
	} //*/
	
	
	/*/	
	public static void main(String args[]) {
		int a = 10;
		int b = 5;
		int max = (a>b) ? a:b;    //Syntax:: variable=Expression1 ? Expression2:Expression3
		System.out.println(max);
	} //*/
	
	
	/*/
	public static void main(String[] args) {
        int n1 = 5, n2 = 10, res;
        res = (n1>n2) ? (n1+n2) : (n1-n2);	//(5>10) ? 15:-5	//if cond 'false' print 'min' value
        // Print the largest number								//if cond 'true' print 'max' value
        System.out.println("Result = " + res);
    } //*/
	
	
//	public static void main(String[] args) {
//		int k = 7; //check with 0, 1, 2, 3, 4, 5, 6.....
//		boolean result = false;
//		
//		int value = k+=result ? 1:-1;
//		System.out.println(value);
//	}	
		
	/*/
	public static void main(String[] args) {
		int a = 7, b=5; //check with 0, 1, 2, 3, 4, 5, 6.....
		boolean result = false;
		
		int value = a+=true ? 1:-1;
		System.out.println("true scenarion: "+value);
		
//		int value2 = a+=false ? 1:-1;
//		System.out.println("false scenarion: "+value2);
	} //*/
	
	
	
	public static void main(String[] args) {
		int a=7, b=5;
		boolean res;
		res= a==b ? true:false; 	//cond 'false'-->res 'false'    //cond 'true'-->res 'true' 
		System.out.println(res);
	}
}
