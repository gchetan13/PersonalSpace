package com.inheritance.childclass;

import com.inheritance.baseclass.BaseClass;

public class OtherClass extends ChildClass{
	public void testIt(){
		System.out.println("X is "+x);
		BaseClass childClass = new ChildClass();
		System.out.println("base Class x "+childClass.x);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
