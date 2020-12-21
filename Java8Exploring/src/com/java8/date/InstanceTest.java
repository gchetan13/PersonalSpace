package com.java8.date;

import java.time.Instant;

public class InstanceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Instant.now());
		System.out.println(Instant.ofEpochMilli(Instant.now().toEpochMilli()));
		
	}

}
