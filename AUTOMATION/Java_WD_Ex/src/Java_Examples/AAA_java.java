package Java_Examples;

import java.util.Scanner;

public class AAA_java {

/*/prime numbers
public static void main(String[] args) {
	for(int n=1; n<=30; n++) {
		int count=0;
		for(int i=1; i<=n; i++) {
			if(n%i==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.print(n+", ");
		}
	} */
	
	
	
//--------------------fibonacci numbers print based on given value
public static void main(String[] args) {
	int a=0;
	int b=1;
	System.out.print(a+", "+b+", ");
	int c=a+b;
	while(c<=100) {
		System.out.print(c+", ");
		//to swap the values
		a=b;
		b=c;
		c=a+b;
	}
	
	
	
	/*/fibonacci series program in java using recursion
	public static int a=0,b=1,c; 
	public static void subMethod(int count){
	    if(count>0){
	    	c=a+b;
	        a=b;
	  		b=c;
	        System.out.print(" ,"+c);   
	        subMethod(count-1);    
	     }    
	 }    
	 
	 public static void main(String args[]){    
	 int count=5;    
	 System.out.print(a+" "+b); //printing 0 and 1 & it will call one time only
	 subMethod(count-2); //because 2 numbers (a & b) are already printed so in total counts reduced by 2 times &&& //count must declare while calling subMethod
	 */
	
	
	
	 /*/-----------------factorial for given given number
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter any number: ");
	 int n = sc.nextInt();
	 int fact=1;
	 for(int i=1; i<=n; i++) {
		 fact = fact*i;
	 }
	 System.out.println("The factorial of " +n+ " is: "+ fact);
	sc.close(); */

	/*/factorial program in java using recursion
	public static int subMethod(int n){    //(or) static int factorial(int n){
		  if(n==0) {    
		    return (1);  //(or) return 1; 
		  }
		  else {   
		    return(n * subMethod(n-1));  // return(n * subMethod(n-1).......subMethod(n-1))
		 }
	}
	public static void main(String args[]){ 
		int n=3;
		int fact=1;
    fact = subMethod(n);   //or num &&& //count must declare while calling sunMethod
    
    System.out.println("Factorial of "+n+" is: "+fact); //or num   */
    
	
	
 	
	/*/-----------------------to find number of occurrence of "char"
	String str = "LiveTech e";
	int count=0;
	for(int i=0; i<=str.length()-1; i++) {
		if(str.charAt(i)=='e') {
			count++;
		}
	}
	System.out.println("occurence of e is: "+count);  */
	
	
	
	
	/*/-----------------------Palindrome
	String str = "refeR";
	String strRev = "";
	//to reverse given string 
	for(int i=str.length()-1; i>=0; i--) {
		strRev=strRev+str.charAt(i);
	}
	System.out.println("String after reverse:  "+strRev);
	if(str.equalsIgnoreCase(strRev)) {
		System.out.println("Given string is palindrome");
	}
	else {
		System.out.println("Given string is not palindrome");
	} */ 
	
	
	
	
	/*/----------------------print statement infinite times
	public static void subMethod() {
		System.out.println("Hello");
		subMethod();
	}
	public static void main(String[] args) {
		subMethod();
		
	//Result: java.lang.StackOverflowError    */
	
	
	/*/print statement using Recursion
	static int count=0; //Global variable -- if not declare will get StackOverflowError
	public static void subMethod() {
		count++;
		if(count<=5) {
			System.out.println("Hello  "+count);
			subMethod();
		}		
	}
	public static void main(String[] args) {
		subMethod(); */
	
	 
	 
}
}
