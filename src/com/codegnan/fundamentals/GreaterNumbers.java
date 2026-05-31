package com.codegnan.fundamentals;

import java.util.Scanner;

public class GreaterNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter  FirstNumber");
 Scanner sc =new Scanner (System.in);
 int Firstnumber=sc.nextInt();
 System.out.println("Enter a secondNumber");
 int Secondnumber=sc.nextInt();
 int result=(Firstnumber>Secondnumber?Firstnumber:Secondnumber);
 System.out.println(result);
 sc.close();
	}

}
