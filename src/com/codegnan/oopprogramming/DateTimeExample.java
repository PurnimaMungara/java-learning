package com.codegnan.oopprogramming;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

public class DateTimeExample {

	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		System.out.println("Current Date : " + date);
		LocalTime time = LocalTime.now();
		System.out.println("Current Time : " + time);
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println("Current Date and Time : " + dateTime);
		int dd = date.getDayOfMonth();
		int mm = date.getMonthValue();
		int yyyy = date.getYear();
		System.out.println("Day : " + dd);
		System.out.println("Month : " + mm);
		System.out.println("Year : " + yyyy);
		int h = time.getHour();
		int m = time.getMinute();
		int s = time.getSecond();
		System.out.println("Hour : " + h);
		System.out.println("Minute : " + m);
		System.out.println("Second : " + s);
		
		System.out.println("After 6 months : " + date.plusMonths(6));
		System.out.println("Before 8 months : " + date.minusMonths(8));
		
		//creating a new date 
		LocalDateTime dt = LocalDateTime.of(2000, 5 /*Month.MAY*/, 23,11,11,15);
		System.out.println("New Date and Time : " + dt);
		
		ZoneId zone = ZoneId.systemDefault();
		System.out.println(zone);
		
		ZoneId la = ZoneId.of("America/Los_Angeles");
		ZonedDateTime zt = ZonedDateTime.now(la);
		System.out.println("Zoned Date Time " + zt);
		
		LocalDate today = LocalDate.of(2000, 5, 23);
		LocalDate birthDay = LocalDate.of(2000, 5, 23);
		Period p = Period.between(birthDay,today);
		System.out.println(p);
		System.out.printf("Age is %d years, %d month and %d days.%n", p.getYears(), p.getMonths(), p.getDays());
		
		Date obj = new Date();
		System.out.println(obj.toString());
		
		SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
		String date1 = format.format(obj);
		System.out.println(date1);
		
		format = new SimpleDateFormat("dd MMM yyyy EEEE");
		date1 = format.format(obj);
		System.out.println(date1);
	}

}