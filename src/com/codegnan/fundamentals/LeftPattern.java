package com.codegnan.fundamentals;

public class LeftPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        int n = 3;
		        int num = 1;
		        for (int i = 1; i <= n; i++) {
		            for (int j = i; j < n; j++) {
		                System.out.print("  ");
		            }
		            for (int j = 1; j <= (2 * i - 1); j++) {
		                System.out.print(num + " ");
		                num++;
		            }

		            System.out.println();
		        }
		    }
		}

