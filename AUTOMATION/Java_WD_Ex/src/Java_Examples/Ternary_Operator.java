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
	
	
	public static void main(String[] args) {
        int n1 = 5, n2 = 10, res;
        res = (n1>n2) ? (n1+n2) : (n1-n2);	//(5>10) ? 15:-5	//if cond 'false' print 'min' value
        // Print the largest number								//if cond 'true' print 'max' value
        System.out.println("Result = " + res);
    }
}
