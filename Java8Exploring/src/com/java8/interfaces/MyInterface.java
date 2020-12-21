package com.java8.interfaces;

import java.util.Collections;
import java.util.List;

public interface MyInterface {

	default public List<Student> sortStduents(List<Student> stuList){
		Collections.sort(stuList);
		return stuList;
	}
	static public void greet(String name){
		System.out.println("Welcome "+name);
	}
	
	public abstract Integer getMaxnum(List<Integer> intList);
	
}
