package Multiple_Inheritance;

class trackingModule{
	void notifyUser() {System.out.println("notify: Order reached hub");	}
}

class paymentModule1{
	void processPyment() {System.out.println("processing payment...");	}
}

class paymentModule2{
	void notifyUser() {System.out.println("processing payment...");	}
}

//Ex 1: extending classes have different methods - Diamond problem
/*public class Ambiguity_r_DiamondProblem extends trackingModule, paymentModule1{ //Java doesn't allow MI through classes bcz if both the extending classes have sme methods then their will be a diamond problem.
	Ambiguity_r_DiamondProblem obj = new Ambiguity_r_DiamondProblem();
	obj.notifyUser();
	obj.paymentModule1();
} */

//Ex 2: extending classes have same methods - Diamond problem
/*public class Ambiguity_r_DiamondProblem extends trackingModule, paymentModule2{ //Java doesn't allow MI through classes bcz if both the extending classes have same methods then their will be a diamond problem (i.e. compiler will get confuse which method has to call in both same signature methods).
	Ambiguity_r_DiamondProblem obj = new Ambiguity_r_DiamondProblem();
	obj.notifyUser(); //Both the extending classes having same signature methods - so Ambiguity will occur here 
} */
