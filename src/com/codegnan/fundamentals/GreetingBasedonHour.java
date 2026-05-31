package com.codegnan.fundamentals;

import java.util.Scanner;

public class GreetingBasedonHour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a Hour");
Scanner sc=new Scanner(System.in);
int Hour=sc.nextInt();
 String result=(Hour>=5 && Hour<12)?"Good Morning":
	 (Hour>=12 && Hour<17)?"Good Afternoon":
		 (Hour>=17 &&Hour<22)?"Good Evening":"Good Night";
System.out.println(result);
sc.close();
	}

}
