package com.codegnan.fundamentals;

import java.util.Scanner;

public class RectangleStarpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number rows");
		int  rows=sc.nextInt();
		System.out.println("Enter no of columns");
		int colm=sc.nextInt();
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=colm;j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}    
		sc.close();

	}

}
