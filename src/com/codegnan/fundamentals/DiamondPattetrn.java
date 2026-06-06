package com.codegnan.fundamentals;

public class DiamondPattetrn {

	public static void main(String[] args) {
		
		        int number= 5; // number of rows for upper half

		        // Upper half
		        for (int i = 1; i <= number; i++) {
		            for (int j = i; j < number; j++) {
		                System.out.print(" ");
		            }
		            for (int j = 1; j <= (2 * i - 1); j++) {
		                System.out.print("*");
		            }
		            System.out.println();
		        }

		        // Lower half
		        for (int i = number - 1; i >= 1; i--) {
		            for (int j = number; j > i; j--) {
		                System.out.print(" ");
		            }
		            for (int j = 1; j <= (2 * i - 1); j++) {
		                System.out.print("*");
		            }
		            System.out.println();
		        }
		    }
		}

