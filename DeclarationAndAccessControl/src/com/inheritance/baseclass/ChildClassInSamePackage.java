package com.inheritance.baseclass;

public class ChildClassInSamePackage extends BaseClass {
	public String x;
public void testIt(){
	System.out.println("X is "+x);
	BaseClass baseClass = new BaseClass();
	System.out.println("base Class x "+baseClass.x);
}
	public static void main(String[] args) {
		new ChildClassInSamePackage().testIt();
}
}
