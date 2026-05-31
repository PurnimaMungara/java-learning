package com.codegnan.fundamentals;

import java.util.Scanner;

public class AgeGroup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter age");
       Scanner sc=new Scanner(System.in);
    	   int age=sc.nextInt();
    	  String result=(age<12)?"child":
    		  (age>=12)&&(age<19)?"teenage": "senior";
    	 System.out.println(result);
    	 sc.close();
       }
	}


