package Java_Examples;

public class Method_and_ClassNames_printing {
	
	
	/*/ 1 - simple way
	public static void main(String[] args) { 
		Method_and_ClassNames_printing obj = new Method_and_ClassNames_printing(); 
        System.out.println("className:  "+obj.getClass().getSimpleName()); //className
        System.out.println("methodName:  "+new Object(){}.getClass().getEnclosingMethod().getName());
        System.out.println("methodName:  "+Thread.currentThread().getStackTrace()[1].getMethodName());
    } //*/
	
	
	
	// 2 - using constructor
	Method_and_ClassNames_printing(){
		System.out.println("className:  "+this.getClass().getSimpleName());	//.getName() - returns packName.className
																			//.getSimpleName() - returns className only
		//methodName and className is same in Constructor
	}
	public static void main(String[] args) {
		Method_and_ClassNames_printing obj = new Method_and_ClassNames_printing();
		System.out.println("methodName:  "+new Object(){}.getClass().getEnclosingMethod().getName());
		System.out.println("methodName:  "+Thread.currentThread().getStackTrace()[1].getMethodName());
	} //*/
	
	
	
	/*/ 3 - using normal method
	void Method2(){
		
        System.out.println("SubMethodName:  "+new Object(){}.getClass().getEnclosingMethod().getName());
        System.out.println("SubMethodName:  "+Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	public static void main(String[] args) {
		Method_and_ClassNames_printing obj = new Method_and_ClassNames_printing();
		System.out.println("className:  "+obj.getClass().getSimpleName()); //className
		System.out.println("MainMethodName:  "+new Object(){}.getClass().getEnclosingMethod().getName());
		obj.Method2();
	} //*/
	
}
