package com.java8.date;

import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDateTime dateTime = LocalDateTime.now();
		LocalDateTime dateTime2 = LocalDateTime.of(LocalDate.now(), LocalTime.now());
		System.out.println(dateTime);
		System.out.println(dateTime2);
		System.out.println(dateTime.equals(dateTime2));
		System.out.println("LocalDateTime.MAX "+LocalDateTime.MAX);
		System.out.println("LocalDateTime.MIN "+LocalDateTime.MIN);
		System.out.println("Clock.systemUTC() "+LocalDateTime.now(Clock.systemUTC()));
		System.out.println(LocalDateTime.parse(LocalDateTime.now().toString(), DateTimeFormatter.ISO_DATE_TIME));
	}

}
