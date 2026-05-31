package com.codegnan.fundamentals;

import java.util.Scanner;

public class TemperatureConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a celsius");
		Scanner scanner=new Scanner(System.in);
		double celsius=scanner.nextDouble();
		double fahrenheit=(celsius*9/5+32);//convert celsius to fahrenheit
		System.out.println("Convertion from celsius to fahrenheit"+fahrenheit);
		scanner.close();

	}

}
