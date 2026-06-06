package com.codegnan.fundamentals;

import java.util.Scanner;

public class NeonNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		int sum=0;
		int square=number*number;
		while(square!=0) {
		int largedigit=square%10;
		sum+=square;
		square=square/10;
		}
		System.out.println(square);
		if(sum==number) {
			System.out.println("Number is neon");
		}
		else {
			System.out.println("Number is not neon number");
		}
		sc.close();
		
		
		

	}

}
