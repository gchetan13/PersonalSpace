package com.java8.date;

import java.time.Clock;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class TimeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalTime time = LocalTime.now();
		LocalTime timefromNano = LocalTime.ofNanoOfDay(412132121212l);
		System.out.println(time);
		System.out.println(timefromNano);
		System.out.println("now from Kolkata"+LocalTime.now(ZoneId.of("Asia/Kolkata")));
		System.out.println("LocalTime.of "+LocalTime.of(12, 59, 58, 121231231));
		System.out.println("Time from clock "+LocalTime.now(Clock.systemDefaultZone()));
		System.out.println("LocalTime.MAX = "+LocalTime.MAX);
		System.out.println("LocalTime.MIN = "+LocalTime.MIN);
		System.out.println("LocalTime.MIDNIGHT = "+LocalTime.MIDNIGHT);
		System.out.println("LocalTime.NOON = "+LocalTime.NOON);
		System.out.println(LocalTime.parse("23:59", DateTimeFormatter.ISO_LOCAL_TIME));
		System.out.println(LocalTime.parse("23:59+01:01", DateTimeFormatter.ISO_OFFSET_TIME));
		System.out.println(LocalTime.parse("23:59", DateTimeFormatter.ISO_TIME));
		System.out.println(LocalTime.parse("59:59:01", DateTimeFormatter.ofPattern("ss:mm:HH")));
		System.out.println(LocalTime.parse("23:59:59"));
		
		
		System.out.println(time.isAfter(timefromNano));
		
	}

}
