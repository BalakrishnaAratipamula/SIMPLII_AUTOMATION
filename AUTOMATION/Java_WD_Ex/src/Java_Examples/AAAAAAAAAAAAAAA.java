package Java_Examples;

import java.util.ArrayList;
import java.util.List;

class A5{}

class B5 extends A5{}

public class AAAAAAAAAAAAAAA {
	public static void main(String[] args) {
		List<? super A5> l1 = new ArrayList<>();	//? - represents refers
		List<? extends B5> l2 = new ArrayList<>();
		
		/*
		System.out.println(l1=l2);
		System.out.println(l2=l1);
		System.out.println(l1.add(new A5()));
		System.out.println(l2.add(new B5()));
		System.out.println(l1.add(l2.get(0)));
		System.out.println(l2.add(l1.get(0)));
		//*/
		
	}
}
