package Java_Examples;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AAA_java {

//Java int coding qns : #5 Prime Number Check
/*/prime numbers ans prime number check
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
	} //*/

	/*/ Prime Number check
	public static boolean isPrime(int num) {

		if (num <= 1)
			return false;

		// Logic to check if a number is prime or not. If its Prime, returns true else
		// return false
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {

			System.out.println(isPrime(8));
	} //*/
	



//Java int coding qns : #3 Fobonacci series
/*/--------------------fibonacci numbers print based on given value
public static void main(String[] args) {
	int a=0,
	b=1,
	c=a+b;
	System.out.print(a+", "+b+", ");
	while(c<=100) {
		System.out.print(c+", ");
		//to swap the values
		a=b;
		b=c;
		c=a+b;
		} 
	}//*/

	/*/ fibonacci series program in java using recursion
	public static int a = 0, b = 1, c;

	public static void subMethod(int count) {
		if (count > 0) {
			c = a + b;
			a = b;
			b = c;
			System.out.print(c + ", ");
			subMethod(count - 1);
		}
	}

	public static void main(String args[]){    
	 int count=5;    
	 System.out.print(a+", "+b+", "); //printing 0 and 1 & it will call one time only
	 subMethod(count-2); //because 2 numbers (a & b) are already printed so in total counts reduced by 2 times &&& //count must declare while calling subMethod
	} //*/

	
	//Java int coding qns : #4 Factorial of a Number
	 /*/-----------------factorial of given given number
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
			fact = fact*i; //or fact *= i;
		}
	}
	System.out.println("The factorial of " +n+ " is: "+ fact);
	sc.close(); 
	} //*/
	
	/*/factorial program in java using recursion
	public static int subMethod(int n) { // (or) static int factorial(int n){
		if (n == 0) {
			return (1); // (or) return 1;
		} else {
			return (n * subMethod(n - 1)); // return(n * subMethod(n-1).......subMethod(n-1))
		}
	}

	public static void main(String args[]){ 
		int n=3;
		int fact=1;
		fact = subMethod(n);   //or num &&& //count must declare while calling sunMethod
    
    System.out.println("Factorial of "+n+" is: "+fact); //or num   
	} //*/
	
	
 	//Java int coding qns : #26 Number of occurrence of given char in a string
	//Java int coding qns : #26b Each char occurrence from given string
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
	} //*/
	
	
	
	/*/-----------------------number of occurrence of "char's"
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
	} //*/
	
	/*/ -------------------count the occurrence of each character
	public static void main(String[] args) {
		String str = "Selenium WebDriver Section";

		Map<Character, Integer> hm = new HashMap<Character, Integer>();

		// convert String to character Array
		char[] arr = str.toCharArray();
		for (char ch : arr) {
			if (ch != ' ') {
				if (hm.containsKey(ch)) {
					hm.put(ch, hm.get(ch) + 1);
				} else {
					hm.put(ch, 1);
				}
			}
		}
		for (Map.Entry entry : hm.entrySet()) {
			System.out.println(entry.getKey() + " = " + entry.getValue());
		}
	} //*/

	
	
	
	/*/Java int coding qns : #27 Number of occurrence of given word in a string
	public static void main(String[] args) {
		String string = "Java is a programming language. java is widely used in software testing";
		String word = "java";
		
		String[] words = string.toLowerCase().split(" ");
		int occurrence = 0;
		for(int i=0; i<words.length; i++) {
			if(words[i].equals(word)) {
				occurrence++;
			}
		}
		System.out.println(occurrence);
	} //*/
	
	
	//Java int coding qns : #27b Each word occurrence from a given string
	public static void main(String[] args) {
		String string = "Alice is a Girl and Bob is a Boy";
		Map<String, Integer> hm = new HashMap<>(); //or HashMap<String, Integer>();
		
		String[] words = string.split(" ");
		for(String word: words) {
			if(hm.containsKey(word)) {
				hm.put(word, hm.get(word)+1);
			}
			else {
				hm.put(word, 1);
			}
		}
		System.out.println(hm);
	}
	
	
	
	
	
	
	/*/ Java int coding qns : #2 Check for Palindrome
	// -----------------------Palindrome String
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
	}
	} //*/

	/*/ -----------------------Palindrome Number
	public static void main(String[] args) {
		int num = 12321;
		int intRev = 0;

		if (isPalindrome(num))
			System.out.println("Given string is palindrome");
		else
			System.out.println("Given string is not palindrome");
	} 

	
	public static boolean isPalindrome(int num) {
		int originalNum = num;
		int revNum = 0;

		while (num != 0) {
			int digit = num % 10;
			revNum = revNum * 10 + digit;
			num = num / 10;
		}
		return originalNum == revNum;
	} //*/

	
	/*/ ----------------------print statement infinite times
	public static void subMethod() {
		System.out.println("Hello");
		subMethod();
	}

	public static void main(String[] args) {
		subMethod();
		
	//Result: java.lang.StackOverflowError    
	//*/
	 
	
} //class
