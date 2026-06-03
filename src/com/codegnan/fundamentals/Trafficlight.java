package com.codegnan.fundamentals;

import java.util.Scanner;

public class Trafficlight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a light");
		String light=sc.nextLine();
		System.out.println("Enter a number");
		if(light=="red") {
			System.out.println("slow");
		}
		else if(light=="green") {
			System.out.println("GO");
		}
		else if(light=="yellow") {
			
		}
		
		
		

	}

}
