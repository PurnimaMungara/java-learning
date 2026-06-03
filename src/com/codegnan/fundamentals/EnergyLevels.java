package com.codegnan.fundamentals;

import java.util.Scanner;

public class EnergyLevels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		if(sc.hasNextInt()){
			int s=sc.nextInt();
			int n=sc.nextInt();
			int k=sc.nextInt();
			int m=sc.nextInt();
			int totalSum=0;
			int proceedCount=0;
			for(int i=s;proceedCount<n;i++) {
				if(i%k==0) {
					continue;
				}
				totalSum+=i;
				proceedCount++;
				if(totalSum>=m) {
					break;
				}
			}
			System.out.println(totalSum);
		}
		sc.close();

	}

}
