package com.pattern.composite;

public class Circle implements Shape {

	@Override
	public void draw(String color) {
		System.out.println("Drawing Triangle with color "+color);
	}

}
