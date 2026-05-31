package com.codegnan.fundamentals;

import java.util.Scanner;

public class Temperatureclassification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a temperature");
		Scanner sc=new Scanner(System.in);
         int temperature=sc.nextInt();
       String result=  temperature>30?"Hot":
    	   temperature>15 && temperature<30?"Moderate":"Cold";
       System.out.println(result);
       sc.close();
	}

}
