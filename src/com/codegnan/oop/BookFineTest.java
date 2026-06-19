package com.codegnan.oop;

import java.util.Scanner;

public class BookFineTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int days1=sc.nextInt();
		int days2=sc.nextInt();
		String type=sc.next();
	   sc.nextLine();
	   int days3=sc.nextInt();
	   int fixedCost=sc.nextInt();
	   int id1=sc.nextInt();
	   int id2=sc.nextInt();
	   String type2=sc.next();
	BookFine book1=new BookFine(id1);
	BookFine book2=new BookFine(id2);
	System.out.println(book1.calculateFine(days1));
	System.out.println(book1.calculateFine(days2));
	System.out.println(book1.calculateFine(days3,fixedCost));
	System.out.println(book1.getId());
	System.out.println(book2.getId());
		sc.close();
 
	}

}
