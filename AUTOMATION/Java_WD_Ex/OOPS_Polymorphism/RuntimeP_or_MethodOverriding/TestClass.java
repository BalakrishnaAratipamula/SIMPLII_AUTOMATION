package RuntimeP_or_MethodOverriding;

public class TestClass {
	public static void main(String[] args) {

		/*/1st scenario --- DC
		Class2C obj = new Class2C(); ///call ClassC mtds & vars
		obj.add(2,3); //Overriden method //ch
		obj.classCMethod();
		obj.classPMethod(); 
		System.out.println(obj.speedlimit); //*/ //ch

		//2nd scenario --- DC
		Class1P obj = new Class1P(); ///call ClassP mtds & vars
		obj.add(4,6); //pr
		obj.classPMethod();
		//obj.classCMethod(); ///compile-time error
		System.out.println(obj.speedlimit); //*/ //pr
		
		/*/3rd scenario //Runtime Polymorphism --- UC
		Class1P obj = new Class2C(); //UC //exe
		obj.add(2,3); //Overridden method //ch
		obj.classPMethod();  
//		obj.classCMethod(); ///compile-time error
		System.out.println(obj.speedlimit); ////pr //bcz data members overriding is not possible */

		
		/*/4th scenario
		Class2C obj = new Class1P(); ///compile-time error //*/
	}
}
