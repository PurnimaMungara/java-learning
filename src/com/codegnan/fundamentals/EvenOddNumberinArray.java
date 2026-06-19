package com.codegnan.fundamentals;

import java.util.Scanner;

public class EvenOddNumberinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in) ;
    	 int size=sc.nextInt();
    	 int[] a=new int[size];
    	 for(int i=0;i<size;i++) {
    		 a[i]=sc.nextInt();
    	 }
    	 System.out.println("even number");
    	 for(int i=0;i<size;i++) {
    		 if(a[i]%2==0) {
    			 System.out.println(a[i]+" ");
    		 }
    	 }
    		 System.out.println();
    	 
    	 System.out.println("odd number");
    		 for(int i=0;i<size;i++) {
    			 if(a[i]%2!=0) {
    			 System.out.println(a[i] +" ");
    		 }
    		 }
    	 sc.close();
    	 
     }
	

}
