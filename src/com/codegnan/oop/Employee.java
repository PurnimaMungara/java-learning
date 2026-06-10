package com.codegnan.oop;

public class Employee {
String name;
double basicsalary;
public void setDetails(String n,double salary) {
	name=n;
	basicsalary=salary;
}
public double calculateHRA() {
	return 0.02*basicsalary;
}
public double calculateDA() {
	return 0.10*basicsalary;
}
public double grossSalary() {
	return basicsalary+calculateHRA()+calculateDA();
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

}