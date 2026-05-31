package com.codegnan.fundamentals;

import java.util.Scanner;

public class NumberCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number");
Scanner sc=new Scanner(System.in);
double number=sc.nextDouble();
 String result=(number>0)?"Positive":(number<0)?"Negative":"zero";
 System.out.println(result);
 sc.close();

	}

}
