package com.codegnan.collectionFramework;

import java.util.ArrayList;
import java.util.Scanner;

public class DuplicateRemover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer>number=new ArrayList<>();
		while(sc.hasNextInt()) {
			number.add(sc.nextInt());

		}
		
for(Integer a:number) {
	System.out.println(a+" ");
}
System.out.println();
ArrayList<Integer> uniqueList=new ArrayList();
for(Integer i:number) {
	if(!uniqueList.contains(i)) {
		uniqueList.add(i);
	}
}
for(Integer j:uniqueList) {
	System.out.println(j+" ");
}
	}

}
