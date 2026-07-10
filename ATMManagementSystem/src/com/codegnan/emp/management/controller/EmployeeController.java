package com.codegnan.emp.management.controller;

import java.util.List;
import java.util.Scanner;

import com.codegnan.emp.management.Exception.EmployeeNotFoundException;
import com.codegnan.emp.management.beans.Employee;
import com.codegnan.emp.management.service.EmployeeService;
import com.codegnan.emp.management.service.EmployeeServiceImp;

public class EmployeeController {

    public static void main(String[] args) {

        EmployeeService service = new EmployeeServiceImp();
        Scanner scanner = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\n========================================");
            System.out.println("      EMPLOYEE MANAGEMENT SYSTEM");
            System.out.println("========================================");
            System.out.println("1. Add Employee");
            System.out.println("2. View All Employees");
            System.out.println("3. Search Employee By Id");
            System.out.println("4. Update Employee");
            System.out.println("5. Delete Employee");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();

            switch (choice) {

            case 1:
                System.out.print("Enter Employee Id: ");
                int id = scanner.nextInt();
                scanner.nextLine(); // consume newline

                System.out.print("Enter Employee Name: ");
                String name = scanner.nextLine();

                System.out.print("Enter Employee Salary: ");
                double salary = scanner.nextDouble();

                service.addEmployee(new Employee(id, name, salary));
                System.out.println("Employee Added Successfully");
                break;

            case 2:
                System.out.println("\n===== All Employees =====");

                List<Employee> employees = service.getAllEmployees();

                if (employees.isEmpty()) {
                    System.out.println("No Employees Found");
                } else {
                    for (Employee emp : employees) {
                        System.out.println(emp);
                    }
                }
                break;

            case 3:
                System.out.print("Enter Employee Id: ");
                int searchId = scanner.nextInt();

                Employee fetchedEmp = null;

                try {
                    fetchedEmp = service.getEmployeeById(searchId);

                    System.out.println("Employee Found: " + fetchedEmp);

                } catch (EmployeeNotFoundException e) {
                    System.out.println("Employee Not Found: " + e.getMessage());
                }

                break;

            case 4:
                System.out.print("Enter Employee Id to Update: ");
                int updateId = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Enter Updated Name: ");
                String updatedName = scanner.nextLine();

                System.out.print("Enter Updated Salary: ");
                double updatedSalary = scanner.nextDouble();

                try {
                    Employee updatedEmp = service.updateEmployee(
                            new Employee(updateId, updatedName, updatedSalary));

                    System.out.println("Employee Updated Successfully: " + updatedEmp);

                } catch (EmployeeNotFoundException e) {
                    System.out.println("Error: " + e.getMessage());
                }

                break;

            case 5:
                System.out.print("Enter Employee Id to Delete: ");
                int deletedId = scanner.nextInt();

                try {
					service.deleteEmployee(deletedId);
				} catch (EmployeeNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                System.out.println("Employee Deleted Successfully");
                break;

            case 6:
                System.out.println("Exiting Application...");
                break;

            default:
                System.out.println("Invalid Choice!");
            }

        } while (choice != 6);

        scanner.close();
    }
}