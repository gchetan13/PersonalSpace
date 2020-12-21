package com.java8.interfaces;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		MyInterface  myInterface = new MyClass();
		List<Student> stuList = new ArrayList<Student>();
		stuList.add(new Student("Jagat", 30));
		stuList.add(new Student("Chetan", 28));
		stuList.add(new Student("Surabhi", 25));
		myInterface.sortStduents(stuList);
		for (Student student : stuList) {
			System.out.println(student.getName()+" "+student.getAge());
		}
		MyInterface.greet("Chetan");
		System.out.println("-----------");
		List<Integer> intList = new ArrayList<Integer>();
		intList.add(1000);
		intList.add(200);
		intList.add(250);
		intList.add(9000);
		System.out.println("Max num "+myInterface.getMaxnum(intList));

	}

}
