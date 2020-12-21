package com.pattern.composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Drawing implements Shape {

	List<Shape> shapes = new ArrayList<Shape>();
	
	
	@Override
	public void draw(String color) {
		for (Shape shape : shapes) {
				shape.draw(color);
		}
	}
	
	public void addShape(Shape shape){
		shapes.add(shape);
	}

	public void removeShape(Shape shape){
		shapes.remove(shape);
	}
	
	public void clear(){
		System.out.println("Clearing all the shapes from drawing");
		this.shapes.clear();
	}
}
