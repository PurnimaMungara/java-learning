package com.codegnan.collectionFramework;

import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return -o1.getEmpName().compareTo(o2.getEmpName());
		//return -o1.getEmpAddress().compareTo(o2.getEmpAddress());
		//return -Integer.compare(o1.getEmpId(), o2.getEmpId());
		//return -Double.compare(o1.getEmpSalary(), o2.getEmpSalary());
	}

}