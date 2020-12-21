package com.inheritance.childclass;

import com.inheritance.baseclass.BaseClass;

public class ChildClass extends BaseClass{
	public void testIt(){
		System.out.println("X is "+x);
		BaseClass baseClass = new BaseClass();
		System.out.println("base Class x "+baseClass.x);
	}
	
	public void m1()
	
	{
		
	}
public static void main(String[] args) {
//new ChildClass().testIt();
}
}
