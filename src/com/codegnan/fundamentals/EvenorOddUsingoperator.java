package com.codegnan.fundamentals;

import java.util.Scanner;

public class EvenorOddUsingoperator {
	public static void main (String args[]) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter a number");
		int number=sc.nextInt();
		String result=(number%2==0)?"Even":"Odd";
		System.out.println(result);
		sc.close();
		
	}

}
