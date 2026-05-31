package com.codegnan.fundamentals;

import java.util.Scanner;

public class workCompletionDaysCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter days taken by A and B");
	   int AB=sc.nextInt();
	   System.out.println("Enter days taken by B and C");
	   int BC=sc.nextInt();
	   System.out.println("Enter days taken by A and C");
	   int AC=sc.nextInt();
	   
	   int total=(2*AB*BC*AC)/(BC*AC+AB*AC+AB*BC);
	   System.out.println("All Three Can Complete Work In" + total);
sc.close();
	}

}
