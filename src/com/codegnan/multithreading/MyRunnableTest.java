package com.codegnan.multithreading;

public class MyRunnableTest {

	public static void main(String[] args) {
		MyRunnable r=new MyRunnable();
		Thread t=new Thread(r);
		t.start();
	r.run();
 for(int i=10;i<20;i++) {
	 System.out.println(i);
 }
	}

}
