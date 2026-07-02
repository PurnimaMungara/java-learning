package com.codegnan.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Person,Integer> h=new HashMap<>();
		h.put(new Person (1,"purni","purnima@gmail"),999);
		h.put(new Person (2,"puorni","purniima@gmail"),111);
		h.put(new Person (3,"priti","prithhnima@gmail"),222);
		h.put(new Person (4,"pooja","poojama@gmail"),33 );
		h.put(new Person (5,"purni","purnima@gmail"),999);
		System.out.println(h);
		System.out.println("Printing Hashmap entities one by one");
		for(Map.Entry<Person,Integer>entry:h.entrySet()) {
			System.out.println(entry.getKey()+"----->"+entry.getValue());
		}
		LinkedHashMap<Person,Integer>h1=new LinkedHashMap<>();
		h1.put(new Person(1,"purni","purnima@gmail"),999);
		h1.put(new Person (2,"puorni","purniima@gmail"),111);
		h1.put(new Person (3,"priti","prithhnima@gmail"),222);
		h1.put(new Person (4,"pooja","poojama@gmail"),33 );
		h1.put(new Person (5,"purni","purnima@gmail"),999);
		System.out.println(h1);
		System.out.println("Printing Hashmap entities one by one");
		for(Map.Entry<Person,Integer>entry:h1.entrySet()) {
			System.out.println(entry.getKey()+"----->"+entry.getValue());
			TreeMap<Person,Integer>h2=new TreeMap<>(new MyComparator());
			h2.put(new Person (1,"purni","purnima@gmail"),999);
			h2.put(new Person (2,"puorni","purniima@gmail"),111);
			h2.put(new Person (3,"priti","prithhnima@gmail"),222);
			h2.put(new Person (4,"pooja","poojama@gmail"),33 );
			h2.put(new Person (5,"purni","purnima@gmail"),999);
			System.out.println(h1);
			System.out.println("Printing Hashmap entities one by one");
			for(Map.Entry<Person,Integer>entry1:h2.entrySet()) {
				System.out.println(entry1.getKey()+"----->"+entry1.getValue());
	}
	}
	

	}

}
