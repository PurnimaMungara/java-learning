package com.codegnan.fundamentals;

import java.util.Scanner;

public class RightPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter a number");
     int rows=sc.nextInt();
		for(int i=1;i<=rows;i++) {
    	 for(int j=1;j<=i;j++) {
    		 System.out.print("*");
    	 }
    	 System.out.println(" ");
     }
	}

}
