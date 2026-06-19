package com.codegnan.oopprogramming;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;

public class DateTimeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 LocalDate date=LocalDate.now();
 System.out.println("Current Dae:"+date);
 LocalTime time=LocalTime.now();
 System.out.println(time);
 LocalDateTime datetime=LocalDateTime.now();
 System.out.println("Current date and time"+datetime);
 int dd=date.getDayOfMonth();
 int MM=date.getMonthValue();
 int yyy=date.getDayOfYear();
 System.out.println("Day"+dd);
 System.out.println("month"+MM);
 System.out.println("year"+yyy);
 int hh=time.getHour();
 int m=time.getMinute();
 int second=time.getSecond();
 System.out.println("HOUR"+hh);
 System.out.println("minute"+m);
 System.out.println("second"+second);
 System.out.println("after 6 months"+date.plusMonths(6));
 System.out.println("Before 6 months"+date.minusMonths(8));
 
 //creating  a new date local
LocalDateTime dt=LocalDate.of(2000,Month.June,23,24,25,26);
 System.out.println("Localdatetime"+dt);
 ZoneId zone=ZoneId.systemDefault();
 System.err.println(zone);
 ZoneId la=ZoneId.of("America");
 ZonedDateTime zt=ZoneDateTime.now(la);
 System.out.println("Zone Date Time" +zt);
 LocalDate today=LocalDate.now();
 LocalDate birthday=LocalDate.of(2005, 5, 23);
 Period p=Period.between(birthDay, today);
 System.out.println(p);
 System.out.printf("Age",
 p.getYears(),p.getMonths(),p.getDays());
	}
Date obj=new Date();

SimpleDateFormat format=new SimpleDateFormat("yyy/MM/dd");
Sysout.out.println(date1);
format=new SimpleDateFormat("dd MMM yyy EEE");
date2=format.format(obj);
System.out.println(date1);
}
