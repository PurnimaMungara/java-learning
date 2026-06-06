package com.codegnan.fundamentals;

import java.util.Scanner;

public class ElectricityTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		        int units = sc.nextInt();
		        
		        double bill= units <= 100 ? units * 2 
		                    : units <= 300 ? 100 * 2 + (units - 100) * 4
		                    : 100 * 2 + 200 * 4 + (units - 300) * 6;
		        
		        bill = units > 500 ? bill + bill * 0.05 : bill;
		        
		        System.out.println(bill);
		        sc.close();
		     
		    }

      
}


