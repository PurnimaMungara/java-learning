package com.codegnan.fundamentals;

import java.util.Scanner;

public class BalanceAmount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner sc=new Scanner(System.in);
 int Balance=sc.nextInt();
 int DepositeAmout=sc.nextInt();
 Balance+=DepositeAmout;
  boolean isEvenGreter=(Balance>1000)&&(Balance%2==0);
     System.out.println(Balance);
     System.out.println(isEvenGreter);
     
	}

}
