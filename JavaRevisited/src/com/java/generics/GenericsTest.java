package com.java.generics;

public class GenericsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		G g = new G();
		D d = new D();
		F f = new F();
		C<? super D,? super G> c = new C<A, B>();
		//test(f);
		//test(g);
		//test(d);
		test(c);
		
	}
	static void test(C<? super D,? super G> c)
	{
		System.out.println("Done");
	}
}
