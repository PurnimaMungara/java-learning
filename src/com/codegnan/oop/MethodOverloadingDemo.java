package com.codegnan.oop;

public class MethodOverloadingDemo {
	public void  test()
	{
		System.out.println("No Parameters");
	} 
void test(int a,int b) {
	System.out.println("A and B:"+a+" "+b);
}
void test(double a) {
	System.out.println("inside test(double)a:"+a);
	
}
public static void main(String args[]) {
	MethodOverloadingDemo od=new MethodOverloadingDemo();
	od.test();
	od.test(10,30);
	od.test(26);
}
}
