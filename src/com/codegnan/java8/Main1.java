package com.codegnan.java8;

import java.util.function.Predicate;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Predicate<Integer> Test=a->a%2==0;
    System.out.println(Test.test(29));
    System.out.println(Test.test(4));
	}

}
