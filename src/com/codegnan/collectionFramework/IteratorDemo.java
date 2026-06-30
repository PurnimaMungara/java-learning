package com.codegnan.collectionFramework;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a=new ArrayList<>();
		for(int i=0;i<=10;i++) {
			a.add(i);
		}
		System.out.println(a);
		Iterator<Integer> itr=a.iterator();
		while(itr.hasNext()) {
			Integer i=itr.next();
			if(i%2==0) {
				System.out.println(i);
			}
			else {
				itr.remove();
			}
		}
		System.out.println(a);
	}

}
