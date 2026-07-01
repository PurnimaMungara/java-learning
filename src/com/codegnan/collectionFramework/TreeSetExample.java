package com.codegnan.collectionFramework;

import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> t=new TreeSet<>(new MyComparator());
		t.add("purni");
		t.add("tanu");
		t.add("rajitha");
		t.add("Chandhni");
		t.add("suma");
		System.out.println(t);//0,10,15
	}

}
