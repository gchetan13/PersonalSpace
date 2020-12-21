package com.pattern.bridge;

public class TestBridge {

	public static void main(String[] args) {
		Shape redTriangle = new Triangle(new RedColor());
		redTriangle.applyColor();
		Shape greenPentagon = new Pentagon(new GreenColor());
		greenPentagon.applyColor();
		Shape greenTriangle = new Triangle(new GreenColor());
		greenTriangle.applyColor();
		Shape redPentagon = new Pentagon(new RedColor());
		redPentagon.applyColor();
		
		//Shape triangle = new Triangle(RedColor::new);
		Color rcolor = RedColor::new;
		rcolor.applyColor();
	}

}
