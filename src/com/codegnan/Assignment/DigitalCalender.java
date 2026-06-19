package com.codegnan.Assignment;

import java.util.Scanner;

public class DigitalCalender {

	public static void maivbbn(String[] args) {

		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();

		switch (number) { 
		
		case 1:
			System.out.println("Sunday");
			break;
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("Tuesday");
			break;
		case 4:
			System.out.println("Wednesday");
			break;
		case 5:
			System.out.println("Thursday");
			break;
		case 6:
			System.out.println("Friday");
			break;
		case 7:
			System.out.println("Saturday");
			break;
		default:
			System.out.println("Please provide a day number between 1 and 7");
		}

		sc.close();
	}
}