package com.pattern.composite;

public class TestCompositePattern {

	public static void main(String[] args) {

		Shape tri = new Triangle();
		Shape tri1 = new Triangle();
		Shape cir = new Circle();
		
		Drawing drawing = new Drawing();
		drawing.addShape(tri1);
		drawing.addShape(tri1);
		drawing.addShape(cir);
		
		drawing.draw("Red");
		
		drawing.clear();
		
		drawing.addShape(tri);
		drawing.addShape(cir);
		drawing.draw("Green");
	}

}
