package com.chetan.inheriitance.child;

import java.io.FileNotFoundException;

import com.chetan.inheriitance.base.BaseClass;
import com.chetan.inheriitance.base.generic;

public class Child extends BaseClass implements generic{
		private final void getname(){}
	private void method1(){
		System.out.println("In private Method 1 of base class");
	}
	private void method2(){
		System.out.println("In protected Method 2 of base class");
	}

	protected void method3(){
		System.out.println("In default 3 of base class");
	}
	public final void method4(){
		System.out.println("In final Method 4 of base class");
	}
	public static void method5(){
		System.out.println("In static Method 5 of base class");
	}
	public void method6() throws FileNotFoundException{
		System.out.println("In Method 6 of base class");
	}
	public void method7(){
		System.out.println("In Method 7 of base class");
	}
	public void method8() throws Exception{
		System.out.println("In Method 8 of base class");
	}
	public void method9() throws Exception{
		System.out.println("In Method 9 of base class");
	}
	public void method10(String num){
		System.out.println("In Method 10 of base class");
	}
	public Child() {
		this("Chetan");
		
		// TODO Auto-generated constructor stub
	}
	public Child(String name) {
		super();
		
		// TODO Auto-generated constructor stub
	}
	
}
