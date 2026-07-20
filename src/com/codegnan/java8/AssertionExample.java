package com.codegnan.java8;

public class AssertionExample {

	public static void main(String[] args) {
		int studentAge=20;
		assert(studentAge>=30):"age should be lessthan 20";
		System.out.println("Valid Student age:"+studentAge);
	}

}
