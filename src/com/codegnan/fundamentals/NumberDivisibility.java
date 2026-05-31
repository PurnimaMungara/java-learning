package com.codegnan.fundamentals;

import java.util.Scanner;

public class NumberDivisibility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc=new Scanner (System.in);
         System.out.println("Enter a number");
         int number=sc.nextInt();
         String result=(number%3==0)&&(number%5==0)?
        	 "Divisibility by 3 and 5":"Not possible";
         System.out.println(result);
                 sc.close();
	}

}
