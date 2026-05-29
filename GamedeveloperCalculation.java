package com.codegnan.fundamentals;

import java.util.Scanner;

public class GamedeveloperCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int basescore=sc.nextInt();
		int bonus=sc.nextInt();
		basescore+=bonus;
		int total=basescore*2;
		boolean isbasescore=(total>=50) &&(bonus%3==0);
		System.out.println(total);
		System.out.println(isbasescore);
		
		

	}

}
