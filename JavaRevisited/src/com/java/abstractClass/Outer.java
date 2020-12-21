package com.java.abstractClass;

public class Outer {
	final inner innerl;
public void print(){
	System.out.println("Outer");
	
}
public Outer() {
innerl= new inner();
}
public class inner{
	public void print(){
		System.out.println("Inner");
		
	}	
	
	/*class mynestedclass1{
		
		public void printstring(_){}
		public class mynestedclass1{
			
		}
	}*/
	{
		System.out.println("Inner");
	}
	
}
public static void main(String[] args) {
	new Outer().new inner();
	{
		System.out.println("Enclosing");
	}
}
}
