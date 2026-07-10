package com.codegnan.emp.management.service;

import java.util.List;

import com.codegnan.emp.management.Exception.EmployeeNotFoundException;
import com.codegnan.emp.management.beans.Employee;

public interface EmployeeService {

    Employee addEmployee(Employee employee);

    List<Employee> getAllEmployees();

    Employee getEmployeeById(int id) throws EmployeeNotFoundException;

    Employee updateEmployee(Employee employee) throws EmployeeNotFoundException;

    void deleteEmployee(int id) throws EmployeeNotFoundException;
}