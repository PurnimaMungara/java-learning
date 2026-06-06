package com.codegnan.fundamentals;

import java.util.Scanner;

public class Righttriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner sc=new Scanner(System.in);
		        System.out.println("Enter a number");
		        	int number=sc.nextInt();
		        for (int i = 1; i <= number; i++) {  //1<=5
		            for (int j = 1; j <= i; j++) { //j<=1
		                System.out.print(j + " "); //j=1 
		            }
		            for (int j = i - 1; j >= 1; j--) {
		                System.out.print(j + " ");
		            }

		            System.out.println();
		            sc.close();
		        }
		    
		
	
}
}
