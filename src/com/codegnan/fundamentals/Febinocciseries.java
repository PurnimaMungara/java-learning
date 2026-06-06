package com.codegnan.fundamentals;

import java.util.Scanner;

public class Febinocciseries {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		int result=1;
		int firstterm=0;
		System.out.print(firstterm+ " ");
		int secondterm=1;
		System.out.print(secondterm);
		for(int i=2;i<=number;i++) {
			int nextterm=firstterm+secondterm;
			firstterm=secondterm;
			secondterm=nextterm;
		
		System.out.print(" "+nextterm);
		}
sc.close();
}
}

