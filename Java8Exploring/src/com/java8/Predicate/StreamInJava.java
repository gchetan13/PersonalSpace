package com.java8.Predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<Integer> num =number->number%3==0;
		Stream.iterate(1,count->count+1)
		.filter(num)
		.limit(6)
		.forEach(System.out::print);
		System.out.println();
		
		List<String> alphabets= Arrays.asList("A","B","C");
		List<String> names= Arrays.asList("Chetan","Surabhi","Ani");
		Stream<String> opstream = Stream.concat(alphabets.stream(), names.stream());
		opstream.forEach(System.out::print);
		
	}

}
