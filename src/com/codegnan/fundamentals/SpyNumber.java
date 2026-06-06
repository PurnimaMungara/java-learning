package com.codegnan.fundamentals;

import java.util.Scanner;

public class SpyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int number=sc.nextInt();
		int sum=0;
		int product=1;
		while(number!=0) {
		int lastdigit=number%10;
		sum+=lastdigit;
		product*=lastdigit;
		number=number/10;
		}
		if(sum==product) {
			System.out.println("number is spy number" );
		}
		else {
			
			System.out.println("Not a spy number");
			sc.close();
		}

	}

}
