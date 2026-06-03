package com.codegnan.fundamentals;

import java.util.Scanner;

public class Countnoofdigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Ente a number");
		int a=sc.nextInt();
		int count=0;
		while(a!=0) {
			a=a/10;
			count++;
		}
		System.out.println(count);
sc.close();
	}

}
