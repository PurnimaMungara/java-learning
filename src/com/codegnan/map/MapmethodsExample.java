package com.codegnan.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapmethodsExample {

	public static void main(String[] args) {
		
	        Map<String, Integer> studentMarks = new HashMap<>();

	        studentMarks.put("aruna", 87);
	        studentMarks.put("karuna", 97);
	        studentMarks.put("meena", 67);

	        Map<String, Integer> newStudents = new HashMap<>();

	        newStudents.put("meera", 17);
	        newStudents.put("meena", 77);
	        newStudents.put("priyaa", 89);

	        System.out.println("Marks of Aruna: " + studentMarks.get("aruna"));

	        System.out.println("Removed Priyaa marks: " + newStudents.remove("priyaa"));

	        System.out.println("Is meena present: " + studentMarks.containsKey("meena"));

	        System.out.println("Any student scored 100: " + studentMarks.containsValue(100));

	        System.out.println("Is map empty: " + studentMarks.isEmpty());

	        System.out.println("Total students: " + studentMarks.size());

	        Set<String> studentNames = studentMarks.keySet();
	        System.out.println("Student names: " + studentNames);

	        Collection<Integer> marks = studentMarks.values();
	        System.out.println("Marks: " + marks);

	        Set<Map.Entry<String, Integer>> entries = studentMarks.entrySet();

	        System.out.println("All entries:");
	        for (Map.Entry<String, Integer> entry : entries) {
	            System.out.println(entry.getKey() + " -> " + entry.getValue());
	        }
	        studentMarks.clear();
	        System.out.println("Map is Empty:"+studentMarks.isEmpty());
	    
	
	}

}
