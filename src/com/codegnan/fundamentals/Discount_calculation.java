package com.codegnan.fundamentals;

import java.util.Scanner;

public class Discount_calculation {
   public static void main(String args[]) {
	   System.out.println("Enter a shopping amount");
	   Scanner sc=new Scanner(System.in);
	   double amount=sc.nextInt();
	  double result= (amount>=1000)?amount*0.20:(amount>=500)?amount*10:0.0;
	  double finalamount=amount-result;
	   System.out.println(result);
	   System.out.println(finalamount);
	   sc.close();
   }
}
