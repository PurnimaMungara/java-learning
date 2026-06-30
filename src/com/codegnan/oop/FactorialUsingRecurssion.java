package com.codegnan.oop;

import java.util.Scanner;


public class FactorialUsingRecurssion{
public  static long Factorial(int n) {
	if(n==0) {
		return 1;
	}
		else {
			return n*Factorial(n-1);
		}
	
	}
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	if(n<0||n>20) {
		System.out.println("Invalid");
	}
	else {
		long result=Factorial(n);
		System.out.println(result);
		sc.close();
	}
		
	}
}