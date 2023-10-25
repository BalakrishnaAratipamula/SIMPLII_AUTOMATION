package Java_Examples;

public class Quiz {
public static void main(String[] args) {
	int i = 20;
	if(i>10) {
		System.out.println("Value of i is:  " +i);
		i++;
		System.out.println("Value of i is:  " +i);
		if(i%2 != 0) {
			System.out.println("ODD Number");
			// break;	//break cannot be used out side the LOOP or a SWITCH
		} 
		else {
			System.out.println("EVEN Number");
		}
		}
	
	// another Qns
	System.out.println("\n");
	int j = 0;
	while(j<=10) {
		System.out.println(j+ " ");
		j++;
		if(j<10) {
			System.out.println(j+ " ");

		}
	}
	
	
	
	
}
}
