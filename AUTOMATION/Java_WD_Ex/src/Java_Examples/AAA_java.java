package Java_Examples;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
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
	
	
	
/*/--------------------fibonacci numbers print based on given value
public static void main(String[] args) {
	int a=0
	b=1,
	c=a+b;
	System.out.print(a+", "+b+", ");
	while(c<=100) {
		System.out.print(c+", ");
		//to swap the values
		a=b;
		b=c;
		c=a+b;
	} */
	
	
	
	/*/fibonacci series program in java using recursion
	public static int a=0,b=1,c; 
	public static void subMethod(int count){
	    if(count>0){
	    	c=a+b;
	        a=b;
	  		b=c;
	        System.out.print(c+", ");   
	        subMethod(count-1); 
	     }    
	 }    
	 
	 public static void main(String args[]){    
	 int count=5;    
	 System.out.print(a+", "+b+", "); //printing 0 and 1 & it will call one time only
	 subMethod(count-2); //because 2 numbers (a & b) are already printed so in total counts reduced by 2 times &&& //count must declare while calling subMethod
	 */

	
	
	 /*/-----------------factorial for given given number
public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter any number: ");
	int n = sc.nextInt();
	int fact=1;
	for(int i=1; i<=n; i++) {
		if(n==0) {
			System.out.println("The factorial of " +n+ " is: "+ 1);
		}
		else {
			fact = fact*i;
		}
	}
	System.out.println("The factorial of " +n+ " is: "+ fact);
	sc.close(); 
	*/
	
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
    
    System.out.println("Factorial of "+n+" is: "+fact); //or num   
    */
	
	
 	
	/*/-----------------------to find number of occurrence of "char"
	public static void main(String[] args) {
		String str = "LT LiveTech EE";
		int ecount=0;
		int tcount=0;
		String ucStr = str.toLowerCase();
		System.out.println(ucStr);
		for(int i=0; i<=ucStr.length()-1; i++) {
			if(ucStr.charAt(i)=='e') {	//comparing with lower letter take toLowerCase() or comparing with higher letter take toUpperCase()
				ecount++;
			}
		}
		for(int i=0; i<=ucStr.length()-1; i++) {
			if(ucStr.charAt(i)=='t') {	//comparing with lower letter take toLowerCase() or comparing with higher letter take toUpperCase()
				tcount++;
			}
		}
		System.out.println("occurence of e is: "+ecount); 
		System.out.println("occurence of t is: "+tcount); 
	//*/
	
	
	
	//-----------------------to find number of occurrence of "char's"
	public static void main(String[] args) {
		String str = "java";
		
        HashMap<Character, Integer> charCount = new HashMap<Character, Integer>();	//(key, value)

        char[] charArray = str.toCharArray();	//toCharArray() - is used to put objects into array
        System.out.println(Arrays.toString(charArray));
        
        for(char ch : charArray) {
              if (charCount.containsKey(ch)) {	//containsKey(key | value): is used to check whether the specified key | value is avl in Map and it ret Boolean value.
                    charCount.put(ch, (charCount.get(ch)+1)); //put(key, value): is used to insert the elements in Map in the form of <key, value> pair format
              } else {                                        //get(key): is used to return the value for specified key.
                    charCount.put(ch, 1);
              }
        }
        for(Map.Entry entry : charCount.entrySet()) {	//Map.Entry<String, Integer> - Entry interface enables to work with a map entry		
        												//entrySet() - Creates a set and stores the map elements into them
              System.out.println("Character "+"'"+ entry.getKey() +"'"+ " Occurred " + entry.getValue() +" Times");
        }
        
	
        
	
	
	
	/*/-----------------------Palindrome
	public static void main(String[] args) {
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
		
	//Result: java.lang.StackOverflowError    
	
	 //*/
	 
	}
}
