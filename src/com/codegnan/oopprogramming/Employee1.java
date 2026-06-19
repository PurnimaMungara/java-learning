package com.codegnan.oopprogramming;

public abstract class Employee1 {
	String name;

	public Employee1(String name) {
		super();
		this.name = name;
	}

	public abstract double calculateSalary();

	public void display() {
		System.out.println("Employee Name : " + name);
	}
}