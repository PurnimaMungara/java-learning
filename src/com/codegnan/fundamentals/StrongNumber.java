package com.codegnan.fundamentals;

import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc=new Scanner(System.in);
   int number=sc.nextInt();
   int sum=0;
   
     while(number>0) {
    	 int product=1;
    	int lastdigit=number%10;
    	number=number/10;
    	sum+=product;
     }
	
     if(sum==number) {
    	 System.out.println("Strong number");
     }
     else {
    	 System.out.println("Not aStrong  number");
     }
      sc.close();
	}
}

