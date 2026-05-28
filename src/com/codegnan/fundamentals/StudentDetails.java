package com.codegnan.fundamentals;

import java.util.Scanner;

public class StudentDetails {

	public static void main(String[] args) {
		// TODO Auto-generated metho stub
		System.out.println("Enter a student name");
		Scanner scanner=new  Scanner(System.in);
			String name=scanner.nextLine();
			System.out.println("Enter a roll number");
			int rollnumber=scanner.nextInt();
			System.out.println("Enter a marks");
			int marks=scanner.nextInt();
			System.out.println("Enter a grade");
			char grade=scanner.next().charAt(0);	
			System.out.println("name of the Student:"+name);
			System.out.println("rollno :"+rollnumber);
			System.out.println("grade:"+grade);
		}
	}

