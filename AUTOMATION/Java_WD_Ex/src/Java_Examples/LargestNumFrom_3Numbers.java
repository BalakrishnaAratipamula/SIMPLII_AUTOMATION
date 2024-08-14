package Java_Examples;

public class LargestNumFrom_3Numbers {
	public static void main(String[] args) {
		int n1=1, n2=9, n3=5;
		
		if(n1>=n2 && n1>=n3)
			System.out.println(n1+" is largest number");
		else if(n2>=n1 && n2>=n3) 
			System.out.println(n2+" is largest number");
		else
			System.out.println(n3+" is largest number");
	}
}
