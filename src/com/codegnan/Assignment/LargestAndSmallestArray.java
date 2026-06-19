package com.codegnan.Assignment;

import java.util.Scanner;

public class LargestAndSmallestArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int arr[]=new int[N];
		for(int i=0;i<N;i++) {
		 arr[i]=sc.nextInt();
		
		int largest=arr[0];
		int smallest=arr[0];
			if(arr[i]>largest) {
				largest=arr[i];
			}
			else {
                   if(arr[i]<smallest) {
                	   smallest=arr[i];
                   }
			}
			System.out.println(largest);
			System.out.println(smallest);
		
		}
		sc.close();
		// TODO Auto-generated method stub

	}

}
