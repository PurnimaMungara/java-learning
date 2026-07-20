package com.codegnan.collectionFramework;

import java.util.TreeSet;


public class MultiLevelSortingExample {

    public static void main(String[] args) {

        TreeSet<Employee> treeset = new TreeSet<>(new SalaryNameDepartmentComparator());

        treeset.add(new Employee(111, "Purni", 1300, "hyd"));
        treeset.add(new Employee(111, "Purni", 1300, "hyd"));

        for (Employee e : treeset) {
            System.out.println(e);
        }
    }
}