package com.codegnan.fundamentals;

import java.util.Scanner;

public class AtmOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		double balance=5000;
		int pin =1234;
		int enterpin;
		System.out.println("enter pin");
		enterpin=sc.nextInt();  
		if(pin==enterpin) {
			System.out.println("Successfully");
		}
		else {
			if(pin!=enterpin) {
				System.out.println("Invalid");
				return;
			}
		}
		int choice;
		do {
			System.out.println("===========================");
			System.out.println("1.check balance");
			System.out.println("2.withdraw Amount");
			System.out.println("3.deposite");
			System.out.println("4.exit");
		System.out.println("Enter choice");	
	   choice=sc.nextInt();
	switch(choice)
	{
	case 1:
		System.out.println(" your balance is "+ balance);
	break;
	case 2:
		System.out.println("enter withdrawamount");
		int withdrawamount=sc.nextInt();
		if(withdrawamount%100!=0) {
			System.out.println("please enter multiples of 100");
		}
			else {
				balance-=withdrawamount;
				System.out.println("Successfully"+balance);
			}
			break;
		
		
	case 3:
		System.out.println("enter a deposite");
		int depositeamount=sc.nextInt();
		if(depositeamount%100!=0) {
			System.out.println("please enter multiples of 100");}
		else {
			if(balance<500) {
				System.out.println("Your balance is low");
			}
		
		else {
			
			balance+=depositeamount;
			System.out.println("Deposite succcefully"+balance);
			break;
		}
		}
	case 4:
		System.out.println("existing thank you");
		break;
	
	
		default:
			System.out.println("Invalid choice");
			break;
	
		}
		}		
  while(choice!=4) ;
		sc.close();
		}
}


	

	






