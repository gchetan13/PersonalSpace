package com.java8.Predicate;

import java.util.function.BiPredicate;
import java.util.function.DoublePredicate;
import java.util.function.IntPredicate;
import java.util.function.LongPredicate;
import java.util.function.Predicate;

public class PredicateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BiPredicate<String, String> biPredicate = (a,b) -> a.equals(b);
		System.out.println(biPredicate.test("Chetan", "Chetan"));
		
		
		Predicate<String> name = (q) -> (q.contains("Chetan"));
		System.out.println(name.test("Hi Chetan Gupta"));
		

		Predicate<String> from = (q) -> (q.contains("Shujalpur"));
		System.out.println("And Predicate "+name.and(from).test("Chetan from Shujalpur"));
		System.out.println("Or Predicate "+name.or(from).test(" from Shujalpur"));
		
		IntPredicate intPredicate = (marks) -> (marks>70);
		
		
		LongPredicate longPredicate = (a)->(a==11);
		System.out.println(longPredicate.negate().test(11));
		
		DoublePredicate doublePredicate = (a) -> (a==1.11);
		System.out.println(doublePredicate.test(1.11));
		
	}

}
