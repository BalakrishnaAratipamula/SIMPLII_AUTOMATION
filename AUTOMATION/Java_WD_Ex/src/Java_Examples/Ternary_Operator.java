package Java_Examples;

public class Ternary_Operator {
	/*/
	public static void main(String args[]) {
		int a = 10;
		int b = 5;				  //cond ? val1:val2
		int min = (a<b) ? a:b;    //(10<5) ? 10:5	//if cond 'false' print '2nd' value    //Syntax:: variable=Expression1 ? Expression2:Expression3
		System.out.println(min); //5				//if cond 'true' print '1st' value
	} //*/
	
	
	/*/	
	public static void main(String args[]) {
		int a = 10;
		int b = 5;
		int max = (a>b) ? a:b;    //Syntax:: variable=Expression1 ? Expression2:Expression3
		System.out.println(max); //10
	} //*/
	
	/*/
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		System.out.println(a>b?a:b); //20
	} //*/
	
	/*/
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		System.out.println(a==b?a:b); //20
	} //*/
	
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		System.out.println(a!=b?a:b); //20
	}
	
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
	
	
	/*/
	public static void main(String[] args) {
		int a=7, b=5;
		boolean res;
		res= a==b ? true:false; 	//cond 'false'-->res 'false'    //cond 'true'-->res 'true' 
		System.out.println(res);
	} //*/
	
	/*/
	void print(String str){
		boolean res1, res2;
		res1= str==null ? true:false;
		res2= str=="" ? true:false;
		System.out.println("res1:  "+res1);
		System.out.println("res2:  "+res2);
	}
	public static void main(String[] args) {
		Ternary_Operator to = new Ternary_Operator();
		to.print(null);
	} //*/
	
	/*/
	void print(String str) {
		boolean res;
		res= str==null?true : "".equals(str)?true:false; //see below
		// cond1?true : con2?true:false  ///'cond1' belongs to 'null' cond2' belongs to '"" & strContent'
		System.out.println(res);
	}
	public static void main(String[] args) {
		Ternary_Operator to = new Ternary_Operator();
		to.print("xyz");	//chheck with null, "", strContent
	} //*/
}
