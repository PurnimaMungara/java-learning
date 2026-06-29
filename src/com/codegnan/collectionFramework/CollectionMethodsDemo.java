package com.codegnan.collectionFramework;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionMethodsDemo {
	public static void main(String args[]) {
		
	 Collection<String> fruits = new ArrayList<>();
		System.out.println("----------add()-------------");
		fruits.add("apple");
		fruits.add("banana");
		fruits.add("kiwi");
		fruits.add("cherry");
		System.out.println("fruits after add method"+fruits);
		System.out.println("------------addAll()------------");
		Collection <String>moreFruits=new ArrayList<>();
		moreFruits.add("Mango");
		moreFruits.add("Grapes");
		moreFruits.add("orange");
		moreFruits.add("papaya");
		fruits.addAll(moreFruits);
		System.out.println("Fruits after all()"+moreFruits);
		System.out.println("----------------remove()----------");
		fruits.remove("banana");
		System.out.println("Fruits after remove(banana)"+fruits);
		Collection <String >removeList=new ArrayList<String>();
		removeList.add("Mango");
		removeList.add("Grapes");
		removeList.add("orange");
		removeList.add("papaya");
		fruits.removeAll(removeList);
		System.out.println("fruits after removeAll(Mango,cherry,papaya):"+fruits);
		System.out.println("----------retainAll()-----------");
		Collection <String>retainList=new ArrayList<>();
		retainList.add("Apple");
		retainList.add("Grapes");
		retainList.add("orange");
		Collection<String> checkList = new ArrayList<>();
		checkList.add("Apple");
		checkList.add("Grapes");
		System.out.println("contais All (apple,grapes)?"+fruits.containsAll(checkList));
		System.out.println("-----------size------------");
		System.out.println("Number of fruits:"+fruits.size());
		System.out.println("--------------isEmpty-------------");
		System.out.println("Is collection Empty"+fruits.isEmpty());
		System.out.println("----------toArray()---------------");
		Object[] fruitArray=fruits.toArray();
		for(int i=0;i<fruitArray.length;i++) {
			System.out.println(fruitArray[i]+"");
			
		}
		System.out.println();
		System.out.println("---------------Interator()-------------");
		System.out.println("Iterator using interator");
		Iterator<String> itr=fruits.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next()+"");
		}
		System.out.println("\n\n-----clear()-----");
		fruits.clear();
		System.out.println("Fruits after clear()"+fruits);
		System.out.println("IS collection empty after clear()"+fruits.isEmpty());
	}
}

	