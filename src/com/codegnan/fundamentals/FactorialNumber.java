package com.codegnan.fundamentals;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int number=sc.nextInt();
		int result=1;
		for(int i=1;i<=number;i++) {
			result*=i;
		}
		System.out.println("number");
		sc.close();

	}

}
