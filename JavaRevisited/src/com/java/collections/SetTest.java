package com.java.collections;

import java.util.HashSet;
import java.util.Set;

public class SetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> integers = new HashSet<Integer>();
		integers.add(10);
		integers.add(null);
		integers.add(10);
		integers.add(12);
		System.out.println(integers);
	}

}
