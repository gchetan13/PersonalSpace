package com.java8.streams;

public class Person {
	private int id;
	private String name;
	private String color;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Person(int id, String name, String color) {
		super();
		this.id = id;
		this.name = name;
		this.color = color;
	}
	public Person() {
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", color=" + color + "]";
	}
	
}
