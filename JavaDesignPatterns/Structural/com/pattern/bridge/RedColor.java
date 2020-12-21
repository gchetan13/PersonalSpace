package com.pattern.bridge;

public class RedColor implements Color {
	public RedColor() {
		System.out.println("Red color Object created");
	}
	public void applyColor(){
		System.out.println("Red.");
	}
}
