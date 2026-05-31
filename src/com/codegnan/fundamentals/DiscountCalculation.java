package com.codegnan.fundamentals;

import java.util.Scanner;

public class DiscountCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter athe purchace amount");
		double purchaseamount=sc.nextDouble();
		double discount=(purchaseamount>100)?0.2:(purchaseamount>50)?0.1:0.0;
		double discountamount=purchaseamount*discount;
		double remainingamount=purchaseamount-discountamount;
		System.out.println(discountamount);
		System.out.println(remainingamount);
sc.close();
	}

}
