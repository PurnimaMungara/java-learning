package com.codegnan.emp.management.service;



import java.util.List;

import com.codegnan.emp.management.Exception.EmployeeNotFoundException;
import com.codegnan.emp.management.beans.Employee;
import com.codegnan.emp.management.dao.EmployeeDaoImpl;

public class EmployeeServiceImp implements EmployeeService {

    EmployeeDaoImpl employeeDao = new EmployeeDaoImpl();

    @Override
    public Employee addEmployee(Employee employee) {
        employeeDao.save(employee);
        System.out.println("Employee Added: " + employee);
        return employee;
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeDao.findAll();
    }

    @Override
    public Employee getEmployeeById(int id) throws EmployeeNotFoundException {
        return employeeDao.findById(id);
    }

    @Override
    public Employee updateEmployee(Employee employee)
            throws EmployeeNotFoundException {

        return employeeDao.update(employee);
    }

    @Override
    public void deleteEmployee(int id)
            throws EmployeeNotFoundException {

        employeeDao.deleteById(id);
    }
}