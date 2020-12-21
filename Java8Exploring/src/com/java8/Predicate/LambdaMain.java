package com.java8.Predicate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class LambdaMain {
	  private void hello(){  
	        System.out.println("Hello, this is non-static method.");  
	    }  
public static void main(String[] args) {
	
	// Method Reference 
	LambdaMain main = new LambdaMain();
	VoidLambda u = main::hello; // since hello  method and VoidLambda abstract method have same signature
	VoidLambda p = () -> {System.out.println("nothing");};
	u.hello();
	p.hello();
	
	// Constructor reference 
	// Classname::new
	Messageable message = Message::new;
	Message message2 = message.getMessage("Hello from constructor reference");
	System.out.println(message2.msg);
	char[] chars = new char[] {'a','b','c','d'};
	ToString toString = String::new; // Since String constructor and ToString abstract method have same signature
	System.out.println(toString.toString(chars));
	
	ZeroParameterLambda msg = () -> {return "Hello";};
	System.out.println(msg.sayhello());
	
	//Lambda Expression One Parameter
	OneParameterLambda msg1 = (num) -> (num+5);
	System.out.println(msg1.add(20));
	System.out.println(msg1.getdefault());
	System.out.println(OneParameterLambda.getname());
	
	
	
	//Lambda Expression Two Parameter
	MultipleParameterLambda msg2 = (num1,num2) -> {return num1+num2;};
	MultipleParameterLambda msg3 = (num1,num2) -> num1+num2;
	System.out.println(msg2.sum(20,30));
	System.out.println(msg3.sum(20,30));
	
	//iterating list through Lambda
	List<String> names=new ArrayList<String>();
	names.add("Chetan");
	names.add("Surabhi");
	names.add("Aniruddha");
	names.add("Shubhendu");
//	names.forEach((name)->System.out.println(name));

	//iterating maps through through Lambda
 	Map<String, Integer> prices=new HashMap<String, Integer>();
 	prices.put("Apple",30);
 	prices.put("Grapes",80);
 	prices.put("Pomegranate",90);
 	prices.forEach((k,v)->System.out.println("Fruit Name "+k+" Fruit Price "+v));
 	

}

}
