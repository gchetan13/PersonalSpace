package com.java8.supplier;

import java.util.function.Supplier;
import java.util.function.BooleanSupplier;
import java.util.function.DoubleSupplier;

public class SupplierTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supplier<Double> random = () -> Math.random();
		System.out.println(random.get());
		
		DoubleSupplier doubleSupplier = () -> Math.random();
		System.out.println(doubleSupplier.getAsDouble());
	
		 Supplier<Integer> hashcode = () -> (new Object()).hashCode();
		 System.out.println(hashcode.get());
	
		 BooleanSupplier booleanSupplier = () -> random.equals(hashcode);
		 System.out.println(booleanSupplier.getAsBoolean());
	}

}
