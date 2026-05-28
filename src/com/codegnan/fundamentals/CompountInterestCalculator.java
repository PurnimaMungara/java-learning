package com.codegnan.fundamentals;

import java.util.Scanner;

public class CompountInterestCalculator {

	public static void main(String[] args) {
		System.out.println("enter a prnciple");
		Scanner scanner=new Scanner(System.in);
		double principle=scanner.nextDouble();
		System.out.println("Enter a timein(years)");
		double time=scanner.nextDouble();
		System.out.println("enter a rate of interest(in%)");
		double rate=scanner.nextDouble();
		double amount=principle*Math.pow((1+rate/100),time);
		double  compoundInterest=amount-principle;
		// TODO Auto-generated method stub
		System.out.println("Amount:"+amount);
		System.out.println("compoundInterst is:"+compoundInterest);
 
	}

}
