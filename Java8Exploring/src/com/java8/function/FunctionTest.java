package com.java8.function;

import java.util.function.BiFunction;
import java.util.function.DoubleFunction;
import java.util.function.DoubleToIntFunction;
import java.util.function.IntToDoubleFunction;
import java.util.function.IntToLongFunction;

public class FunctionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BiFunction<Integer, Integer, Integer> sum = (a,b) -> (a+b);
		BiFunction<Integer, Integer, Integer> multiply = (a,b) -> (a*b);
		System.out.println(sum.apply(10, 10));
		System.out.println(multiply.apply(10, 10));
		
		DoubleFunction<Double> doubleFunction = (a) -> (a*1.1);
		System.out.println(doubleFunction.apply(1.1));
		
		IntToDoubleFunction intToDoubleFunction = a -> a*3.14;
		System.out.println(intToDoubleFunction.applyAsDouble(2));
		
		IntToLongFunction intToLongFunction = a -> a*1011;
		System.out.println(intToLongFunction.applyAsLong(2));
		
		DoubleToIntFunction doubleToIntFunction = a -> (int)a;
		System.out.println(doubleToIntFunction.applyAsInt(1.1));
		
		double d =10.0;
		int a = (int) d;
		System.out.println(a);
		
		
	}

}
