package GarbageCollectorEx;

//Some examples of when an object maybe deleted by the garbage collector
public class GarbageCollector {
	
	/*/ Ex 1 - when an object is assigned to null
	public static void main(String[] args) {
		GarbageCollector gb = new GarbageCollector();
		gb = null; //this object moves into GC
	} //*/
	
	
	/*/ Ex 2 - when an object goes out of scope
	public static void main(String[] args) {
		GarbageCollector gb = new GarbageCollector(); //bcz of not using this object into prog it moves into GC
		System.out.println("main");
	} //*/
	
	
	/*/ Ex-3 - when an object replaced by another object
	void sum(){
		System.out.println("sum()");
	}
	public static void main(String[] args) {
		GarbageCollector gb = new GarbageCollector(); //bcz of not using this object into prog it moves into GC
		GarbageCollector gb2 = new GarbageCollector();
		gb2.sum();
	} //*/
	
	
	/*/ Ex-4 - when an program terminates
	public static void main(String[] args) {
		System.out.println("program Starts");	//Mm - Main method
		Vehile vh = new Vehile();	//Here, when jvm starts the execution of Mm then Vehicle objects is created and it is deleted when Mm will completed or when pro terminates
		System.out.println("program Ends");
	} //*/
	
}

