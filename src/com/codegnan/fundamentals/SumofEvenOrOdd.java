package com.codegnan.fundamentals;

import java.util.Scanner;

public class SumofEvenOrOdd {
	public static void main(String args[]) {

Scanner sc=new Scanner(System.in);
System.out.println("Enter a size");
int size=sc.nextInt();
int[] a=new int[size];
int sum=0;
int oddsum=0;
System.out.println("Enter elemnts");
for(int i=0;i<size;i++) {
	a[i]=sc.nextInt();
	if(a[i]%2==0) {
		sum+=a[i];
	}
	else  {
		oddsum+=a[i];
	
}
}
System.out.println("even sum:" +sum);
System.out.println("odd sum:" +oddsum);
sc.close();

}
	}

