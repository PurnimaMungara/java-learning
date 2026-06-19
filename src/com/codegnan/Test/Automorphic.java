package com.codegnan.Test;

import java.util.Scanner;

public class Automorphic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner (System.in);
int number=sc.nextInt();
int digit=0;
int square=number*number;
int originalNumber=number;
while(number>0) {
	digit++;
	number=number/10;
}
int product=1;
for(int i=1;i<=digit;i++)
{
	product*=10;
}
if(square%product==originalNumber) {
	System.out.println("Auto morphic number");
}
else {
	System.out.println("not automorphic");
}
	}

}
