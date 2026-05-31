package com.codegnan.fundamentals;

import java.util.Scanner;

public class Grademarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter a marks");
 int marks =sc.nextInt();
 char grade=(marks>90)?'A':
	         (marks>80)&&(marks<90)?'B':
	        	 (marks>70)&&(marks<80)?'c':
	        		 (marks>60)&&(marks<70)?'D':
	        			 (marks>50)?'E':'F';
System.out.println("Grade of the student " + grade);
sc.close();
	}
}

