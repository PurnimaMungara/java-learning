package com.codegnan.fundamentals;

import java.util.Scanner;

public class ShopkeeperCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub1
Scanner sc=new Scanner(System.in);
int initialprice=sc.nextInt();
int discountamount=sc.nextInt();
int surchargeamount=sc.nextInt();
int targetburget=sc.nextInt();
initialprice-=discountamount;
initialprice+=surchargeamount;
 boolean finalprice=(initialprice>0)&&(initialprice>targetburget);
 System.out.println(initialprice);
 System.out.println(finalprice);
 sc.close();
	}

}
