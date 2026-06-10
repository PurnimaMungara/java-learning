package com.codegnan.oop;

public class GarbageTest {
	protected void finalize() {
		System.out.println("GC called finalized method");
	}
	public static void main(String[] args) {
GarbageTest obj=new GarbageTest();
obj=null;
System.out.println("Requesting garbage collection");
System.gc();
System.out.println("End of main method");
	// TODO Auto-generated method stub

	}

}
