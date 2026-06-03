package com.codegnan.fundamentals;

import java.util.Scanner;

public class Febinocciseries {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int number=sc.nextInt();
		int firstterm=0;
		int second=1;
		System.out.println("fibinacciseries");
		System.out.print(firstterm +" "  +second+" ");
		for(int i=2;i<number;i++) {
			int nextterm=firstterm+second;
			System.out.print(nextterm + " ");
			firstterm=second;
			second=nextterm;
		}
		
		sc.close();
		// TODO Auto-generated method stub

	}

}
