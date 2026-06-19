package com.codegnan.oop;
public class BankAcc {
	double balance;
	public BankAcc(double balance) {
		this.balance=balance;
	}
	public void deposite (double amount) {
		balance+=amount;
		System.out.println( "Depositeed cash:" +amount);
	}
	public void deposite(double amount,String chequeNumber) {
		balance+=amount;
		System.out.println("Deposite:"+amount+"via cheque"+chequeNumber);
	}
public void deposite(double amount,String transactionId,String bankname) {
	balance+=amount;
	System.out.println("Deposite "+amount+"via online transfer");
	System.out.println("Transaction Id"+transactionId+"Bank:"+ bankname);
}
public void showBalance() {
	System.out.println("current Balance" +balance);
}
public static void main(String args[]) {
	BankAcc acc=new BankAcc(5000.0);
	acc.deposite(2000);
	acc.deposite(12000,"chswqq2");
	acc.deposite(3000,"ertyuioiuyt","HDFC");
	acc.showBalance();
}
}
