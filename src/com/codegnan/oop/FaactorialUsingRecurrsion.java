package com.codegnan.oop;

import java.util.Scanner;

public class FaactorialUsingRecurrsion {
	public static long factorial(int n) {
		if(n==0) {
			return 1;
		}
		else {
			return n*factorial(n-1);
		}
	}

public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	if(n<0||n>20) {
		System.out.println("Invalid Input . n must be between 0 and 20");
	}
	else {
		long result=factorial(n);
		System.out.println(result);
	}
}
}
