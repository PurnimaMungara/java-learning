package com.codegnan.fundamentals;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int Year=sc.nextInt();
 String result=((Year%4==0)&&(Year%400==0)||(Year%100!=0))?"LeapYear":"Not LeapYear";
 System.out.println(result);
 sc.close();
	}
}
