package com.codegnan.fundamentals;

import java.util.Scanner;

public class SimpleInterestCaluculator {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter principle amount");
		double principle =scanner.nextDouble();
		System.out.println("ener timein(years)");
		double time=scanner.nextDouble();
		System.out.println("Enter rate in (%)");
		double rate=scanner.nextDouble();
		double si=(principle*rate*time)/100;
		double total_amount=si+principle;
		System.out.println("simple inter"+si);
		System.out.println("total_amount"+total_amount);
		scanner.close();
	}

}
