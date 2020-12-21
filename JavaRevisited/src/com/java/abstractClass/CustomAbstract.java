package com.java.abstractClass;

public abstract class CustomAbstract {
	private int name;
	
	public CustomAbstract(int name) {
		super();
		this.name = name;
	}
	static void abc(){
		System.out.println("abc");
	}

protected abstract void method1();
}
