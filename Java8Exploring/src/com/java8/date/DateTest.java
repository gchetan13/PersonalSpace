package com.java8.date;

import java.text.DateFormat;
import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAccessor;
import java.util.Locale;

public class DateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate dateToday = LocalDate.now();
		LocalDate dateof = LocalDate.of(-2011, 10, 13);
		LocalDate dateof1 = LocalDate.of(2000, Month.FEBRUARY, 23);
		LocalDate dateof2 = LocalDate.ofYearDay(2001, 231);
		LocalDate datefromclock= LocalDate.now(Clock.systemUTC());
		LocalDate parsedate = LocalDate.parse("2019-11-02");	
		LocalDate parsedateformatter = LocalDate.parse("September 12, 2019", DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));
		LocalDate parsedateformatterofpattern = LocalDate.parse("118/2019", DateTimeFormatter.ofPattern("D/yyyy"));
		LocalDate parsedateformatterofpattern1 = LocalDate.parse("02/12/2018", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		LocalDate parsedateformatterofpattern2 = LocalDate.parse("02-12-2018", DateTimeFormatter.ofPattern("dd-MM-yyyy", Locale.getDefault()));
		LocalDate parsedateformatterofpattern3 = LocalDate.parse("Feb 12, 2019", DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
		LocalDateTime dateTime = dateToday.atStartOfDay();
		System.out.println("dateToday "+dateToday);
		System.out.println("date "+dateof);
		System.out.println("date1 "+dateof1);
		System.out.println("date2 "+dateof2);
		System.out.println("dateTime " +dateTime);
		System.out.println("datefromclock "+datefromclock);
		System.out.println("parse date "+parsedate);
		System.out.println("parsedateformatter "+parsedateformatter);
		System.out.println("parsedateformatterofpattern "+parsedateformatterofpattern.format(DateTimeFormatter.ISO_DATE));
		System.out.println("parsedateformatterofpattern "+parsedateformatterofpattern1.format(DateTimeFormatter.BASIC_ISO_DATE));
		System.out.println("parsedateformatterofpattern "+parsedateformatterofpattern2.format(DateTimeFormatter.ISO_LOCAL_DATE));
		System.out.println("parsedateformatterofpattern "+parsedateformatterofpattern3.format(DateTimeFormatter.ISO_ORDINAL_DATE));
	System.out.println(parsedate.getMonth().getValue());
		//	System.out.println(parsedate.format(DateTimeFormatter.ofPattern("DD//MM//yyyy")));
	
	DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy/D");
	LocalDate date11 = LocalDate.now();
	date11.format(dateTimeFormatter);
	System.out.println(dateTimeFormatter.getZone());
	System.out.println(dateTimeFormatter.getLocale());
	//System.out.println(dateTimeFormatter.parse(""));
	
	System.out.println("dateof.plusDays(10) "+dateof.plusDays(10));
	System.out.println("dateof1.minusDays(12) "+dateof1.minusDays(12));
	System.out.println("dateof2.plusMonths(1) "+dateof2.plusMonths(1));
	System.out.println("date11.getDayOfMonth() "+date11.getDayOfMonth());
	System.out.println("dateof.getMonth() "+dateof.getMonth());
	System.out.println("datefromclock.toEpochDay() "+datefromclock.toEpochDay());
	System.out.println("date11.isAfter(dateof1) "+date11.isAfter(dateof1));
	System.out.println("dateof2.isBefore(date11) "+date11.isBefore(dateof2));
	System.out.println("dateof.isEqual(datefromclock)"+dateToday.isEqual(datefromclock));
	System.out.println("dateof.getEra() "+dateof.getEra());
	System.out.println("dateof1.withMonth(Month.APRIL.getValue()) "+dateof1.withMonth(Month.APRIL.getValue()));
	
	Period period = Period.ofDays(10).minusDays(2).plusMonths(2);
	System.out.println(period.getDays());
	System.out.println(period.getMonths());
	System.out.println(period.getYears());
	System.out.println(period.getChronology());
	System.out.println(period.getUnits());
	
	}

}
