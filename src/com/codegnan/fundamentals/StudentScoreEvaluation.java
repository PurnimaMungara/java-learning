package com.codegnan.fundamentals;

import java.util.Scanner;

public class StudentScoreEvaluation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int s1=scanner.nextInt();
		int s2=scanner.nextInt();
		int s3=scanner.nextInt();
		int total=0;
		total+=s1;
		total+=s2;
		total+=s3;
		int average=total/3;
		boolean isAverage=average>=50;
		boolean isScoresOK=(s1>40)&&(s2>40)&&(s3>40);
		boolean isEligible=isAverage &&  isScoresOK;
		System.out.println(total);
		System.out.println(average);
		System.out.println(isEligible);
		scanner.close();
	}

}
