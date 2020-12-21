package com.chetan.inheriitance.base;

import java.io.FileNotFoundException;

public class BaseClass {
private void method1(){
	System.out.println("In private Method 1 of base class");
}
protected void method2(){
	System.out.println("In protected Method 2 of base class");
}
void method3(){
	System.out.println("In default 3 of base class");
}
public final void method4(){
	System.out.println("In final Method 4 of base class");
	char a[]=null;
	System.out.println(a);
}
public static void method5(){
	System.out.println("In static Method 5 of base class");
}
public void method6() throws Exception{
	System.out.println("In Method 6 of base class");
}
public void method7() throws RuntimeException{
	System.out.println("In Method 7 of base class");
}
public void method8() throws FileNotFoundException{
	System.out.println("In Method 8 of base class");
}
public void method9(){
	System.out.println("In Method 9 of base class");
}
public void method10(){
	System.out.println("In Method 10 of base class");
}
public void method11(Object obj){
	obj = new Object();
}
}
