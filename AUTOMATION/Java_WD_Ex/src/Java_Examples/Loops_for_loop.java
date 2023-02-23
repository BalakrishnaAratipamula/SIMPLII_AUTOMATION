package Java_Examples;

import java.util.Scanner;

import org.testng.annotations.DataProvider;

public class Loops_for_loop { //////// https://youtu.be/xzstcj3Cuso
	//public static void main(String[] args) {
	/*for(int i=1; i<=5; i++) {
			System.out.println(i+ " bala");

		} 
	 *//////////////////////////check link for more programs ----- https://www.edureka.co/blog/30-pattern-programs-in-java/

	/*for(int n=1; n<=5; n++) {
			System.out.println(n+ " bala");
			if(n==3) {
				System.out.println("break performed");
				break;
			}
		} */



	/*for(int i=0; i<=3; i++){  //rows
			for(int j=0; j<=3; j++){  //columns  
				System.out.println(i+" "+j);  
			} 
		} */


	/*for(int i=0;i<=3;i++){  //rows 
			for(int j=0; j<=i; j++){  //columns
				System.out.println(i+" "+j);  
			} 
		} */


	/*/square and rectangle
		for(int i=1; i<=4; i++) {	 //rows
			for(int j=1; j<=4; j++) {	 //columns
				System.out.print("* ");
			}
			System.out.println();
		} */


	/*/square to close
		for(int i=1; i<=4; i++) {	 //rows
			for(int j=1; j<=4; j++) {	 //columns
				System.out.print("*");
			}
			System.out.println();
		} */




	/*/right angle triangle with same numbers numbers
		for(int i=1; i<=4; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		} */



	/*/right angle triangle with numbers increment order
		int num=0;
		for(int i=1; i<=4; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(num+" ");
				num++;
			}
			System.out.println();
		} */



	/*/right angle triangle with numbers decrement order
		int num=9;
		for(int i=1; i<=4; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(num+"  ");
				--num;
			}
			System.out.println();
		} */


	/*/right angle triangle with numbers depends on i iterations
		for(int i=1; i<=4; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(i+" ");

			}
			System.out.println();
		} */  


	/*/Right triangle with numbers
		for(int i=0; i<4; i++) { 
			int num=1; 
			for(int j=0; j<=i; j++) { 
				System.out.print(num+ " "); 
				num++; 
			} 
			System.out.println();
		} */  



	/*int alphabet = 65;
		for(int i=0; i<26; i++) {
			System.out.print((char)(alphabet++) + " ");
		} */


	/*/Right Alphabetic triangle 
		int alphabet = 65;
		for(int i=0; i<=5; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print((char)(alphabet++) + " "); //alphabet+i - horizontal <==> alphabet+j - vertical <==> alphabet++
			}
			System.out.println();
		} */



	/*/--------------Decreasing right angle triangle 
	public static void submethod(int n) {
		for(int i=1; i<=n; i++){  
			for(int j=i; j<=n; j++){  
				System.out.print("* ");  
			}  
			System.out.println(); 
		}
	}
	public static void main(String args[]){ 
		int n = 5;   
		submethod(n); */


	/*/Remaining all will come from Inc and Dec Triangles
	//------------------------------ Right sided Right angle Triangle
	//Priority order is Rows-space-columns
	public static void subMethod(int n) {  	
		for(int i=1; i<=n; i++){  //loop for Row iterations
			for(int j=i; j<=n; j++){  //nested-loop of dec triandle (for space)
				System.out.print("  "); ///////("  ") //2-spaces  //here we want to print spaces only
			}
			for(int j=1; j<=i; j++) {	//columns 
				System.out.print("* ");	//////("* ")  //1-space	//here we want to print *
			}
			System.out.println(); 
		} 
	}
	// Driver Function 
	public static void main(String args[]){ 
		int num = 5;   
		subMethod(num); */



	/*/-----------------------------Left right angle triangle
	//pattern rows-space-columns
	public static void subMethod(int n) {
		for(int i=1; i<=n; i++) { 
			for(int j=1; j<=i; j++) {	 
				System.out.print("  "); //2-spaces //inc
			}
			for(int j=i; j<=4; j++){  
				System.out.print("* "); //1-space //dec
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int n=5;
		subMethod(n); */



	/*/ triangle 
	//pattern decT of space--incT of *---incT of *---decT of space (last one is not require)
	public static void subMethod(int n) { 
		for(int i=1; i<=n; i++) { 
			for(int j=i; j<=n; j++){  //decT of space
				System.out.print("  ");  
			}  
			for(int j=1; j<i; j++) {  //incT of * //if j<=i one extra col will print  
				System.out.print("* ");
			}
			for(int j=1; j<=i; j++) {	//incT of * //above same modification can do here or above
				System.out.print("* ");
			}
			System.out.println(); 
		} 
	} 
	// Driver Function 
	public static void main(String args[]) { 
		int num=5; 
		subMethod(num); */




	/*/reverse triangle 
	//pattern incT of space--decT of *---decT of *---incT of space (last one is not require)
	public static void subMethod(int n) {
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {	 
				System.out.print("  ");
			}
			for(int j=i; j<n; j++){  
				System.out.print("* ");  //decT of * //if j<=i one extra col will print
			} 
			for(int j=i; j<=n; j++){  
				System.out.print("* ");  //decT of * //above same modification can do here or above
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int n=5;
		subMethod(n); */


	/*/take reference as triangle and Reverse triangle
	//Diamond shape
	public static void subMethod(int n) {
		for(int i=1; i<=n; i++) { //if i<=n one extra row will print
			for(int j=i; j<=n; j++){  //decT of space
				System.out.print("  ");  
			}  
			for(int j=1; j<=i; j++) {  //incT of * //if j<=i one extra col will print
				System.out.print("* ");
			}
			for(int j=1; j<i; j++) {	//incT of * //above same modification can do here or above
				System.out.print("* ");
			}
			System.out.println(); 
		}
		for(int i=0; i<=n; i++) {
			for(int j=1; j<=i; j++) {	 
				System.out.print("  ");
			}
			for(int j=i; j<=n; j++){  
				System.out.print("* ");  //decT of * //if j<=i one extra col will print
			} 
			for(int j=i; j<n; j++){  
				System.out.print("* ");  //decT of * //above same modification can do here or above
			}
			System.out.println();
		}
	}
	//driver function
	public static void main(String[] args) {
		int n=10;
		subMethod(n); */





	//Right Pascal’s Triangle
	//pattern incT of *--DecT of * 
	public static void submethod(int n) {
		for(int i=1; i<n; i++) { //if i<=n one extra row will print 
			for(int j=1; j<=i; j++) { //incT of *
				System.out.print("* "); 
			} 
			System.out.println();
		}
		for(int i=1; i<=n; i++) { //remove here or above 
			for(int j=i; j<=n; j++){  //DecT of * 
				System.out.print("* ");  
			}  
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int n = 5;
		submethod(n); 


		/////////////from here not did as youtube (link in above)


		/*/Left Pascal’s Triangle --------System.out.print(" *");-----result will get diamond pattern 
	public static void submethod(int n){
		for (int i=1; i<=n ; i++) { 	///Line iterations
			for (int j=i; j<n; j++) {	 ////space iterations
				System.out.print(" ");
			}
			for (int k=1; k<=i; k++) { 	///* iterations
				System.out.print("*");  //System.out.print("* "); -- diamond shape
			} 
			System.out.println(); 
		} 
		for (int i=n; i>=1; i--) {
			for(int j=i; j<=n; j++) {
				System.out.print(" ");
			}
			for(int k=1; k<i; k++) {
				System.out.print("*");  //System.out.print("* "); -- diamond shape
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int n = 5;
		submethod(n); */





		/*public static void submethod(int n) {
		for (int i=0; i<=n-1; i++) {
			for (int j=0; j<i; j++) {
				System.out.print(" ");
			}
			for (int k=i; k<=n-1; k++) { 
				System.out.print("* "); 
			} 
			System.out.println(); 
		} 
		for (int i= n-1; i>=0; i--) {
			for (int j=0; j<i ;j++) {
				System.out.print(" ");
			}
			for (int k=i; k<=n-1; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int n=2;

		submethod(n); */
	} 
}