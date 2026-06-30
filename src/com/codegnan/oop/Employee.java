package com.codegnan.oop;

public class Employee {
String name;
double basicsalary;
public void setDetails(String n,double salary) {
	name=n;
	basicsalary=salary;
}
public double calculateHRA() {
	return 0.20*basicsalary;
}
public double calculateDA() {
	return 0.10*basicsalary;
}
public double grossSalary() {
	return basicsalary+calculateHRA()+calculateDA();
	
}
}

	