package com.codegnan.emp.management.dao;

import java.util.ArrayList;
import java.util.List;

import com.codegnan.emp.management.Exception.EmployeeNotFoundException;
import com.codegnan.emp.management.beans.Employee;

public class EmployeeDaoImpl implements EmployeeDao{
	private List<Employee>employeelist=new ArrayList<>();

	@Override
	public void save(Employee employee) {
	 employeelist.add(employee);
		
	}

	@Override
	public List<Employee> findAll() {
		
		return employeelist;
	}

	@Override
	public Employee findById(int id) throws EmployeeNotFoundException {
		for(Employee e:employeelist) {
		    if(e.getId()==id) {
		    }
		    }
		throw new EmployeeNotFoundException("Employee with id:"+id+"Not Found");
	
	}
	@Override
	public Employee update(Employee employee) throws EmployeeNotFoundException {
		for(int i=0;i<employeelist.size();i++) {
			if(employeelist.get(i).getId()==employee.getId()) {
				employeelist.set(i, employee);
				return employee;
			}
		}
		throw new EmployeeNotFoundException("Employee with id"+employee.getId()+"Not found.cannot update");
	} 

	@Override
	public void deleteById(int id) throws EmployeeNotFoundException {
          boolean found=false;
          for (int i=0;i<employeelist.size();i++) {
        	  if(employeelist.get(i).getId()==id) {
        		  employeelist.remove(i);
        		  found=true;
        		  break;
        	  }
          }
          if(!found) {
        	  throw new EmployeeNotFoundException("Employee with id"+id+"Not Found cannot Delete");
          }
	}

}
