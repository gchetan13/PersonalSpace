package com.java8.interfaces;

public class Student implements Comparable<Student>{
	private String name;
	private Integer age;
	public Student(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public Integer getAge() {
		return age;
	}
	@Override
	public int compareTo(Student o) {
		return this.getName().compareTo(o.getName());
	}
	
}
