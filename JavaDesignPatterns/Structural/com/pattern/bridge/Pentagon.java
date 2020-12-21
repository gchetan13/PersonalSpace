package com.pattern.bridge;

public class Pentagon extends Shape {

	public Pentagon(Color c) {
		super(c);
	}

	@Override
	public void applyColor() {
		System.out.print("Pentagon Fill with color ");
		color.applyColor();
	}

	
}
