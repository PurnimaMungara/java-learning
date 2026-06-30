package com.codegnan.collectionFramework;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list=new ArrayList<>();
		list.add("java");
		list.add("Python");
		list.add("C++");
		ListIterator<String>itr=list.listIterator();
		System.out.println("original List"+list);
		System.out.println("=============Forword Traversal===========");
		while(itr.hasNext()) {
			System.out.println("------------------------");
			System.out.println("next Index"+itr.nextIndex());
			String value=itr.next();
			System.out.println("Element"+value);
			if(value.equals("Python")) {
				itr.set("Python 3");
				System.out.println("Python replaced with python3");
		 
			}
			if(value.equals("C")) {
				itr.set("SQL");
				System.out.println("C replaces with SQL");
			}
			if(value.equals("JavaScript")) {
				itr.remove();
				System.out.println("Javascript removed");
			}
		}
		System.out.println("List After forword traversel");
		System.out.println(list);
		System.out.println("=======BackWord Direction===========");
		while(itr.hasPrevious()) {
			System.out.println("------------------------");
			System.out.println("Previous Index:"+itr.previousIndex());
			System.out.println("Element"+itr.next());
			
		
	}
	System.out.println("\n Final List");
	 System.out.println(list);
}
	}
	
	


