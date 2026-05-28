package com.codegnan.fundamentals;

import java.util.Scanner;

public class TemperatureConvertFahrenheit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Enter a Fahrenheit");
Scanner scanner=new Scanner(System.in);
double fahrenheit=scanner.nextDouble();
double celsius=(fahrenheit-32*5/9);
System.out.println("convert from fahrenheit to celsius"+celsius);
	}

}
