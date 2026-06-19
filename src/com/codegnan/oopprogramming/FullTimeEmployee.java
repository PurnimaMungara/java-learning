package com.codegnan.oopprogramming;

public class FullTimeEmployee extends Employee1 {
	double monthlySalary;

	public FullTimeEmployee(String name, double monthlySalary) {
		super(name);
		this.monthlySalary = monthlySalary;
	}

	@Override
	public double calculateSalary() {
		return monthlySalary;
	}

}