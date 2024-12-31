package Java_Examples;

public class IncrementOperators2 {
	public static void main(String[] args) {
		int i=20, j=10;
		
		System.out.println(i);  //20
		System.out.println(--i);//19	print(1st part)+return(2nd part)
		System.out.println(i--);//19	print(1st part)+return(2nd part)
		System.out.println(i);	//18
		
		System.out.println("=========");
		
		System.out.println(j);  //10
		System.out.println(1+j);//11	only print there is no return
		System.out.println(j+1);//11	only print there is no return
		System.out.println(j);  //10
	}
}
