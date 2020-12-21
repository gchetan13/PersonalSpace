package com.pattern.bridge;

public abstract class Shape {
	protected Color color;
	public Shape(Color c) {
		color=c;
	}
	abstract public void applyColor();
}
