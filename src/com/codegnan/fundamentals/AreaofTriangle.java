package com.codegnan.fundamentals;

import java.util.Scanner;

public class AreaofTriangle {

	public static void main(String[] args) {
		System.out.println("enter a base");
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int base=scanner.nextInt();
		System.out.println("enter a height");
		int height=scanner.nextInt();
		double areaoftriangle=0.5*base*height;
		System.out.println("Area of Triangle"+areaoftriangle);
		scanner.close();
		

	}

}
