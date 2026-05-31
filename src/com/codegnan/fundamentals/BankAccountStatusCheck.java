package com.codegnan.fundamentals;

import java.util.Scanner;

public class BankAccountStatusCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter balance");
Scanner sc=new Scanner(System.in);
double balance=sc.nextDouble();
String result=(balance>=1000)?"Good Standing":(balance>=500)?"Low Balance":"Account overLoad";
System.out.println("account balance Status:"+result);
sc.close();
	}

}
