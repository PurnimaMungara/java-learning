package com.codegnan.fundamentals;

import java.util.Scanner;

public class WaterUsageAdjustment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		
		int noOfStations=sc.nextInt();
		int noOfQueries=sc.nextInt();
		int[] waterUsage=new int[noOfStations];
		for(int i=0;i<noOfStations;i++) {
			waterUsage[i]=sc.nextInt();
		}
 for(int i=0;i<noOfQueries;i++) {
	 int startStation=sc.nextInt();
	 int endStation=sc.nextInt();
	 int adjustment=sc.nextInt();
	 for(int j=startStation-1;j<endStation;j++) {
		   waterUsage[j]+=adjustment;
		   if(waterUsage[j]<0) {
			   waterUsage[j]=0;
		   }
	 }
 }
 for(int i=0;i<noOfStations;i++) {
	 if(i<noOfStations-1) {
		 System.out.println(" ");
	 }
	 
 }
 sc.close();
	}

}
