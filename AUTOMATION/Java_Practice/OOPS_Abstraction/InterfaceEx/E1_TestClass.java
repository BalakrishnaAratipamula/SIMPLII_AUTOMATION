package InterfaceEx;

public class E1_TestClass {
	public static void main(String[] args) {
		/*/ Scenario 1
		E1_KIA obj = new E1_KIA();
		obj.start();
		obj.stop();
		obj.refuel();
		obj.threadSafety(); //*/
		
		/*/Scenario 2
		E1_Car obj = new E1_KIA(); //--UC
		obj.start();
		obj.stop();
		obj.refuel();
//		obj.threadSafety(); //*/
		
		/*/Scenario 3
		E1_Car obj = new E1_Car(); //*/

	}

}
