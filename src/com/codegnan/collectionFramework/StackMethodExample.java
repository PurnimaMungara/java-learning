package com.codegnan.collectionFramework;

import java.util.Stack;

public class StackMethodExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Stack<String> names=new Stack<>();
     names.push("sunny");
     names.push("bunny");
     names.push("vinny");
     names.push("journey");
     System.out.println(names);
     System.out.println(names.pop());
     System.out.println(names.peek());
     System.out.println(names);
     System.out.println(names.search("bunny"));
     
	}

}
