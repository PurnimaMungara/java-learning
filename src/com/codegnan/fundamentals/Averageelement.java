package com.codegnan.fundamentals;

import java.util.Scanner;

public class Averageelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int[] a=new int[size];
         for(int i=0;i<size;i++) {
        	 a[i]=sc.nextInt();
         }
         int sum=0;
         for(int i=0;i<size;i++) {
         sum+=a[i];
         }
         double avg=sum/size;
         System.out.println(avg);
				sc.close();
		}

	}


