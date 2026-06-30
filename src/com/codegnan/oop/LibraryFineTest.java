package com.codegnan.oop;

import java.util.Scanner;

public class LibraryFineTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int daysOverdue=sc.nextInt();
int days=sc.nextInt();
sc.next();
String bookType=sc.nextLine();
int staticfine=LibraryFineCalculator.calculateTotalFine(daysOverdue);
LibraryFineCalculator caluculator=new LibraryFineCalculator();
int instanceFine=caluculator.calculateBookFine(days,bookType);
System.out.println(staticfine+" "+instanceFine);
sc.close();
	}

}
