package com.codegnan.fundamentals;

import java.util.Scanner;

public class Palindromestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =   new Scanner(System.in);
		String[] names= {"nani","kusuma","latha","meena","reena"};
		for(String str:String) {
			System.out.println(str+"is"+(ispalindromes(str)?"is a palindrome"?"not a palindrome"));
			
		}
		sc.close();
		

	}

}
