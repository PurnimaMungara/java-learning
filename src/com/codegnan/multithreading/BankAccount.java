package com.codegnan.multithreading;

public class BankAccount {
private double balance;

public BankAccount(double balance) {
	super();
	this.balance = balance;
}
 public void withdraaw(String user,double amount) {
	 System.out.println(user+"trying to withdraw");
	 if(balance>=amount) {
		 System.out.println(user+"is processing withdraw1");
		 try {
			 Thread.sleep(2000);
		 } catch(InterruptedException e) {
			 e.printStackTrace();
		 }
		 balance-=amount;
		 System.out.println(user+"Complted withdraw1 remaining balance"+balance);
		 
	 } else {
		 System.out.println(user +"Insufficient balance"+balance);
	 }
	 System.out.println("----------------------------------------");
 }
}
