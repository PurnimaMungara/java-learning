package com.codegnan.collectionFramework;

import java.util.Objects;

public class Employee {
private int empId;
private String empName;
private double empSalary;
private String empAddress;
//no args constructor all -args constructor,getter,setters
@Override
public String toString() {
	return "Employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + ", empAddress="
			+ empAddress + "]";
}
public int getEmpId() {
	return empId;
}
public void setEmpId(int empId) {
	this.empId = empId;
}
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}
public double getEmpSalary() {
	return empSalary;
}
public void setEmpSalary(double empSalary) {
	this.empSalary = empSalary;
}
public String getEmpAddress() {
	return empAddress;
}
@Override
public int hashCode() {
	return Objects.hash(empAddress, empId, empName, empSalary);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Employee other = (Employee) obj;
	return Objects.equals(empAddress, other.empAddress) && empId == other.empId
			&& Objects.equals(empName, other.empName)
			&& Double.doubleToLongBits(empSalary) == Double.doubleToLongBits(other.empSalary);
}
public void setEmpAddress(String empAddress) {
	this.empAddress = empAddress;
}
public Employee(int empId, String empName, double empSalary, String empAddress) {
	super();
	this.empId = empId;
	this.empName = empName;
	this.empSalary = empSalary;
	this.empAddress = empAddress;
}
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
}
