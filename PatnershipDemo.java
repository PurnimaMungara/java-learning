package com.codegnan.fundamentals;

import java.util.Scanner;

public class PatnershipDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int InvestmentA=sc.nextInt();
		int monthA=sc.nextInt();
		int InvestmentB=sc.nextInt();
		int joinedAftermonthsofA=sc.nextInt();
		int profit=sc.nextInt();
		int effectiveA= InvestmentA*monthA;
		int monthB=12-joinedAftermonthsofA;
	    int effectiveB=effectiveA+monthB;
	    int totalRatio=effectiveA+effectiveB;
	    double bshare=((double)effectiveA/totalRatio)*profit;
	    System.out.println("B share:"+bshare);
	    sc.close();
		
		

	}

}
