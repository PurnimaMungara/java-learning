package com.codegnan.Assignment;

import java.util.Scanner;

public class TrafficCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner sc=new Scanner(System.in);
 int Display=sc.nextInt();
 switch(Display) {
 case 1:
	 System.out.println("stop");
	 break;
 case 2:
	 System.out.println("Get Ready");
	 break;
 case 3:
	 System.out.println("Go");
	 default:
		 System.out.println("Invalid Mmessage");
 
 }
 sc.close();
	}

}
