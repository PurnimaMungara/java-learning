package com.codegnan.oop;

public class Student {
String name;
int[] marks;

public void setDetails(String n,int[] m) {
	name=n;
	marks=m;
}
public int calculateTotal() {
	return marks[0]+marks[1]+marks[3];
}
public double calculateAverage() {
	return calculateTotal()/marks.length;
}
public void dispayDetails() {
	System.out.println("Student name:"+name);
	System.out.println("Total:"+calculateTotal());
	System.out.println("average:"+calculateAverage());
}
}
