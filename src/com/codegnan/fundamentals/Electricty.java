package com.codegnan.fundamentals;

import java.util.Scanner;

public class Electricty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner sc=new Scanner (System.in);
 int  units=sc.nextInt();
 System.out.println("Are you senior citizen"?(true/false):");
 		boolean isSeniorCitizen=sc.nextBoolean();
       double   billAmount=0;
       if (units<=100) {
    	   billAmount =units*0.5;
       }
       else {
    	   if(units>=200) {
    		   billAmount =units(100*1.5)+((units-100)*2);
    	   }
    	   else {
    		   if(units>=300) {
    			   billAmount=units(100*1.5)=((100*2)+(100*3)+(units-200)*5);
    		   }
    		   else
                    billamount=(100*1.5)+(100*2)+(100*3)+(units-300)*5;
	}

}
	}
}
