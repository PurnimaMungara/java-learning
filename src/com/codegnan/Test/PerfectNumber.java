package com.codegnan.Test;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner  sc=new Scanner(System.in);
int number=sc.nextInt();
int sum=0;
for(int i=1;i<number;i++) {
	if(number%i==0) {
		sum+=i;
	}
}
if(number==sum)
{
	System.out.println("Perfect Number");
	}
else {
	System.out.println("not a perfect number");
}
sc.close();
	}
}
