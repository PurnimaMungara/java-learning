package com.codegnan.fundamentals;

import java.util.Scanner;

public class WarehouseManagerCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		double price=sc.nextDouble();
		double quantity=sc.nextDouble();
		double budget=sc.nextDouble();
		double totalbasecost=price*quantity;
		double tax=totalbasecost*0.1;
		double finalCost=totalbasecost+tax;
		boolean isfinalbuget=(totalbasecost<=budget) &&(quantity>=1);
		System.out.println(totalbasecost);
		System.out.println(isfinalbuget);
		System.out.println(finalCost);
		sc.close();

	}

}
