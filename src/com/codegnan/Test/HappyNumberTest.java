package com.codegnan.Test;

import java.util.Scanner;

public class HappyNumberTest {

	public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	int number=sc.nextInt();
	int originalnumber=number;
	while(number!=1 && number!=4) {
		int sum=0;
		while(number>0) {

			int digit =number%10;
			sum+=digit*digit;
			number=number/10;
		}
		number=sum;
	}
	if(number==1) {
		System.out.println( originalnumber +"is Happy Number");
	}
	else {
		System.out.println(originalnumber+"is not Happy Number");
	}
	sc.close();
	}

}
