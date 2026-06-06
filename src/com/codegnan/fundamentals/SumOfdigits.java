package com.codegnan.fundamentals;

import java.util.Scanner;

public class SumOfdigits {
	public static void main(String args[]) {

 Scanner sc=new Scanner(System.in);
 System.out.println("Enter a number"); 
int number=sc.nextInt();
int digitsum=0;
int originalnumber=number;
while(number!=0) {
int lastdigit=number%10;
digitsum+=lastdigit;
number=number/10;
	}
System.out.println("Sum of digit" + originalnumber + " is "+ digitsum);
sc.close();
}
}
	// TODO Auto-generated method stub


