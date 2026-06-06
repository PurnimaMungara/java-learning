package com.codegnan.fundamentals;

import java.util.Scanner;

public class PalindromeofNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter a number");
	  int number=sc.nextInt();
	  int originalnumber=number;
	  int reversenumber=0;
	  while(number!=0) {
		  int lastdigit=number%10;
		  reversenumber=reversenumber*10+lastdigit;
		  number=number/10;
	  }
	  if(reversenumber==originalnumber) {
		  System.out.println("  palindrome");
	  }
	  else {
		  System.out.println(" not palindrome");
		  sc.close();
		 
		  
  }
	}

}
