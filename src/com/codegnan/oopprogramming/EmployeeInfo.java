package com.codegnan.oopprogramming;

import java.util.Scanner;

public class EmployeeInfo extends Employee {
	double salaryPerYear;

	public EmployeeInfo() {
		super("", "", 0);
	}

	public void inputEmployeeDetails() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Employee Name ");
		employeeName = scanner.nextLine();
		System.out.print("Enter Employee Designation : ");
		designation = scanner.nextLine();
		System.out.print("Enter Years of Experience : ");
		yearsOfExperience = scanner.nextInt();
		System.out.print("Enter Salary Per Year : ");
		salaryPerYear = scanner.nextDouble();
	}

	public void displayEmployeeInfo() {
		System.out.println("Employee Name : " + employeeName);
		System.out.println("Designation : " + designation);
		System.out.println("Years of Experience : " + yearsOfExperience + " years");
	}

	public void calculateSalary() {
		double salary = salaryPerYear * yearsOfExperience;
		System.out.println("Salary $ " + salary);
}

}