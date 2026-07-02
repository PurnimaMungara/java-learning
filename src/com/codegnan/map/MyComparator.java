package com.codegnan.map;

import java.util.Comparator;




public class MyComparator implements Comparator<Person> {

    @Override
    public int compare(Person p1, Person p2) {
        //return p2.getEmail().compareTo(p1.getEmail());
    	return -p1.getName().compareTo(p1.getName());
    }
}
