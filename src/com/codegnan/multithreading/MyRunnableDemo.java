package com.codegnan.multithreading;

public class MyRunnableDemo {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
		MyRunnable r=new MyRunnable();
		Thread t=new Thread(r);
		System.out.println("Name:"+t.getName()+"------------"+t.getPriority());
		t.setName("Codegnan");
		t.setPriority(10);
		System.out.println("Name:"+t.getName()+"------------"+t.getPriority());
		t.start();
	
	}

}
