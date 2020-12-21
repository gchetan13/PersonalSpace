package com.pattern.decorator;

import java.util.HashSet;
import java.util.Set;

public class TestDecorator {

	public static void main(String[] args) {

		Set<String> sts = new HashSet<String>();
		sts.add("Chetan");
		sts.add("Chetan");
		System.out.println(sts.toString());
		System.out.println("Sports Car");
		Car sportsCar = new SportsCar(new BasicCar());
		sportsCar.assemble();
		System.out.println();
		
		System.out.println("Luxury car");
		Car luxuryCar = new LuxuryCar(new BasicCar());
		luxuryCar.assemble();
		System.out.println();
		
		System.out.println("Sports then Luxury car");
		Car luxuryAndSports = new LuxuryCar(new SportsCar(new BasicCar()));
		luxuryAndSports.assemble();
		System.out.println();
		
		System.out.println("Luxury then Sports car");
		Car sportsAndLuxury = new SportsCar(new LuxuryCar(new BasicCar()));
		sportsAndLuxury.assemble();
	}

}
