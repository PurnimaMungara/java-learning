package com.codegnan.Assignment;

import java.util.ArrayList;
import java.util.Scanner;

public class SortingUsingArrayList {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	 ArrayList<String> list=new ArrayList<>();
	 while(sc.hasNext()) {
		 String str=sc.next();
		 if(!str.matches("[a-zA-Z]+")) {
			 break;
		 }
		 list.add(str);
	 }
	 for(String s:list) {
		 System.out.println(s+"");
	 }
	 sc.close();
}
}
