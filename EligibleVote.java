package com.codegnan.fundamentals;

import java.util.Scanner;

public class EligibleVote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter age");
   Scanner sc=new Scanner(System.in);
   int age=sc.nextInt();
  String result =(age>=18)?"Eligible to vote":"Not eligible to vote";
   System.out.println(result);
	}

}
