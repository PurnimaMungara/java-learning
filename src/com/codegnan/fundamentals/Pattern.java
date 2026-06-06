package com.codegnan.fundamentals;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        int n= 5;
		        int num= 1;

		        for (int i = 1; i <= n; i++) { //2<5
		            for (int j = 1; j <= i; j++) {  //2<=1
		                System.out.print(num + " "); 
		                num++;
		            }
		            System.out.println();
		        }
		    }
		}
	
