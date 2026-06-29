package com.codegnan.collectionFramework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
public class Employees {
	public static void main(String[] args) {
		
		        Collection<Employee> employeeList = new ArrayList<>();
		        System.out.println("----------- add() -----------");

		        employeeList.add(new Employee(111, "Purni", 6000, "Vsp"));

		        employeeList.add(new Employee(222, "Tanu", 7000, "Hyd"));

		        employeeList.add(new Employee(333, "Mahi", 8000, "Vzw"));

		        System.out.println(employeeList);

		        System.out.println("\n----------- addAll() -----------");

		        Collection<Employee> moreEmployeeList = new ArrayList<>();

		        moreEmployeeList.add(new Employee(444, "Purnima", 9000, "Pune"));

		        moreEmployeeList.add(new Employee(555, "Tanuja", 10000, "Bangalore"));

		        moreEmployeeList.add(new Employee(666, "Mahima", 11000, "Tirupati"));

		        employeeList.addAll(moreEmployeeList);

		        System.out.println(employeeList);
	        System.out.println("\n----------- contains() -----------");
		        System.out.println(  employeeList.contains(new Employee(111, "Purni", 6000, "Vsp")));
		        System.out.println("\n----------- containsAll() -----------");
		        System.out.println(employeeList.containsAll(moreEmployeeList));
		        System.out.println("\n----------- remove() -----------");
		        employeeList.remove(new Employee(111, "Purni", 6000, "Vsp"));
		        System.out.println(employeeList);

		        System.out.println("\n----------- removeAll() -----------");

		        Collection<Employee> removeList = new ArrayList<>();

		        removeList.add(new Employee(444, "Purnima", 9000, "Pune"));

		        removeList.add(new Employee(555, "Tanuja", 10000, "Bangalore"));

		        employeeList.removeAll(removeList);

		        System.out.println(employeeList);

		        System.out.println("\n----------- size() -----------");

		        System.out.println(employeeList.size());

		        System.out.println("\n----------- isEmpty() -----------");

		        System.out.println(employeeList.isEmpty());

		        System.out.println("\n----------- Iterator -----------");

		        Iterator<Employee> itr = employeeList.iterator();

		        while (itr.hasNext()) {

		            System.out.println(itr.next());

		        }

		        System.out.println("\n----------- clear() -----------");

		        employeeList.clear();

		        System.out.println(employeeList);

		        System.out.println("\n----------- isEmpty() after clear -----------");

		        System.out.println(employeeList.isEmpty());

		    }

		
}
