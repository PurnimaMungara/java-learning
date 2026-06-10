package com.codegnan.oop;

public class EmployeeTest {

	public static void main(String[] args) {
	Employee emp=new Employee();
 emp.setDetails("Purnima", 50,000);
 double grossSalary=emp.grossSalary();
 System.out.println("Employee Bassic Salary:"+emp.basicsalary);
 System.out.println("Employee Basic Salary:"+emp.calculateHRA());
 System.out.println("Employee Basic Salary:"+emp.calculateDA());

	}

}
