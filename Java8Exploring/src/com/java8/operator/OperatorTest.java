package com.java8.operator;

import java.util.function.BinaryOperator;
import java.util.function.LongBinaryOperator;
import java.util.function.UnaryOperator;
import java.util.function.DoubleBinaryOperator;

public class OperatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryOperator<Integer> binaryOperator = (a,b) -> (a+b);
		System.out.println(binaryOperator.apply(10, 10));
		
		UnaryOperator<String> upperCase = (a) -> (a.toUpperCase());
		System.out.println(upperCase.apply("Chetan"));
		System.out.println(UnaryOperator.identity());

		DoubleBinaryOperator binaryOperator2 = (a,b) -> a+b;
		System.out.println(binaryOperator2.applyAsDouble(1.1001, 2.2));
		
		LongBinaryOperator longBinaryOperator = (a,b) -> (a*b);
		System.out.println(longBinaryOperator.applyAsLong(12, 13));
	}

}
