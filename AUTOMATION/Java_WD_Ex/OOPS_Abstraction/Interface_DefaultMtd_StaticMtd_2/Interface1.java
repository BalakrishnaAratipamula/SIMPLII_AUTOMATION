package Interface_DefaultMtd_StaticMtd_2;

public interface Interface1 {
	
	default void  print(String str) {
		if(!isNull(str)) 
			System.out.println("Interface1 print():  "+str);
//		else
//			System.out.println("else");
	}

	static boolean isNull(String str) {
		System.out.println("isNull() from Interface");
		
		System.out.println(str==null ? true:true);
		return str==null?true : "".equals(str)?true:false; //see below
		// cond1?true : con2?true:false  ///'cond1' belongs to 'null' cond2' belongs to '"" & strContent'	//ref::  k+= down ? 1:-1;
	
	}																										//ref::  (n1>n2) ? (n1+n2) : (n1-n2)
}
