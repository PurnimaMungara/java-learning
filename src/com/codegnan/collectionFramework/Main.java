package com.codegnan.collectionFramework;

import java.util.HashSet;

public class Main {

    public static void main(String[] args) {

        HashSet<Employee> emp = new HashSet<>();

        emp.add(new Employee(111, "Purni", 6000, "Vsp"));
        emp.add(new Employee(222, "Tanu", 7000, "Hyd"));
        emp.add(new Employee(333, "Mahi", 8000, "Vzw"));

        System.out.println(emp);
    }
}
