package com.codegnan.fundamentals;

import java.util.Scanner;

public class DairycompanyCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter a Initial Milk Ratio");
double m1=sc.nextDouble();
System.out.println("Enter a Initial Water Ratio");
double w1=sc.nextInt();
System.out.println("Enter a Quantity of Mixture Replaced");
double Q=sc.nextDouble();
System.out.println("Enter a Final Milk ratio");
double m2=sc.nextDouble();
System.out.println("Enter a Final Water Ratio");
double w2=sc.nextDouble();
double FinalmilkFraction=m2/(m2+w2);
double capacity=Q/(1-FinalmilkFraction/FinalmilkFraction);
System.out.println(capacity);
sc.close();



	}

}
