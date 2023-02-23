package RuntimeP_or_MethodOverriding;

public class TestClass {
	public static void main(String[] args) {

		/*/1st scenario --- DC
		ClassC obj = new ClassC(); ///call ClassC mtds & vars
		obj.add(2,3); //Overriden method
		obj.classCMethod();
		obj.classPMethod(); 
		System.out.println(obj.speedlimit); */

		/*/2nd scenario --- DC
		ClassP obj = new ClassP(); ///call ClassP mtds & vars
		obj.add(4,6); 
		obj.classPMethod();
		//obj.classCMethod(); ///compile-time error
		System.out.println(obj.speedlimit); */
		
		//3rd scenario //Runtime Polymorphism --- UC
		ClassP obj = new ClassC(); //UC
		obj.add(2,3); //Overridden method
		obj.classPMethod();  
		//obj.classCMethod(); ///compile-time error
		System.out.println(obj.speedlimit); ////ClassP variable will print //bcz cannot override data members */

	}
}
