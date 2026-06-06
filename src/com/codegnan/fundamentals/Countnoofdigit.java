package com.codegnan.fundamentals;

import java.util.Scanner;

public class Countnoofdigit {
public static void main(String arg[]) {
	Scanner sc= new Scanner(System.in);
	int count=0;
	int number=sc.nextInt();
	while(number!=0) {
      number=number/10;
      count++;
	}
	System.out.println(count);
	sc.close();
}
}
