package com.codegnan.Test;

import java.util.Scanner;

public class SpyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int number=sc.nextInt();
int sum=0;
int product=1;
while(number>0) {
	int digit=number%10;
	sum+=digit;
	product*=digit;
	number=number/10;
	
}
if(sum==product) {
	System.out.println("Spy number");
}
else {
	System.out.println("Not number");
}
	sc.close();
	}
}
