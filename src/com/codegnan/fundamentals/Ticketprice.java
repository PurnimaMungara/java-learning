package com.codegnan.fundamentals;

import java.util.Scanner;

public class Ticketprice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		double basedPrice=5000;
		double basePrice=basedPrice;
		System.out.println("Enter PassengetType (child/adult/senior) ");
		String passengerType=scanner.nextLine().toLowerCase();
		System.out.println("Enter Booking Time(early/normal/last-minute) : ");
		String bookingTime=scanner.nextLine().toLowerCase();
		System.out.println("Are You Member?(true/false)");
		boolean isMember=scanner.nextBoolean();
		if(passengerType.equals("child")) {
			basePrice*=0.5;
		}else {
			if(passengerType.equals("senior")) {
				basePrice*=0.8;
			}else {
				if(passengerType.equals("adult")) {
				}else {
					System.out.println("Invalid Passenger Type");
					scanner.close();
					return;
				}
			}
		}
		if(bookingTime.equals("early")) {
			basePrice*=0.9;
		}else {
			if(bookingTime.equals("normal")) {
			}else {
				if(bookingTime.equals("last-minute")) {
					basePrice*=1.2;
				}else {
					System.out.println("Invalid Booking Time");
					scanner.close();
					return;
				}
			}
		}
		if(isMember) {
			basePrice*=0.95;
		}
		System.out.println("Passenger Details");
		System.out.println("-----------------------------");
		System.out.println("Ticket BasePrice : "+basedPrice);
		System.out.println("Passenger Type : "+passengerType);
		System.out.println("Booking Time : "+bookingTime);
		System.out.println("Is Member : "+isMember);
		System.out.println("Ticket Final Price : "+basePrice);
		scanner.close();

	}

}