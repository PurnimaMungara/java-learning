package com.codegnan.fundamentals;

public class ReverseofNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=153;
		int originalnumber=number;
		int reversenumber=0;
		while(number!=0)
		{
		int lastdigit=number%10;
		reversenumber=reversenumber*10+lastdigit;
		number=number/10;
		
		}
		System.out.println( "Reverse of a number  is "+reversenumber);
	}

}
