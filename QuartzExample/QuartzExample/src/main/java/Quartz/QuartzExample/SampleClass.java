package Quartz.QuartzExample;

import java.util.Objects;

public class SampleClass {
	
	static int num1 = 1;
	
	int num2 = 0;
	
	public void meth1(){
		
		String s1= null;
		String s2= new String();
		System.out.println(s2.hashCode());
		System.out.println(Objects.hashCode(s1));
		System.out.println(s1.hashCode());
	}
	
}
