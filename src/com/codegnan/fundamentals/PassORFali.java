package com.codegnan.fundamentals;

import java.util.Scanner;

public class PassORFali {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter marks");
		Scanner sc=new Scanner(System.in);
		int marks=sc.nextInt();
		String result=(marks>35?"pass":"fail");
        System.out.println(result);
        sc.close();
	}

}
