package com.codegnan.Test;

import java.util.Scanner;

public class NeonNumberTest2 {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	int number=sc.nextInt();
	int square=number*number;
	int sum=0;
	while(square>0) {
		
		int digit=square%10;
		sum+=digit;
		square=square/10;
	}
	if(number==sum) {
		System.out.println("Neon Number");
	}
	else {
		System.out.println("Not neon number");
	}
	sc.close();
}
}
