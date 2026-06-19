package com.codegnan.Test;

import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int number=sc.nextInt();
int originalnumber=number;
int sum=0;
while(number>0) {
	int digit=number%10;
	int product=1;
	
	for(int i=1;i<=digit;i++) {
		product*=i;
	}
	sum+=product;
	number/=10;
}
if(originalnumber==sum) {
System.out.println("Number is a Strong number");
}
else {
	System.out.println("not a Strong Number");
}
sc.close();
	}

}
